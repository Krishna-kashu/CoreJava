package com.mywork.nestedweb.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PassportDTO {
    private String passportNo;
    private String nationality;
    private int expiryYear;
    private CountryDTO country;
}
