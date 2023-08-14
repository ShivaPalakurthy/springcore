package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
	ApplicationContext cont=new ClassPathXmlApplicationContext("com/springcore/resources/Autoconfig.xml");
	Emp emp1=cont.getBean("emp1",Emp.class);
	System.out.println(emp1);
	}
}
