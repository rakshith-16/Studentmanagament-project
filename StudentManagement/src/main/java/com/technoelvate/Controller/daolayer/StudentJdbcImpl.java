package com.technoelvate.Controller.daolayer;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.technoelvate.Controller.dto.Student;

public class StudentJdbcImpl implements StudentJdbc {
      JdbcTemplate template;
      Student std=new Student();

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public int insertStudent(Student std) {

		String query="insert into student values(?,?,?)";
		int s=template.update(query,std.getId(),std.getUsername(),std.getPassword());
		return s;
		
		
	}

	@Override
	public Student authenticStudent(int id) {
		RowMapper<Student> row=new RowmapperImpl();
		String query="select * from student where id=?";
		Student std= template.queryForObject(query,row,id);
		return std;
	}
	
	
	public int updateStudent(Student std) {
		String query="update student set username=?,password=? where id=?";
		int s=template.update(query,std.getUsername(),std.getPassword(),std.getId());
		return s;
	}


	public int deleteStudent(Student std) {
		String query="delete from student where id=?";
		int s=template.update(query, std.getId());
		return s;
		
					}

	public Student getStudent(int id) {
		RowMapper<Student> row=new RowmapperImpl();
		String query="Select * from student where id=?";
		Student std=template.queryForObject(query, row, id);
		return std;
	}

	public List<Student> getAllStudent() {
		RowMapper<Student> row=new RowmapperImpl();
		String query="select * from student";
		List<Student> std=template.query(query, row);
		return std;
		
	}

	

}
