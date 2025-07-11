package com.mywork.nestedweb.dto;

/*
1. Create a dto for sweet with info name,price,ingredients:[5],quantity,pack
2. Create a group of 30 sweet using set
3. Maintain Uniqueness with two sweets not having same ingredients
 */


import lombok.*;

import java.util.Arrays;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SweetDTO {
    private String name;
    private String[] ingredients;
    private int quantity;
    private double price;
    private int pack;

    @Override
    public boolean equals(Object obj) {
        if(obj!=null && obj instanceof SweetDTO){
            SweetDTO sweetDTO=(SweetDTO) obj;
            return Arrays.equals(this.ingredients, sweetDTO.ingredients);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(ingredients);
    }
}
