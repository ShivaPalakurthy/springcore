package com.springcore.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/resources/ConstructorInjection.xml");
		Person p=(Person) context.getBean("person");
		System.out.println(p);
		Person p1=(Person) context.getBean("cschema");
		System.out.println(p1);
		
		Addition add=(Addition) context.getBean("add");
		Addition add1=(Addition) context.getBean("add1");
		add.dosum();
		add1.dosum();
	}
}
