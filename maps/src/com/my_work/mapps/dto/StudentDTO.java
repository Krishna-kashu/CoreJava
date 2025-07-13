package com.my_work.mapps.dto;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StudentDTO {
    private int rollNo;
    private String name;
    private String grade;

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj!=null && obj instanceof StudentDTO) {
            StudentDTO other = (StudentDTO) obj;
            return this.rollNo == other.rollNo;
        }
        return false;
    }
}
