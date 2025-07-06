package com.myworkz.queryhub.runner;

import com.myworkz.queryhub.dto.AppDTO;
import com.myworkz.queryhub.dto.AppOwner;
import com.myworkz.queryhub.dto.AppType;
import com.myworkz.queryhub.dto.AppVersion;
import com.myworkz.queryhub.repository.AppRepo;
import com.myworkz.queryhub.repository.AppRepoImpl;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

import static sun.rmi.transport.TransportConstants.Version;

public class AppStreamRunner {
    public static void main(String[] args) {
        AppRepo appRepo = new AppRepoImpl();
        List<AppDTO> appDTOs = appRepo.findAll();

        appDTOs.forEach(System.out::println);

        System.out.println("++++++++++++++++++++++++++++++++++++++\n\n Free applications\n\n");
        appDTOs.stream().filter(e -> !e.isFree()).forEach(System.out::println);

        System.out.println("=================\n\n owner name and mail\n");
        appDTOs.stream()
                .flatMap(app -> app.getOwner().stream())
                .map(owner -> owner.getName() + " - " + owner.getEmail())
                .distinct()
                .forEach(System.out::println);

        System.out.println("\n\n================= Instagram app owner's name and email ==============");
/*        appDTOs.stream()
                  .filter(app -> app.getName().equalsIgnoreCase("Instagram"))
                  .flatMap(app -> app.getOwner().stream())
                  .map(AppOwner::getName)
                  .forEach(System.out::println);
        */

        appDTOs.stream()
                .filter(app -> app.getName().equalsIgnoreCase("Instagram"))
                .map(AppDTO::getOwner)
                .forEach(System.out::println);

        System.out.println("\n\n================= Application of type STREAMING ==============");
        List<AppDTO> games = appDTOs.stream()
                .filter(app -> app.getType() == AppType.STREAMING)
                .collect(Collectors.toList());
        games.forEach(System.out::println);

        System.out.println("\n\n chargePerUSer by application name\n");
        double charge = appDTOs.stream()
                .filter(app -> app.getName().equals("App10"))
                .map(AppDTO::getCostPerPerson)
                .findFirst().orElse(0.0);
        System.out.println(charge);
        System.out.println("\n\n 3. Find all by created date and order in desc order\n");
        List<AppDTO> sortedByDate = appDTOs.stream()
                .sorted(Comparator.comparing(AppDTO::getReleaseDate).reversed())
                .collect(Collectors.toList());
        System.out.println(sortedByDate);

        System.out.println("\n\n 4. Sort all applications by Size in Desc order\n");
        appDTOs.sort(Comparator.comparing(AppDTO::getSize).reversed());

        System.out.println("\n\n 5. Find the version by name,type\n\n");
        List<AppDTO> sorted = appDTOs.stream()
                .sorted(Comparator.comparing(AppDTO::getSize).reversed())
                .collect(Collectors.toList());
        System.out.println(sorted);

        System.out.println("\n\n 6. Find all applications by ownerName\n");
        List<AppDTO> result = appDTOs.stream()
                .filter(app -> app.getOwner().equals("John"))
                .collect(Collectors.toList());
        System.out.println(result);

        System.out.println("\n\n 7. Find Owner's by application name\n");
        Optional<AppOwner> owner = appDTOs.stream()
                .filter(app -> app.getName().equalsIgnoreCase("Instagram"))
                .map(app -> app.getOwner().get(0))  // Get first owner
                .findFirst();
        System.out.println(owner);

        System.out.println("\n\n 8. Find all owner email's\n");
        List<String> emails = appDTOs.stream()
                .map(app -> app.getOwner().get(0).getEmail())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(emails);

        System.out.println("\n\n 9. Find all owner name and email by type and version\n");
        List<String> info = appDTOs.stream()
                .filter(app -> app.getType() == AppType.STREAMING && app.getVersion() == AppVersion.V2_0)
                .map(app -> app.getOwner().get(0).getName() + " - " + app.getOwner().get(0).getEmail())
                .collect(Collectors.toList());
        System.out.println(info);

        System.out.println("\n\n 10. Find all application by Created Date\n");
        LocalDate date = LocalDate.of(2023, 1, 1);
        List<AppDTO> result1 = appDTOs.stream()
                .filter(app -> app.getReleaseDate().equals(date))
                .collect(Collectors.toList());
        System.out.println(result1);

        System.out.println("\n\n 11. Add a application by index\n");
        appDTOs.add(3, new AppDTO("Aarogya Setu", AppType.HEALTH, AppVersion.V2_0, LocalDate.of(2023, 7, 28), 52.1, true, 0.0,
                Arrays.asList(new AppOwner("Government of India", "support@aarogyasetu.gov.in"))));

        System.out.println("\n\n 12. Remove an application by index\n");
        appDTOs.remove(3);

        System.out.println("\n\n 13. Get owner by Index\n");
        AppOwner owner1 = appDTOs.get(5).getOwner().get(0);
        System.out.println(owner1);

        System.out.println("\n\n 14. set application by index\n");
        appDTOs.set(5, new AppDTO("JioTV", AppType.STREAMING, AppVersion.V3_0, LocalDate.of(2023, 9, 15), 95.7, true, 0.0,
                Arrays.asList(new AppOwner("Reliance Jio", "support@jio.com"))));

        System.out.println("\n\n 15 Replace owner by application name\n");
        ListIterator<AppDTO> iterator = appDTOs.listIterator();
        while (iterator.hasNext()) {
            AppDTO app = iterator.next();
            if (app.getName().equals("ShareChat")) {
                app.setOwner(Arrays.asList(new AppOwner("Ankush Sachdeva", "support@sharechat.com"), new AppOwner("Ankush Sachdeva", "contact@sharechat.co"), new AppOwner("Farid Ahsan","support@sharechat.com")));
            }
        }
    }
}
