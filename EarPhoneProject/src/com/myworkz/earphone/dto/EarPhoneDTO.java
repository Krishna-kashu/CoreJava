package com.myworkz.earphone.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EarPhoneDTO {
    private String brand;
    private String type;
    private double cost;
    private String features;
    private String color;
    private String warranty;
}
