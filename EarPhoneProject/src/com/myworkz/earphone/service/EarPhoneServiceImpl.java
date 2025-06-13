package com.myworkz.earphone.service;

import com.myworkz.earphone.dto.EarPhoneDTO;

public class EarPhoneServiceImpl implements EarPhoneService{
    @Override
    public boolean save(EarPhoneDTO earPhoneDTO) {
        if(earPhoneDTO != null){
            String brand = earPhoneDTO.getBrand();
            if(brand.length()>=3 && brand.length()<25){
                System.out.println("Brand name is valid");
            }else{
                System.out.println("name should be between 3 to 25 characters");
            }

            String type = earPhoneDTO.getType();
            if(type.length()>3 && type.length()<15){
                System.out.println("Type is valid");
            }else{
                System.out.println("Type should be between 3 to 15 characters");
            }

            double cost = earPhoneDTO.getCost();
            if(cost >= 200 && cost <5000){
                System.out.println("Valid cost");
            }else{
                System.out.println("cost should be between the range of 200 to 5000");
            }

            String features = earPhoneDTO.getFeatures();
            if(features != null){
                System.out.println("Features Valid");
            }else{
                System.out.println("color should not be null");
            }

            String color = earPhoneDTO.getColor();
            if(color != null){
                System.out.println("color id valid");
            }else{
                System.out.println("color should not be null");
            }

            String warranty = earPhoneDTO.getWarranty();
            if(warranty != null){
                System.out.println("warranty is valid");
            }else{
                System.out.println("warranty should not be null");
            }
        }
        return true;
    }
}
