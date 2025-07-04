package com.myworkz.queryhub.runner;

import com.myworkz.queryhub.dto.AppDTO;
import com.myworkz.queryhub.repository.AppRepo;
import com.myworkz.queryhub.repository.AppRepoImpl;
import java.util.List;

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

    }
}
