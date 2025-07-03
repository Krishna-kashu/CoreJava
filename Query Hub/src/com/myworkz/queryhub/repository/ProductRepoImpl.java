package com.myworkz.queryhub.repository;

import com.myworkz.queryhub.dto.ProductDTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductRepoImpl implements ProductRepo{

    @Override
    public List<ProductDTO> findAll() {
        List<ProductDTO> list = new ArrayList<>();
        list.add(new ProductDTO(1, "keyboard", "Electronics", LocalDate.of(2023, 1, 12), "Logitech", 850, 5, 10, 2));
        list.add(new ProductDTO(2, "Mouse", "Electronics", LocalDate.of(2023, 12, 15), "HP", 400, 12, 15, 3));
        list.add(new ProductDTO(3, "Monitor", "Display", LocalDate.of(2023, 5, 9), "Samsung", 12499, 15, 7, 2));
        list.add(new ProductDTO(4, "SSD", "Storage", LocalDate.of(2024, 3, 3), "Kingston", 2999, 8, 5, 5));
        list.add(new ProductDTO(5, "Smartphone", "Electronics", LocalDate.of(2024, 2, 10), "OnePlus", 32999, 10, 15, 2));
        list.add(new ProductDTO(6, "Laptop", "Computing", LocalDate.of(2023, 10, 20), "Dell", 58999, 12, 5, 3));
        list.add(new ProductDTO(7, "Earbuds", "Audio", LocalDate.of(2023, 9, 5), "Realme", 1999, 7, 20, 1));
        list.add(new ProductDTO(8, "Smartwatch", "Wearable", LocalDate.of(2024, 1, 25), "Boat", 2499, 5, 10, 1));
        list.add(new ProductDTO(9, "Router", "Networking", LocalDate.of(2023, 11, 15), "TP-Link", 1499, 9, 8, 3));
        list.add(new ProductDTO(10, "Graphics Card", "Computing", LocalDate.of(2023, 8, 30), "NVIDIA", 45999, 18, 3, 4));
        list.add(new ProductDTO(11, "Webcam", "Accessories", LocalDate.of(2023, 6, 12), "Logitech", 2499, 6, 12, 2));
        list.add(new ProductDTO(12, "Bluetooth Speaker", "Audio", LocalDate.of(2024, 2, 8), "JBL", 3499, 11, 6, 2));
        list.add(new ProductDTO(13, "Desk Lamp", "Home", LocalDate.of(2023, 4, 17), "Philips", 1299, 4, 9, 2));
        list.add(new ProductDTO(14, "Power Bank", "Accessories", LocalDate.of(2023, 5, 21), "Ambrane", 899, 6, 15, 1));

        list.add(new ProductDTO(15, "Gaming Chair", "Furniture", LocalDate.of(2023, 7, 5), "GreenSoul", 7499, 10, 4, 5));
        list.add(new ProductDTO(16, "Printer", "Office", LocalDate.of(2024, 3, 1), "Canon", 6999, 13, 3, 2));
        list.add(new ProductDTO(17, "Hard Drive", "Storage", LocalDate.of(2023, 9, 10), "Seagate", 3999, 7, 7, 3));
        list.add(new ProductDTO(18, "Camera", "Photography", LocalDate.of(2023, 11, 3), "Sony", 59999, 9, 2, 2));
        list.add(new ProductDTO(19, "Tripod", "Photography", LocalDate.of(2024, 1, 14), "Digitek", 1499, 5, 10, 1));

        list.add(new ProductDTO(25, "Water Purifier", "Appliance", LocalDate.of(2024, 2, 1), "Kent", 10499, 15, 4, 4));
        list.add(new ProductDTO(26, "Toaster", "Kitchen", LocalDate.of(2023, 10, 15), "Prestige", 1999, 5, 7, 2));
        list.add(new ProductDTO(27, "Mixer Grinder", "Kitchen", LocalDate.of(2023, 11, 20), "Bajaj", 3499, 6, 6, 3));
        list.add(new ProductDTO(28, "Air Conditioner", "Appliance", LocalDate.of(2023, 3, 15), "Voltas", 32999, 18, 2, 5));
        list.add(new ProductDTO(29, "Ceiling Light", "Home", LocalDate.of(2023, 9, 25), "Syska", 1599, 4, 10, 2));
        list.add(new ProductDTO(30, "Tablet", "Electronics", LocalDate.of(2024, 1, 5), "Lenovo", 17499, 11, 4, 3));
        list.add(new ProductDTO(31, "Electric Kettle", "Kitchen", LocalDate.of(2023, 6, 30), "Morphy Richards", 2499, 7, 8, 2));
        list.add(new ProductDTO(32, "Iron", "Home", LocalDate.of(2023, 5, 25), "Philips", 1499, 3, 12, 1));
        list.add(new ProductDTO(33, "Projector", "Electronics", LocalDate.of(2024, 3, 22), "Epson", 28999, 10, 2, 3));
        list.add(new ProductDTO(34, "Coffee Machine", "Kitchen", LocalDate.of(2023, 11, 11), "Nespresso", 8999, 13, 3, 2));

        list.add(new ProductDTO(20, "Microwave Oven", "Appliance", LocalDate.of(2023, 8, 9), "Samsung", 7499, 14, 5, 4));
        list.add(new ProductDTO(21, "Refrigerator", "Appliance", LocalDate.of(2024, 3, 10), "LG", 20499, 10, 2, 5));
        list.add(new ProductDTO(22, "Washing Machine", "Appliance", LocalDate.of(2023, 6, 5), "Whirlpool", 18499, 12, 3, 4));
        list.add(new ProductDTO(23, "Fan", "Home", LocalDate.of(2023, 7, 19), "Havells", 2699, 8, 6, 2));
        list.add(new ProductDTO(24, "Inverter", "Electronics", LocalDate.of(2023, 5, 12), "Luminous", 8499, 9, 2, 3));

        return list;
    }
}