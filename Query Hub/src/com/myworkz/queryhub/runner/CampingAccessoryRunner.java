package com.myworkz.queryhub.runner;

import com.myworkz.queryhub.dto.CampingAccessoryDTO;

import java.util.ArrayList;
import java.util.Collection;

public class CampingAccessoryRunner {
    public static void main(String[] args) {

        CampingAccessoryDTO accessory1 = new CampingAccessoryDTO("Tent", "Polyester", true, 3.5, 120.0);
        CampingAccessoryDTO accessory2 = new CampingAccessoryDTO("Sleeping Bag", "Nylon", false, 1.2, 60.0);
        CampingAccessoryDTO accessory3 = new CampingAccessoryDTO("Camping Stove", "Stainless Steel", false, 2.0, 80.0);
        CampingAccessoryDTO accessory4 = new CampingAccessoryDTO("Raincoat", "PVC", true, 0.8, 25.5);
        CampingAccessoryDTO accessory5 = new CampingAccessoryDTO("Backpack", "Canvas", false, 1.7, 45.0);
        CampingAccessoryDTO accessory6 = new CampingAccessoryDTO("Water Bottle", "Aluminum", true, 0.6, 15.0);
        CampingAccessoryDTO accessory7 = new CampingAccessoryDTO("Lantern", "Plastic", false, 1.1, 30.0);
        CampingAccessoryDTO accessory8 = new CampingAccessoryDTO("Camping Chair", "Steel & Fabric", false, 3.2, 50.0);
        CampingAccessoryDTO accessory9 = new CampingAccessoryDTO("Tarp", "Polyethylene", true, 2.8, 35.0);
        CampingAccessoryDTO accessory10 = new CampingAccessoryDTO("Hiking Boots", "Leather", true, 1.5, 95.0);

        Collection<CampingAccessoryDTO> collection = new ArrayList<>();
        collection.add(accessory1);
        collection.add(accessory2);
        collection.add(accessory3);
        collection.add(accessory4);
        collection.add(accessory5);
        collection.add(accessory6);
        collection.add(accessory7);
        collection.add(accessory8);
        collection.add(accessory9);
        collection.add(accessory10);

        System.out.println("Camping accessory details:");
        for(CampingAccessoryDTO accessoryDTO : collection){
            System.out.println(accessoryDTO);
        }
    }
}
