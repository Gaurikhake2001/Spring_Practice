package com.springcore.stereo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/stereo/stereo.xml");
        Student s = con.getBean("student", Student.class); 
        System.out.println(s);
        System.out.println(s.getCities());
        
	}

}
