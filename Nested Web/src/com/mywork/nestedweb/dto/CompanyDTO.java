package com.mywork.nestedweb.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CompanyDTO {
    private String name;
    private String sector;
    private int established;
    private CeoDTO ceo;
}
