package com.myworkz.queryhub.dto;

import lombok.*;

@EqualsAndHashCode
@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
public class SareeDTO {
    private String material;
    private String name;
    private double cost;
    private String pattern;
    private String color;
    private String occasion;
}
