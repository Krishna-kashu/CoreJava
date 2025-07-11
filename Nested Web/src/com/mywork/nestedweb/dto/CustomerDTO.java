package com.mywork.nestedweb.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {
    private String name;
    private String email;
    private int age;
    private PassportDTO passport;
}

