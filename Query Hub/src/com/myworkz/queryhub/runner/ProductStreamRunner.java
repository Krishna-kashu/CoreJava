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

        System.out.println("\n\n all product if quantity > 5 and sort by id");
        List<ProductDTO> collect1 = list.stream().filter(e -> e.getQuantity() > 5).sorted().collect(Collectors.toList());
        collect1.forEach(System.out::println);

        System.out.println("\n\n only manufacturer of all product");
        List<String> collect2 = list.stream().map(ProductDTO::getManufacturer).collect(Collectors.toList());
        //List<String> collect2 = list.stream().map(ProductDTO::getManufacturer).distinct()collect(Collectors.toList());
        collect2.forEach(System.out::println);

        System.out.println("\n\n get the product with min discount");
        Optional<ProductDTO> min = list.stream().min(Comparator.comparingDouble(ProductDTO::getDiscount));
       // Optional<ProductDTO> min = list.stream().min(Comparator.comparing(ProductDTO::getDiscount));
                min.ifPresent(System.out::println);

        System.out.println("\n\n the product with latest manufacturedDate");
        Optional<ProductDTO> latest = list.stream().max(Comparator.comparing(ProductDTO::getManufacturedDate));
        latest.ifPresent(System.out::println);

        System.out.println("\n\n the product with max costPerItem");
        Optional<ProductDTO> max = list.stream().max(Comparator.comparing(ProductDTO::getCostPerItem));
        max.ifPresent(System.out::println);

    }
}
