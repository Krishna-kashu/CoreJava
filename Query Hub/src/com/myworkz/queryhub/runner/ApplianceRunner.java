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


        ApplianceDTO search = new ApplianceDTO("Ceiling Fan", "Havells", true, 70.0, 3000.0);
        System.out.println("Contains 'Ceiling Fan'? " + appliances.contains(search));


        Collection<ApplianceDTO> anotherList = applianceRepo.findAll();
        System.out.println("Both collections are equal? " + appliances.equals(anotherList));


        System.out.println("Is the appliance collection empty? " + appliances.isEmpty());


        Collection<ApplianceDTO> newAppliances = new ArrayList<>();
        newAppliances.add(new ApplianceDTO("Smart Speaker", "Amazon", true, 10.0, 4500.0));
        newAppliances.add(new ApplianceDTO("Air Purifier", "Dyson", true, 200.0, 55000.0));


        boolean containsAll = appliances.containsAll(anotherList);
        System.out.println("Original collection contains all elements of anotherList? " + containsAll);


        appliances.addAll(newAppliances);
        System.out.println("After addAll, total appliances: " + appliances.size());


        appliances.remove(search);
        System.out.println("After removing 'Ceiling Fan', contains? " + appliances.contains(search));


        appliances.removeAll(newAppliances);
        System.out.println("After removeAll (newAppliances), total appliances: " + appliances.size());

 }
}
