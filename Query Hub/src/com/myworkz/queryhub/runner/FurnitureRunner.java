package com.myworkz.queryhub.runner;

import com.myworkz.queryhub.dto.FurnitureDTO;
import com.myworkz.queryhub.repository.FurnitureRepo;
import com.myworkz.queryhub.repository.FurnitureRepoImpl;

import java.util.ArrayList;
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

        FurnitureDTO searchItem = new FurnitureDTO("Dining Table", "Teak Wood", true, 25.0, 15000.0);
        System.out.println("\nContains 'Dining Table'? " + furnitureDTOs.contains(searchItem));


        Collection<FurnitureDTO> anotherList = furnitureRepo.findAll();
        System.out.println("Both collections are equal? " + furnitureDTOs.equals(anotherList));


        System.out.println("Is furniture collection empty? " + furnitureDTOs.isEmpty());


        Collection<FurnitureDTO> newFurniture = new ArrayList<>();
        newFurniture.add(new FurnitureDTO("Bookshelf", "Engineered Wood", false, 20.0, 8500.0));
        newFurniture.add(new FurnitureDTO("Office Chair", "Mesh", true, 10.0, 5500.0));


        boolean containsAll = furnitureDTOs.containsAll(anotherList);
        System.out.println("Original collection contains all elements of anotherList? " + containsAll);


        furnitureDTOs.addAll(newFurniture);
        System.out.println("After addAll, total furniture count: " + furnitureDTOs.size());


        furnitureDTOs.remove(searchItem);
        System.out.println("After removing 'Dining Table', contains? " + furnitureDTOs.contains(searchItem));


        furnitureDTOs.removeAll(newFurniture);
        System.out.println("After removeAll(newFurniture), total count: " + furnitureDTOs.size());
    }
}