package com.myworkz.queryhub.dto;

import lombok.*;

@EqualsAndHashCode
@NoArgsConstructor
@Setter
@Getter
@ToString
@AllArgsConstructor
public class FanDTO {
    private String brand;
    private String color;
    private int cost;
    private String warranty;
}