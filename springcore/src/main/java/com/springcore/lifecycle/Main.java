package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycle.xml");
       /*  Bag b = (Bag) context.getBean("bag1");
        System.out.println(b);
        context.registerShutdownHook();
        
        System.out.println("****************");
        
        Jacket j = (Jacket) context.getBean("jacket1");
        System.out.println(j);
        context.registerShutdownHook();
        
        System.out.println("****************");*/
        
        Watch w = (Watch) context.getBean("watch1");
        System.out.println(w);
        context.registerShutdownHook();
	}

}
