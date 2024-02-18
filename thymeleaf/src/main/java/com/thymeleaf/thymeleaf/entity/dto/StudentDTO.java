package com.thymeleaf.thymeleaf.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {
	private Long id;
    private String firstName;
    private String lastName;
    private String schoolNumber;
    private String className;

}
