package com.thymeleaf.project01.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.thymeleaf.project01.entity.Student;
import com.thymeleaf.project01.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	private StudentRepository studentRepository;
	
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}


	@Override
	public List<Student> getAllStu(){

		return studentRepository.findAll();
	}


	@Override
	public Student saveStudent(Student s) {
		
		return studentRepository.save(s);
	}


	@Override
	public Student updateStudent(Student s) {
		// TODO Auto-generated method stub
		return studentRepository.save(s);
	}


	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		
		return studentRepository.findById(id).get();
	}

	@Override
	public String deleteStudentById(int id, Student s) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
		return "Student Having Id : "+ s.getId() + " Is Deleted Successfully" ;
	}


	




}
