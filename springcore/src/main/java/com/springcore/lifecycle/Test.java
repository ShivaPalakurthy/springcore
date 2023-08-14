package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/resources/LifeCycle.xml");
		//registering shutdown hook
		context.registerShutdownHook();
		lifeCycle s1=(lifeCycle) context.getBean("s1");
		System.out.println(s1);
	
		
		//Spring Bean Life Cycle by using Interface
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		Pepsi p1= (Pepsi) context.getBean("p1");
		System.out.println(p1);
		
	
	}

}
