package com.technoelvate.Controller.daolayer;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.technoelvate.Controller.dto.Student;



public class RowmapperImpl implements RowMapper<Student> {
	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student std=new Student();
		std.setId(rs.getInt(1));
		std.setUsername(rs.getString(2));
		std.setPassword(rs.getInt(3));
		return std;
	}

}
