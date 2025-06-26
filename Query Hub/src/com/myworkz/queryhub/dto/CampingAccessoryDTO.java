package com.myworkz.queryhub.dto;

import lombok.*;

@EqualsAndHashCode
@Getter
@ToString
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CampingAccessoryDTO {
    private String name;
    private String material;
    private boolean waterproof;
    private double weight;
    private double cost;
}
