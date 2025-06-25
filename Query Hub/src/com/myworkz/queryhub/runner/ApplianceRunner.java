package com.myworkz.queryhub.runner;

import com.myworkz.queryhub.dto.ApplianceDTO;
import com.myworkz.queryhub.repository.ApplianceRepo;
import com.myworkz.queryhub.repository.ApplianceRepoImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ApplianceRunner {
    public static void main(String[] args) {

        ApplianceRepo applianceRepo = new ApplianceRepoImpl();
        Collection<ApplianceDTO> appliances = applianceRepo.findAll();

        System.out.println("************* Using for-each *************");
        for (ApplianceDTO dto : appliances) {
            System.out.println(dto);
        }

        System.out.println("************* Using Iterator *************");
        Iterator<ApplianceDTO> iterator = appliances.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("************* Appliances priced above ₹30000 *************");
        for (ApplianceDTO dto : appliances) {
            if (dto.getPrice() > 30000.0) {
                System.out.println("Premium Appliance: " + dto.getName() + " by " + dto.getBrand() + " - ₹" + dto.getPrice());
            }
        }
    }
}
