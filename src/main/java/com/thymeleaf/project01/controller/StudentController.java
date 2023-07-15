package com.thymeleaf.project01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.thymeleaf.project01.entity.Student;
import com.thymeleaf.project01.service.StudentService;

@Controller
public class StudentController {

	private StudentService studentService;

	public StudentController(StudentService studentServie) {
		super();
		this.studentService = studentServie;
	}
	
	@GetMapping("student")
	public String StuList(Model model) {
		model.addAttribute("student", studentService.getAllStu());
		return "student"; 
	}
	
	@GetMapping("/student/new")
	public String createStudent(Model model) {
		Student s = new Student(); 
		model.addAttribute("student",s);
		return "create_student"; 
	}
	
	@PostMapping("/student")
	public String saveStudent(@ModelAttribute("Student") Student student) {
			studentService.saveStudent(student);
			return "redirect:/student";
		
		
	}
	
	@GetMapping("/student/edit/{id}")
	public String updateUser(@PathVariable int id , Model model) {
		
		model.addAttribute("student", studentService.getStudentById(id));
		return "update_student";
	}
	
	@PostMapping("/student/{id}")
	public String updateUser(@PathVariable int id , @ModelAttribute("student") Student stu,Model model) {
		model.addAttribute("student",studentService.saveStudent(stu));
		return "redirect:/student";
		
	}
	
	
	@GetMapping("/student/delete/{id}")
	public String deleteUser(@PathVariable("id") int id ,@ModelAttribute("student") Student stu , Model model ) {
		model.addAttribute("student", studentService.deleteStudentById(id,stu));
		return "delete";
	}
	

	
}
