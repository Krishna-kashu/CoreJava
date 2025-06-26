package com.myworkz.queryhub.dto;


import lombok.*;

@EqualsAndHashCode
@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
public class ApplianceDTO {
    private String name;
    private String brand;
    private boolean energyEfficient;
    private double powerConsumption;
    private double price;
}