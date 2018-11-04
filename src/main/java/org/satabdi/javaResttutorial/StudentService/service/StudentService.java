package org.satabdi.javaResttutorial.StudentService.service;

import java.util.List;

import org.satabdi.javaResttutorial.Student.Student;
import org.satabdi.javaResttutorial.StudentService.dao.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	private StudentDAO dao;

	public List<Student> getAllStudents() {
		System.out.println("Entering getAllStudents");
		return dao.getStudentDao();
	}

	public Student getStudentById(long id) {
		System.out.println("Entering StudentService::getStudentById with id "+id);
		
		Student student = null;

		for (Student s : dao.getStudentDao()) {
			if (s.getId() == id) {
				student = s;
			}
		}
		System.out.println("Returning student = "+student);
		return student;
	}

	public void addStudent(Student newStudent) {
		System.out.println("Entering StudentService::addStudent with newStudent "+newStudent);
		dao.getStudentDao().add(newStudent);
		
	}

	public Boolean updateStudentById(String id, Student updated) {
		System.out.println("Entering StudentService::updateStudentById with newStudent "+updated+ " id = "+id);
		int studentId = Integer.parseInt(id);
		Boolean result = false;

		for (Student s : dao.getStudentDao()) {
			if (s.getId() == studentId) {
				dao.getStudentDao().remove(s);
				dao.getStudentDao().add(updated);
				result = true;
			}
		}
		return result;
	}

	public Boolean deleteStudentById(long id) {
		System.out.println("Entering StudentService::deleteStudentById with id = "+id);
		
		Boolean result = false;

		for (Student s : dao.getStudentDao()) {
			if (s.getId() == id) {
				dao.getStudentDao().remove(s);
				result = true;
			}
		}
		return result;
	}

}
