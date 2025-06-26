package com.myworkz.queryhub.runner;

import com.myworkz.queryhub.dto.CampingAccessoryDTO;
import com.myworkz.queryhub.repository.CampingAccessoryRepo;
import com.myworkz.queryhub.repository.CampingAccessoryRepoImpl;

import java.util.ArrayList;
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
        CampingAccessoryDTO newOne = new CampingAccessoryDTO("Fire Starter", "Magnesium", true, 0.2, 10.0);
        System.out.println("Contains Fire Starter ?"+accessoryDTOS.contains(newOne));

        Collection<CampingAccessoryDTO> anotherList = campingAccessoryRepo.findAll();
        System.out.println("Both collections are equal? " + accessoryDTOS.equals(anotherList));

        System.out.println("Is the camping accessory collection empty? " + accessoryDTOS.isEmpty());

        Collection<CampingAccessoryDTO> newAccessories = new ArrayList<>();
        newAccessories.add(new CampingAccessoryDTO("Portable Shower", "Plastic", false, 1.3, 35.0));
        newAccessories.add(new CampingAccessoryDTO("Thermal Blanket", "Mylar", true, 0.3, 12.0));

        boolean containsAll = accessoryDTOS.containsAll(anotherList);
        System.out.println("Original collection contains all elements of anotherList? " + containsAll);

        accessoryDTOS.addAll(newAccessories);
        System.out.println("After addAll, total accessories: " + accessoryDTOS.size());

        accessoryDTOS.remove(newOne);
        System.out.println("After removing 'Fire Starter', contains? " + accessoryDTOS.contains(newOne));

    }
}
