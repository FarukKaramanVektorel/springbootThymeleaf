package com.thymeleaf.thymeleaf.service;

import java.util.List;

import com.thymeleaf.thymeleaf.entity.dto.StudentDTO;

public interface StudentService {
	List<StudentDTO> getAllStudent();
	StudentDTO getById(Long id);
	void saveStudent(StudentDTO dto);
	void updateStudent(StudentDTO dto);
	void deleteStudent(Long id);

}
