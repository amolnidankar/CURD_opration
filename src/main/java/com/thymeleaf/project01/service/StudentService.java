package com.thymeleaf.project01.service;

import java.util.List;

import com.thymeleaf.project01.entity.Student;

public interface StudentService {
	public List<Student> getAllStu();
	
	public Student saveStudent(Student s);
	
	public Student updateStudent(Student s);
	
	public Student getStudentById(int id);
	
	public String deleteStudentById(int id,Student s);
	
}
