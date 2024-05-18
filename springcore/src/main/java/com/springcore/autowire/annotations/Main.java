package com.springcore.autowire.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/annotations/autoconfig.xml");
		Employee e = context.getBean("employee",Employee.class);
		System.out.println(e);

	}

}
