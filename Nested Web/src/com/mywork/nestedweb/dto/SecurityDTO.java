package com.mywork.nestedweb.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SecurityDTO {
    private String name;
    private String shift;
    private boolean armed;
    private JobDTO job;
}
