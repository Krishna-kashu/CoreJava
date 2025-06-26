package com.myworkz.queryhub.runner;

import com.myworkz.queryhub.dto.FanDTO;
import com.myworkz.queryhub.repository.FanRepo;
import com.myworkz.queryhub.repository.FanRepoImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class FanRunner {
    public static void main(String[] args) {
        FanRepo fanRepo = new FanRepoImpl();
        Collection<FanDTO> fanDTOS = fanRepo.findAll();

        System.out.println("\n************* Using for-each *************\n");
        for (FanDTO fanDTO : fanDTOS) {
            System.out.println(fanDTO);
        }

        System.out.println("\n************* Using Iterator *************\n");
        Iterator<FanDTO> iterator = fanDTOS.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\n************* Fans priced above 5000 *************\n");
        for (FanDTO fanDTO : fanDTOS) {
            if (fanDTO.getCost() > 5000.0) {
                System.out.println("\nPremium Fan: " + fanDTO.getBrand() + " - ₹" + fanDTO.getCost());
            }
        }


        FanDTO searchFan = new FanDTO("Orient Aeroquiet", "Black", 1500, "1.5 year");
        System.out.println("\nContains 'Orient Aeroquiet'? " + fanDTOS.contains(searchFan));


        Collection<FanDTO> anotherList = fanRepo.findAll();
        System.out.println("Both collections are equal? " + fanDTOS.equals(anotherList));

        System.out.println("Is the fan collection empty? " + fanDTOS.isEmpty());

        Collection<FanDTO> newFans = new ArrayList<>();
        newFans.add(new FanDTO("Crompton HighSpeed", "White", 2200, "3 years"));
        newFans.add(new FanDTO("Atomberg Renesa", "Brown", 4600, "6 months"));

        boolean containsAll = fanDTOS.containsAll(anotherList);
        System.out.println("Original collection contains all elements of anotherList? " + containsAll);

        fanDTOS.addAll(newFans);
        System.out.println("After addAll, total fans: " + fanDTOS.size());

        fanDTOS.remove(searchFan);
        System.out.println("After removing 'Orient Aeroquiet', contains? " + fanDTOS.contains(searchFan));
    }

}
