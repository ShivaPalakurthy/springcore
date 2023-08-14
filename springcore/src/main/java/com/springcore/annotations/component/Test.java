package com.springcore.annotations.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {public Test() {
	// TODO Auto-generated constructor stub
}public static void main(String args[]) {
	ApplicationContext cnn=new ClassPathXmlApplicationContext("com/springcore/resources/Component.xml");
	Student student =cnn.getBean("student",Student.class);
	System.out.println(student);
}
}
