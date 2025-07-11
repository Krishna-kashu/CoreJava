package com.mywork.nestedweb.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class EducationDTO {
    private String qualification;
    private String university;
    private int passYear;
    private double percentage;
}
