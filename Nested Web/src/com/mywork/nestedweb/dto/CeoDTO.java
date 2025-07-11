package com.mywork.nestedweb.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CeoDTO {
    private String name;
    private int age;
    private String email;
    private HouseDTO house;
}
