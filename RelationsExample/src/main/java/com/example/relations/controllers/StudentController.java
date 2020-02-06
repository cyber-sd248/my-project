package com.example.relations.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.relations.entities.Student;
import com.example.relations.services.StudentService;

@RestController
@RequestMapping(path="/students")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping(path="/addStudent")
	public Student addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}
		

}
