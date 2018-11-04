package org.satabdi.javaResttutorial.StudentService.dao;

import java.util.ArrayList;
import java.util.List;

import org.satabdi.javaResttutorial.Student.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentDAO {
	
	
    List<Student> studentDao = new ArrayList<>();

	StudentDAO(){
		studentDao.add(new Student(1, "Satabdi", "Das", new String[] {"Java", "WebService"}));
		studentDao.add(new Student(2, "Chinmoy", "Chakraborty", new String[] {"Java", "Python"}));
		studentDao.add(new Student(3, "Debdyuti", "Bakshi", new String[] {"Java", "Python", "WebService"}));
	}
	
	public List<Student> getStudentDao() {
		return studentDao;
	}
}
