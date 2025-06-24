package com.myworkz.queryhub.runner;

import com.myworkz.queryhub.dto.CampingAccessoryDTO;
import com.myworkz.queryhub.repository.CampingAccessoryRepo;
import com.myworkz.queryhub.repository.CampingAccessoryRepoImpl;

import java.util.Collection;
import java.util.Iterator;

public class CampingAccessoryRunner {
    public static void main(String[] args) {

        CampingAccessoryRepo campingAccessoryRepo = new CampingAccessoryRepoImpl();
        Collection<CampingAccessoryDTO> accessoryDTOS = campingAccessoryRepo.findAll();


        System.out.println("************* using for each ************");
        for (CampingAccessoryDTO accessoryDTO : accessoryDTOS) {
            System.out.println("Name: " + accessoryDTO.getName() + ", Cost" + accessoryDTO.getCost() + ", Weight: " + accessoryDTO.getWeight());
        }

        System.out.println("************* using Iterator ************");
        Iterator<CampingAccessoryDTO> iterator = accessoryDTOS.iterator();
        while (iterator.hasNext()) {
            CampingAccessoryDTO campingAccessoryDTO =  iterator.next();
            System.out.println(campingAccessoryDTO);
        }
        System.out.println("Waterproof Accessories");
        for (CampingAccessoryDTO accessory : accessoryDTOS) {
            if (accessory.isWaterproof()) {
                System.out.println("Waterproof: " + accessory.getName() + " (" + accessory.getMaterial() + ")");
            }
        }
    }
}
