package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class empMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
		Employee e = (Employee)context.getBean("employee");
		
		System.out.println(e.getEmpName());
		System.out.println(e.getPhones());
		System.out.println(e.getAddresses());
		System.out.println(e.getCourses());
		System.out.println(e.getPhones().getClass().getName());
		
	}

}
