package com.myproject.smartmart.repository;

import com.myproject.smartmart.dto.ProductDTO;

public class ProductRepoImpl implements ProductRepo{

    public  ProductRepoImpl(){
        System.out.println("no-arg constructor of ProductRepoImpl");
    }
    @Override
    public boolean persist(ProductDTO productDTO) {
        if(productDTO!=null){
            System.out.println("productDTO is not null");
        }else{
            System.out.println("productDTO is null");
        }
        System.out.println("persist method in ProductRepoImpl");
        return true;
    }
}
