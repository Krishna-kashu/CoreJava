package com.myworkz.queryhub.runner;

import com.myworkz.queryhub.dto.SareeDTO;
import com.myworkz.queryhub.repository.SareeRepo;
import com.myworkz.queryhub.repository.SareeRepoImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SareeRunner {
    public static void main(String[] args) {

        SareeRepo sareeRepo = new SareeRepoImpl();
        Collection<SareeDTO> sareeDTOS = sareeRepo.findAll();

        System.out.println("************* Using for-each *************");
        for (SareeDTO sareeDTO : sareeDTOS) {
            System.out.println(sareeDTO);
        }

        System.out.println("************* Using Iterator *************");
        Iterator<SareeDTO> iterator = sareeDTOS.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("************* Sarees priced above 3000 *************");
        for (SareeDTO sareeDTO : sareeDTOS) {
            if (sareeDTO.getCost() > 3000.0) {
                System.out.println("Premium Saree: " + sareeDTO.getName() + " - ₹" + sareeDTO.getCost());
            }
        }
        SareeDTO searchSaree = new SareeDTO("Tussar Silk", "Tribal Threads", 2799.00, "Tribal Motifs", "Beige-Brown", "Cultural");
        System.out.println("\nContains 'Tussar Silk'? " + sareeDTOS.contains(searchSaree));


        Collection<SareeDTO> anotherList = sareeRepo.findAll();
        System.out.println("Both saree collections are equal? " + sareeDTOS.equals(anotherList));

        System.out.println("Is saree collection empty? " + sareeDTOS.isEmpty());


        Collection<SareeDTO> newSarees = new ArrayList<>();
        newSarees.add(new SareeDTO("Chiffon", "FabIndia", 1800.0, "Plain", "Sky Blue", "Daily Wear"));
        newSarees.add(new SareeDTO("Kanchipuram", "Silk House", 9500.0, "Temple Border", "Gold-Red", "Wedding"));


        boolean containsAll = sareeDTOS.containsAll(anotherList);
        System.out.println("Original collection contains all elements of anotherList? " + containsAll);


        sareeDTOS.addAll(newSarees);
        System.out.println("After addAll, total sarees: " + sareeDTOS.size());


        sareeDTOS.remove(searchSaree);
        System.out.println("After removing 'Tussar Silk', contains? " + sareeDTOS.contains(searchSaree));


        sareeDTOS.removeAll(newSarees);
        System.out.println("After removeAll(newSarees), total sarees: " + sareeDTOS.size());

    }
}
