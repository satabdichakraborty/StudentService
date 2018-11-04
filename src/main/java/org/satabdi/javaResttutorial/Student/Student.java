package org.satabdi.javaResttutorial.Student;

import java.util.Arrays;

public class Student {

	int id;
	String fName;
	String lName;
	String[] Courses;
	
	Student(){}
	
	
	public Student(int id, String fName, String lName, String[] courses) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		Courses = courses;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String[] getCourses() {
		return Courses;
	}
	public void setCourses(String[] courses) {
		Courses = courses;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", fName=" + fName + ", lName=" + lName + ", Courses=" + Arrays.toString(Courses)
				+ "]";
	}

}
