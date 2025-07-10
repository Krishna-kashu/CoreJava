package com.my_work.mapps.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BrandDTO {
    private String name;
    private String originCountry;
    private int foundingYear;
}