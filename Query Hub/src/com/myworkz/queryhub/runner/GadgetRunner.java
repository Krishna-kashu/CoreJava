package com.myworkz.queryhub.runner;

import com.myworkz.queryhub.dto.GadgetDTO;
import com.myworkz.queryhub.repository.GadgetRepo;
import com.myworkz.queryhub.repository.GadgetRepoImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GadgetRunner {
    public static void main(String[] args) {

        GadgetRepo gadgetRepo = new GadgetRepoImpl();
        Collection<GadgetDTO> gadgetDTOS = gadgetRepo.findAll();

        System.out.println("************* Using for-each *************");
        for (GadgetDTO gadgetDTO : gadgetDTOS) {
            System.out.println(gadgetDTO);
        }

        System.out.println("************* Using Iterator *************");
        Iterator<GadgetDTO> iterator = gadgetDTOS.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("************* Gadgets priced above ₹30000 *************");
        for (GadgetDTO gadgetDTO : gadgetDTOS) {
            if (gadgetDTO.getPrice() > 30000.0) {
                System.out.println("Premium Gadget: " + gadgetDTO.getName() + " by " + gadgetDTO.getBrand() + " - ₹" + gadgetDTO.getPrice());
            }
        }

        GadgetDTO searchGadget = new GadgetDTO("Laptop", "Dell", false, 8.0, 65000.0);
        System.out.println("\nContains 'Laptop by Dell'? " + gadgetDTOS.contains(searchGadget));


        Collection<GadgetDTO> anotherList = gadgetRepo.findAll();
        System.out.println("Both gadget collections are equal? " + gadgetDTOS.equals(anotherList));


        System.out.println("Is gadget collection empty? " + gadgetDTOS.isEmpty());


        Collection<GadgetDTO> newGadgets = new ArrayList<>();
        newGadgets.add(new GadgetDTO("Tablet", "Samsung", true, 5.0, 30000.0));
        newGadgets.add(new GadgetDTO("Smartwatch", "Garmin", true, 1.5, 18000.0));


        boolean containsAll = gadgetDTOS.containsAll(anotherList);
        System.out.println("Original collection contains all elements of anotherList? " + containsAll);


        gadgetDTOS.addAll(newGadgets);
        System.out.println("After addAll, total gadgets: " + gadgetDTOS.size());


        gadgetDTOS.remove(searchGadget);
        System.out.println("After removing 'Laptop', contains? " + gadgetDTOS.contains(searchGadget));


        gadgetDTOS.removeAll(newGadgets);
        System.out.println("After removeAll(newGadgets), total gadgets: " + gadgetDTOS.size());
    }
}