package com.thymeleaf.thymeleaf.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.thymeleaf.thymeleaf.entity.dto.StudentDTO;
import com.thymeleaf.thymeleaf.service.StudentService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class StudentController {
	
	private final StudentService service;
	
	@GetMapping("/students/list")
	public String showStudent(Model model) {
		List<StudentDTO> students=service.getAllStudent();
		model.addAttribute("students",students);
		return "list";
	}	
	@GetMapping("/students/add")
	public String addStudentForm(Model model) {
		model.addAttribute("newStudent",new StudentDTO());		
		return "add";
	}
	@PostMapping("/students/add")
	public String addStudent(@ModelAttribute("newStudent") StudentDTO newStudent) {		
		service.saveStudent(newStudent);
		return "add";
	}
	
	@GetMapping("/students/delete/{id}")
	public String deleteStudent(@PathVariable Long id) {
		
		service.deleteStudent(id);
		return "redirect:/students/list";
	}
	
	@GetMapping("/students/update/{id}")
	public String updateStudentForm(@PathVariable Long id, Model model) {
		StudentDTO sDto=service.getById(id);
		model.addAttribute("student",sDto);
		return "update";
	}
	@PostMapping("/students/update")
	public String updateStudent(@ModelAttribute("student") StudentDTO dto) {
		service.updateStudent(dto);
		return "redirect:/students/list";
	}
	

}
