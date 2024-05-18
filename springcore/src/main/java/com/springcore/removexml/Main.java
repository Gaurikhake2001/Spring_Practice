package com.springcore.removexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Student student = context.getBean("getStudent", Student.class);
		System.out.println(student);
		student.display();
		Lab lab = new Lab();
		lab.Lab();

	}

}
