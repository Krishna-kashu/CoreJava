package com.my_work.mapps.dto;

import lombok.*;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CountryDTO {
    private String name;
    private String continent;
    private int populationInMillions;

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj!=null && obj instanceof CountryDTO) {
            CountryDTO other =(CountryDTO) obj;
            return this.name.equalsIgnoreCase(other.name);
        }
        return false;
    }
}
