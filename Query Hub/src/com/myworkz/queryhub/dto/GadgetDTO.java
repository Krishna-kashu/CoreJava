package com.myworkz.queryhub.dto;

import lombok.*;

@EqualsAndHashCode
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class GadgetDTO {
    private String name;
    private String brand;
    private boolean wireless;
    private double batteryLife;
    private double price;
}