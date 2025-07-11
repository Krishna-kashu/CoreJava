package com.mywork.nestedweb.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class JobDTO {
    private String role;
    private String experience;
    private double salary;
    private DetailsDTO details;
}
