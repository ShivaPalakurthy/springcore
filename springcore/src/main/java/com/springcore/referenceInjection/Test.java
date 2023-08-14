package com.springcore.referenceInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/resources/ReferenceInjection.xml");
		A a=(A) context.getBean("aref");
		A a1=(A) context.getBean("a1ref");
		System.out.println(a.getX());
		System.out.println(a.getOb().getY());
		
		System.out.println(a);
		System.out.println(a1);
	}
}
