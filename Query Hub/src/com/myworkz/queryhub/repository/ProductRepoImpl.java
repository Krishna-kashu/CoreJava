package com.myworkz.queryhub.repository;

import com.myworkz.queryhub.dto.ProductDTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductRepoImpl implements ProductRepo{

    @Override
    public List<ProductDTO> findAll() {
        List<ProductDTO> list = new ArrayList<>();
        list.add(new ProductDTO(1, "keyboard", "Electronics", LocalDate.of(2023, 1, 12), "Logitech", 850, 5, 10, 2));
        list.add(new ProductDTO(2, "Mouse", "Electronics", LocalDate.of(2023, 12, 15), "HP", 400, 12, 15, 3));
        list.add(new ProductDTO(3, "Monitor", "Display", LocalDate.of(2023, 5, 9), "Samsung", 12499, 15, 7, 2));
        list.add(new ProductDTO(4, "SSD", "Storage", LocalDate.of(2024, 3, 3), "Kingston", 2999, 8, 5, 5));

        return list;
    }
}