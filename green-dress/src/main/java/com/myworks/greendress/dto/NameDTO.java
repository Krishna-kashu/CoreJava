package com.myworks.greendress.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class NameDTO {
    private String firstname;
    private String lastname;
    private String middlename;
    private String displayname;
}
