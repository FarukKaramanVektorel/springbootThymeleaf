package com.thymeleaf.thymeleaf.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.thymeleaf.thymeleaf.entity.StudentConverter;
import com.thymeleaf.thymeleaf.entity.dto.StudentDTO;
import com.thymeleaf.thymeleaf.entity.model.Student;
import com.thymeleaf.thymeleaf.repository.StudentRepository;
import com.thymeleaf.thymeleaf.service.StudentService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
	private final StudentRepository repository;

	@Override
	public List<StudentDTO> getAllStudent() {
		List<Student> students=repository.findAll();
		return students.stream().map(StudentConverter::toDto)
				.collect(Collectors.toList());
	}

	@Override
	public StudentDTO getById(Long id) {
		Student st=repository.findById(id).orElse(null);
		return (st!=null)?StudentConverter.toDto(st):null;
	}

	@Override
	public void saveStudent(StudentDTO dto) {
		Student st=StudentConverter.toEntity(dto);
		repository.save(st);

	}

	@Override
	public void updateStudent(StudentDTO dto) {
		StudentDTO sdto=getById(dto.getId());
		sdto.setName(dto.getName());
		Student st=StudentConverter.toEntity(sdto);
		repository.save(st);

	}

	@Override
	public void deleteStudent(Long id) {
		repository.deleteById(id);

	}

}
