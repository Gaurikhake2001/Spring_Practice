package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/standalone.xml");
		Person p =context.getBean("person1",Person.class);
		
		System.out.println(p);
		System.out.println(p.getFrnds().getClass().getName());
		System.out.println("********************************************");
		System.out.println(p.getFees());
		System.out.println(p.getFees().getClass().getName());
		

	}

}
