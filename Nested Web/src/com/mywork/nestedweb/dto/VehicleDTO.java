package com.mywork.nestedweb.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class VehicleDTO {
    private String number;
    private String type;
    private int year;
    private CompanyDTO company;
}
