package com.myworkz.queryhub.runner;

import com.myworkz.queryhub.dto.FanDTO;
import com.myworkz.queryhub.repository.FanRepo;
import com.myworkz.queryhub.repository.FanRepoImpl;

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
    }
}
