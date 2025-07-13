package com.my_work.mapps.dto;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductDTO {
    private String name;
    private String type;
    private double price;
    private String modelNo;
    private int id;

    @Override
    public int hashCode() {
        System.out.println("running hashcode...");
        return Objects.hashCode(name);
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("running equals...");
        if(obj!=null){
            if(obj instanceof ProductDTO){
                ProductDTO product =(ProductDTO) obj;
                return this.name.equalsIgnoreCase(product.name);
            }
        }
        return false;
    }
}
