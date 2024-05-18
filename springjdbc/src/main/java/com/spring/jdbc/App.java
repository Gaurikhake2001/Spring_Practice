package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.dao.StudentDao;
import com.springjdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Program started..");
    	
      ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
      StudentDao studentdao = context.getBean("studentDao",StudentDao.class);
      
//      Student student = new Student();
//      inserting data
      /*student.setId(103);
      student.setName("Ashish Mahajan");
      student.setCity("Pune");
      
      studentdao.insert(student);
      
      System.out.println("record inserted successfully");*/
//      updating data
     /* Student student = new Student();
      student.setId(102);
      student.setName("Revan Khake");
      student.setCity("Pune");
      
      studentdao.change(student);
      
      System.out.println("record updated successfully");*/

//     deleting data 
      /*Student student = new Student();
      studentdao.delete(103);
      
      System.out.println("record deleted");*/
      
//      selecting data of single id 
      /*Student student = studentdao.getStudent(101);
      System.out.println(student);
      
      Student student1 = studentdao.getStudent(102);
      System.out.println(student1);*/
      
//      selecting all data
      
      List<Student> student = studentdao.getAllStudents();
      for(Student s: student)
      {
    	  System.out.println(s);
      }
      
    }
}
