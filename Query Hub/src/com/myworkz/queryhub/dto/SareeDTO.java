package com.myworkz.queryhub.dto;

import lombok.*;

@EqualsAndHashCode
@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
public class SareeDTO implements Comparable<SareeDTO>{
    private String material;
    private String name;
    private double cost;
    private String pattern;
    private String color;
    private String occasion;


    @Override
    public int compareTo(SareeDTO o) {
        System.out.println("Running compareTo");
        SareeDTO leftSide = this;
//        SareeDTO rightSide = o;
        if(leftSide.cost >o.cost){
            return  -6;
        }else if(leftSide.cost < o.cost){
            return 5;
        }
        return 0;
    }
}
