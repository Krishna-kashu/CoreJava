package com.myworkz.queryhub.dto;

import java.time.LocalDate;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO implements Comparable <ProductDTO>{

    private  int id;
    private String name;
    private String type;
    private LocalDate manufacturedDate;
    private String manufacturer;
    private double costPerItem;
    private double discount;
    private int quantity;
    private int warranty;

    @Override
    public int compareTo(ProductDTO o) {

        ProductDTO leftObject = this;
        if(leftObject.id > o.id){
            return 3;
        }else if(leftObject.id < o.id){
            return -3;
        }
        return 0;
    }
}
