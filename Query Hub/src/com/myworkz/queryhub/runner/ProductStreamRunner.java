package com.myworkz.queryhub.runner;

import com.myworkz.queryhub.dto.ProductDTO;
import com.myworkz.queryhub.repository.ProductRepo;
import com.myworkz.queryhub.repository.ProductRepoImpl;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ProductStreamRunner {
    public static void main(String[] args) {
        ProductRepo productRepo = new ProductRepoImpl();
        List<ProductDTO> list = productRepo.findAll();

        System.out.println("\n******** All products ********");
        list.forEach(System.out::println);

        System.out.println("\n\n all name's of the product");
        list.stream().map(ProductDTO::getName).forEach(System.out::println);

        System.out.println("\n\n all product where discount is greater than 10 %");
        list.stream().filter(a -> a.getDiscount()>10).forEach(System.out::println);

        System.out.println("\n\n all product if warranty less than 3");
        List<ProductDTO> collect = list.stream().filter(e -> e.getWarranty() < 3).collect(Collectors.toList());
        collect.forEach(System.out::println);

        System.out.println("\n\n all product by id asc");
        list.stream().sorted().forEach(System.out::println);



    }
}
