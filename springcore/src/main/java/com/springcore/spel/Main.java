package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/stl.xml");
		Demo d = context.getBean("demo", Demo.class);
			System.out.println(d);
			
			System.out.println(d.getName().getClass().getMethods());
	}

}
