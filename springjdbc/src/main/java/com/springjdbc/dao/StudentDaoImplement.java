package com.springjdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.springjdbc.entities.Student;

@Component("studentDao")
public class StudentDaoImplement implements StudentDao {
	
	private JdbcTemplate jdbctemplate;
	
//	insert query

	public int insert(Student student) {
		
		String query = "insert into student(id, name, city) values (?, ?, ?)";
		
		int r = this.jdbctemplate.update(query, student.getId(),student.getName(),student.getCity());
		
		return r;
	}
	
//	update query
	
	public int change(Student student) {
		
		String query = "update student set name=? , city=? where id=?";
		
		int r = this.jdbctemplate.update(query, student.getName(),student.getCity(),student.getId());
		return r;
	}
	
//	delete query
	
	public int delete(int id) {
		
		String query = "delete from student where id=?";
		
		int r = this.jdbctemplate.update(query,id); 
		return r;
	}
	
//	select query
	
	public Student getStudent(int id) {
		
		String query = "select * from student where id=?";
		
		RowMapper<Student> rowMapper = new RowMapperImplement();
		Student student = this.jdbctemplate.queryForObject(query, rowMapper,id);
		return student;
	}
	
	public List<Student> getAllStudents() {
		
		String query = "select * from student";
		List<Student> student =jdbctemplate.query(query, new RowMapperImplement());
		return student;
	}	

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	@Autowired
	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	

}
