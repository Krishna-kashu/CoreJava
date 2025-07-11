package com.mywork.nestedweb.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CountryDTO {
    private String name;
    private String continent;
    private long population;
    private PresidentDTO presidentDTO;
}
