package com.my_work.mapps.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CityDTO {
    private String name;
    private long population;
    private boolean isCapital;
}
