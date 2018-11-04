package org.satabdi.javaResttutorial.StudentService.controller;

import java.util.List;

import org.satabdi.javaResttutorial.Student.Student;
import org.satabdi.javaResttutorial.StudentService.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//Cross-Origin Resource Sharing (CORS) 
@CrossOrigin(maxAge = 3600)//(origins = "http://localhost:4200")
@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	StudentService service;

	@GetMapping(path = "/hello")
	public String sayHello() {
		return "Hey there!";
	}
	
	//@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(path = "/findAllStudents")
	public List<Student> displayAllStudents() {
		System.out.println("Entering displayAllStudents");
		List<Student> all = service.getAllStudents();
		System.out.println("Returning : "+all);
		return all;
	}

	
	@GetMapping(path = "/getStudent/{id}")
	public Student displayStudentById(@PathVariable("id") long id) {
		System.out.println("Entering displayStudentById");
		return service.getStudentById(id);
	}
	
	
	@PostMapping(path = "/addStudent")
	public void addStudent(@RequestBody Student s) {
		System.out.println("Entering addStudent with Student = "+s);
		service.addStudent(s);
	}
	
	
	@PutMapping(path = "/updateStudent")
	public String updateStudent(@RequestBody Student s) {
		System.out.println("Entering updateStudent with Student = "+s);
		return "updateStudent";
	}

	
	@DeleteMapping(path = "/deleteStudent/{id}")
	public Boolean deleteStudent(@PathVariable("id") long id) {
		System.out.println("Entering deleteStudent with id = "+id);
		return service.deleteStudentById(id);
	}
	
	

}
