package com.mywork.event.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GraduationDTO {
    String studentName;
    String degreeAwarded;
    String collegeName;
    int graduationYear;
    float cgpa;
}
