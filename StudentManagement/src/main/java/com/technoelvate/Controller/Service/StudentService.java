package com.technoelvate.Controller.Service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.technoelvate.Controller.daolayer.StudentJdbc;
import com.technoelvate.Controller.daolayer.StudentJdbcImpl;
import com.technoelvate.Controller.dto.Student;
@Component
public class StudentService {
	
	
	ApplicationContext context=new ClassPathXmlApplicationContext("com/technoelvate/Controller/daolayer/Config.xml");
	StudentJdbc dao=context.getBean("studentjdbc1",StudentJdbcImpl.class);
 
	public int insertStd(Student std1) {
		return dao.insertStudent(std1);
		
	}
	
	
	public boolean aunthentecStd(int id,int password) {
		Student s=new Student();
		dao.authenticStudent(id);
		if(password==s.getPassword()) {
			return true;
		}else {
			return false;
		}
	}
	
	public int updateStd(Student std) {
		return dao.updateStudent(std);
	}
	
	public int deleteStd(Student std) {
		return dao.deleteStudent(std);
	}
	
	public Student getStd(int id) {
		return dao.getStudent(id);
	}
	
	public List<Student> getAllStd(){
	   return	dao.getAllStudent();
	}
	
	
	
	

}
