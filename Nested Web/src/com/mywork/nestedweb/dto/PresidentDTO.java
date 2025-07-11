package com.mywork.nestedweb.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PresidentDTO {
    private String name;
    private int age;
    private String gender;
    private DriverDTO driver;
}
