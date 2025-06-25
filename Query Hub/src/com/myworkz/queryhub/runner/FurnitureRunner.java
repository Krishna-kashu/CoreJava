package com.myworkz.queryhub.runner;

import com.myworkz.queryhub.dto.FurnitureDTO;
import com.myworkz.queryhub.repository.FurnitureRepo;
import com.myworkz.queryhub.repository.FurnitureRepoImpl;

import java.util.Collection;
import java.util.Iterator;

public class FurnitureRunner {
    public static void main(String[] args) {
        FurnitureRepo furnitureRepo = new FurnitureRepoImpl();
        Collection<FurnitureDTO> furnitureDTOs = furnitureRepo.findAll();

        System.out.println("\n************* Using for-each *************\n");
        for (FurnitureDTO furnitureDTO : furnitureDTOs) {
            System.out.println(furnitureDTO);
        }

        System.out.println("\n************* Using Iterator *************\n");
        Iterator<FurnitureDTO> iterator = furnitureDTOs.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\n************* Furniture priced above ₹10000 *************\n");
        for (FurnitureDTO furnitureDTO : furnitureDTOs) {
            if (furnitureDTO.getPrice() > 10000.0) {
                System.out.println("Premium Furniture: " + furnitureDTO.getType() + " - ₹" + furnitureDTO.getPrice());
            }
        }
    }
}