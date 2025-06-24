package com.myworkz.queryhub.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class FurnitureDTO {

    private String type;
    private String material;
    private boolean assembled;
    private double weight;
    private double price;
}