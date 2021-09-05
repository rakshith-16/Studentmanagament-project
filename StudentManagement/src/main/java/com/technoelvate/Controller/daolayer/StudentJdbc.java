package com.technoelvate.Controller.daolayer;

import java.util.List;

import com.technoelvate.Controller.dto.Student;

public interface StudentJdbc {
	
	
	public int insertStudent(Student std);
	public Student authenticStudent(int id);
	public int updateStudent(Student std);
	public int deleteStudent(Student std);
	public Student getStudent(int id);
	public List<Student> getAllStudent();

	
	
	

}
