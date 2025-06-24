package com.myworkz.queryhub.repository;

import com.myworkz.queryhub.dto.GadgetDTO;

import java.util.ArrayList;
import java.util.Collection;

public class GadgetRepoImpl implements  GadgetRepo{
    @Override
    public Collection<GadgetDTO> findAll() {
        Collection<GadgetDTO> gadgets = new ArrayList<>();

        GadgetDTO gadget1 = new GadgetDTO("Smartphone", "Apple", true, 20.0, 90000.0);
        GadgetDTO gadget2 = new GadgetDTO("Smartwatch", "Samsung", true, 48.0, 25000.0);
        GadgetDTO gadget3 = new GadgetDTO("Bluetooth Speaker", "JBL", true, 10.0, 5000.0);
        GadgetDTO gadget4 = new GadgetDTO("Wireless Earbuds", "boAt", true, 6.0, 1500.0);
        GadgetDTO gadget5 = new GadgetDTO("Tablet", "Lenovo", false, 12.0, 30000.0);
        GadgetDTO gadget6 = new GadgetDTO("Laptop", "Dell", false, 8.0, 65000.0);
        GadgetDTO gadget7 = new GadgetDTO("Portable Charger", "Mi", false, 0.0, 1200.0);
        GadgetDTO gadget8 = new GadgetDTO("VR Headset", "Meta", true, 4.0, 40000.0);
        GadgetDTO gadget9 = new GadgetDTO("Digital Camera", "Canon", false, 5.0, 55000.0);
        GadgetDTO gadget10 = new GadgetDTO("Fitness Band", "Noise", true, 72.0, 3000.0);

        gadgets.add(gadget1);
        gadgets.add(gadget2);
        gadgets.add(gadget3);
        gadgets.add(gadget4);
        gadgets.add(gadget5);
        gadgets.add(gadget6);
        gadgets.add(gadget7);
        gadgets.add(gadget8);
        gadgets.add(gadget9);
        gadgets.add(gadget10);

        return gadgets;
    }
}
