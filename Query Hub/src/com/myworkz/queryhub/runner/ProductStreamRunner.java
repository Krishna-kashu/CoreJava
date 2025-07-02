package com.myworkz.queryhub.runner;

import com.myworkz.queryhub.dto.ProductDTO;
import com.myworkz.queryhub.repository.ProductRepo;
import com.myworkz.queryhub.repository.ProductRepoImpl;

import java.util.List;

public class ProductStreamRunner {
    public static void main(String[] args) {
        ProductRepo productRepo = new ProductRepoImpl();
        List<ProductDTO> list = productRepo.findAll();

        System.out.println("******** All products ********");
        list.forEach(System.out::println);
    }
}
