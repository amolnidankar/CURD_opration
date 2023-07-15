package com.thymeleaf.project01.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thymeleaf.project01.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
