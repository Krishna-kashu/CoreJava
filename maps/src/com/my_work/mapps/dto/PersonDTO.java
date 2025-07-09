package com.my_work.mapps.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PersonDTO {
    private String name;
    private String type;
    private String aadhaar;
}
