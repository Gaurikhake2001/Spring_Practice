package com.springjdbc.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.springjdbc.entities.Student;

@Component()
public interface StudentDao {
	
	public int insert(Student student);
	public int change(Student student);
	public int delete(int id);
	public Student getStudent(int id);
	public List<Student> getAllStudents();

}
