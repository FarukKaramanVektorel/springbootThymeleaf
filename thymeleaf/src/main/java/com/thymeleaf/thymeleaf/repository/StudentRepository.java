package com.thymeleaf.thymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thymeleaf.thymeleaf.entity.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
