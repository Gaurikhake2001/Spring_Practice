package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/applicationContext.xml");
    	Student student1 = (Student)context.getBean("Student1");
    	Student student2 = (Student)context.getBean("Student2");
    	
    	System.out.println(student1);
    	System.out.println(student2);
    }
}
