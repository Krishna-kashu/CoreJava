package com.myworkz.queryhub.runner;

import com.myworkz.queryhub.dto.ApplianceDTO;
import java.util.ArrayList;
import java.util.Collection;

public class ApplianceRunner {
    public static void main(String[] args) {

        ApplianceDTO appliance1 = new ApplianceDTO("Refrigerator", "LG", true, 150.0, 30000.0);
        ApplianceDTO appliance2 = new ApplianceDTO("Washing Machine", "Samsung", true, 500.0, 25000.0);
        ApplianceDTO appliance3 = new ApplianceDTO("Microwave Oven", "IFB", false, 1200.0, 12000.0);
        ApplianceDTO appliance4 = new ApplianceDTO("Air Conditioner", "Voltas", true, 1800.0, 40000.0);
        ApplianceDTO appliance5 = new ApplianceDTO("Ceiling Fan", "Havells", true, 70.0, 3000.0);
        ApplianceDTO appliance6 = new ApplianceDTO("Television", "Sony", true, 100.0, 45000.0);
        ApplianceDTO appliance7 = new ApplianceDTO("Dishwasher", "Bosch", true, 900.0, 35000.0);
        ApplianceDTO appliance8 = new ApplianceDTO("Electric Kettle", "Prestige", false, 1500.0, 1800.0);
        ApplianceDTO appliance9 = new ApplianceDTO("Induction Cooktop", "Philips", true, 2000.0, 5000.0);
        ApplianceDTO appliance10 = new ApplianceDTO("Room Heater", "Usha", false, 1000.0, 2500.0);

        Collection<ApplianceDTO> collection = new ArrayList<>();

        collection.add(appliance1);
        collection.add(appliance2);
        collection.add(appliance3);
        collection.add(appliance4);
        collection.add(appliance5);
        collection.add(appliance6);
        collection.add(appliance7);
        collection.add(appliance8);
        collection.add(appliance9);
        collection.add(appliance10);

        System.out.println("Appliance details:");
        for (ApplianceDTO dto : collection) {
            System.out.println("Brand:"+dto.getBrand()+", Name: " +dto.getName()+", Price: "+dto.getPrice()+", Power Consumption: "+dto.getPowerConsumption());
        }
    }
}
