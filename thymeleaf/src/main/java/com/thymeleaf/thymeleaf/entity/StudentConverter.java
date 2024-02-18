package com.thymeleaf.thymeleaf.entity;

import com.thymeleaf.thymeleaf.entity.dto.StudentDTO;
import com.thymeleaf.thymeleaf.entity.model.Student;

public class StudentConverter {

	public static Student toEntity(StudentDTO dto) {
		Student st = new Student();
		st.setId(dto.getId());
		st.setName(dto.getName());
		return st;
	}

	public static StudentDTO toDto(Student entity) {
		StudentDTO dto = new StudentDTO();
		dto.setId(entity.getId());
		dto.setName(entity.getName());
		return dto;
	}

}
