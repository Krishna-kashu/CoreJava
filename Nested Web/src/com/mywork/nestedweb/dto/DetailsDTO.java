package com.mywork.nestedweb.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DetailsDTO {
    private String id;
    private String skills;
    private EducationDTO education;
    private String department;
}
