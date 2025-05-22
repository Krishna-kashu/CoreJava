package com.myproject.smartmart.service;

import com.myproject.smartmart.dto.ProductDTO;
import com.myproject.smartmart.repository.ProductRepo;
import com.myproject.smartmart.repository.ProductRepoImpl;

public class ProductServiceImpl implements ProductService {

    @Override
    public boolean save(ProductDTO dto) {

        if (dto == null) {
            System.out.println(" ProductDTO is null");
            return false;
        }

        boolean valid = true;

        if (dto.getName().length() < 3 || dto.getName().length() > 20) {
            System.out.println("Name must be 3-20 characters");
            valid = false;
        } else {
            System.out.println("Name OK");
        }

        if (dto.getType() == null) {
            System.out.println("Product type is mandatory");
            valid = false;
        } else {
            System.out.println("Type OK");
        }

        if (Integer.parseInt(dto.getIncomingPrice()) <= 1 || Integer.parseInt(dto.getIncomingPrice()) >= 10000) {
            System.out.println("Incoming price must be > 1 and < 10000");
            valid = false;
        } else {
            System.out.println("Incoming price OK");
        }

        if (Integer.parseInt(dto.getSellingPrice()) <= 1 || Integer.parseInt(dto.getSellingPrice()) >= 10000) {
            System.out.println("Selling price must be > 1 and < 10000");
            valid = false;
        } else {
            System.out.println("Selling price OK");
        }

        if (Integer.parseInt(dto.getMrp()) <= 1 || Integer.parseInt(dto.getMrp()) >= 10000) {
            System.out.println("MRP must be > 1 and < 10000");
            valid = false;
        } else {
            System.out.println("MRP OK");
        }

        if (dto.getDescription() == null) {
            System.out.println("Description is mandatory");
            valid = false;
        } else {
            System.out.println("Description OK");
        }

        if (dto.getBrand().length() < 3 || dto.getBrand().length() > 20) {
            System.out.println("Brand must be 3-20 characters");
            valid = false;
        } else {
            System.out.println("Brand OK");
        }

        if (dto.getQuantity() == null) {
            System.out.println("Quantity is mandatory");
            valid = false;

        } else if (Integer.parseInt(dto.getQuantity()) <= 0 || Integer.parseInt(dto.getQuantity()) >= 100) {
            System.out.println("Quantity must be > 0 and < 100");
            valid = false;
        } else {
            System.out.println("Quantity OK");
        }

        if (dto.getManufDate() == null) {
            System.out.println("Manufacture date is mandatory");
            valid = false;
        } else {
            System.out.println("Manufacture date OK");
        }

        if (dto.getWarranty() == null) {
            System.out.println("Warranty is mandatory");
            valid = false;
        } else {
            System.out.println("Warranty OK");
        }

        if (valid) {
            System.out.println("All validations passed — product can be saved");
            ProductRepo productRepo = new ProductRepoImpl();
            boolean saved = productRepo.persist(dto);
            System.out.println("Saved successfully");
            return saved;
        } else {
            System.out.println("Validation failed — product NOT saved");
            return false;
        }
    }
}