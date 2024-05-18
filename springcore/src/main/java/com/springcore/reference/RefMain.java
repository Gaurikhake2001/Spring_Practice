package com.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/reference/referenceContext.xml");
		A a = (A) context.getBean("Aref");
		
		System.out.println(a.getX());
		System.out.println(a.getOb().getY());
		System.out.println(a);
	}

}
