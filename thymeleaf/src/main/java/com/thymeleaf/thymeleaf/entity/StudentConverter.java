package com.thymeleaf.thymeleaf.entity;

import com.thymeleaf.thymeleaf.entity.dto.StudentDTO;
import com.thymeleaf.thymeleaf.entity.model.Student;

public class StudentConverter {

	 public static Student toEntity(StudentDTO dto) {
	        Student student = new Student();
	        student.setId(dto.getId());
	        student.setFirstName(dto.getFirstName());
	        student.setLastName(dto.getLastName());
	        student.setSchoolNumber(dto.getSchoolNumber());
	        student.setClassName(dto.getClassName());
	        return student;
	    }

	    public static StudentDTO toDto(Student entity) {
	        StudentDTO dto = new StudentDTO();
	        dto.setId(entity.getId());
	        dto.setFirstName(entity.getFirstName());
	        dto.setLastName(entity.getLastName());
	        dto.setSchoolNumber(entity.getSchoolNumber());
	        dto.setClassName(entity.getClassName());
	        return dto;
	    }

}
