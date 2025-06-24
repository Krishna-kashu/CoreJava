package com.myworkz.queryhub.repository;

import com.myworkz.queryhub.dto.FurnitureDTO;

import java.util.ArrayList;
import java.util.Collection;

public class FurnitureRepoImpl implements FurnitureRepo{

    @Override
    public Collection<FurnitureDTO> findAll() {

        FurnitureDTO furniture1 = new FurnitureDTO("Sofa", "Leather", true, 25.0, 15000.0);
        FurnitureDTO furniture2 = new FurnitureDTO("Dining Table", "Wood", true, 30.5, 20000.0);
        FurnitureDTO furniture3 = new FurnitureDTO("Office Chair", "Plastic", true, 7.5, 5000.0);
        FurnitureDTO furniture4 = new FurnitureDTO("Bookshelf", "Plywood", false, 18.0, 8000.0);
        FurnitureDTO furniture5 = new FurnitureDTO("Bed Frame", "Teak", false, 35.0, 25000.0);
        FurnitureDTO furniture6 = new FurnitureDTO("Coffee Table", "Glass", true, 12.0, 6000.0);
        FurnitureDTO furniture7 = new FurnitureDTO("Wardrobe", "MDF", false, 45.0, 18000.0);
        FurnitureDTO furniture8 = new FurnitureDTO("Study Table", "Engineered Wood", true, 22.0, 10000.0);
        FurnitureDTO furniture9 = new FurnitureDTO("TV Stand", "Metal", true, 15.0, 7000.0);
        FurnitureDTO furniture10 = new FurnitureDTO("Recliner", "Fabric", true, 20.0, 12000.0);

        Collection<FurnitureDTO> collection = new ArrayList<>();
        collection.add(furniture1);
        collection.add(furniture2);
        collection.add(furniture3);
        collection.add(furniture4);
        collection.add(furniture5);
        collection.add(furniture6);
        collection.add(furniture7);
        collection.add(furniture8);
        collection.add(furniture9);
        collection.add(furniture10);
        return collection;
    }
}
