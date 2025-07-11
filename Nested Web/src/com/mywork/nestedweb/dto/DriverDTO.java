package com.mywork.nestedweb.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DriverDTO {
    private String name;
    private int age;
    private String license;
    private VehicleDTO vehicle;
}
