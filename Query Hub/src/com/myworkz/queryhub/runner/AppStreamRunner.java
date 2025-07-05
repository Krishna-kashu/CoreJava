package com.myworkz.queryhub.runner;

import com.myworkz.queryhub.dto.AppDTO;
import com.myworkz.queryhub.dto.AppType;
import com.myworkz.queryhub.repository.AppRepo;
import com.myworkz.queryhub.repository.AppRepoImpl;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

        







    }
}
