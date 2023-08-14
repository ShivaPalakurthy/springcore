package com.springcore.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.annotations.config")
public class javaConfig {
	@Bean
	public Subjects getSubject() {
	Subjects sub=new Subjects();
		return sub;
	}
	@Bean
	public Student getStudent() {
		Student studnet =new Student(getSubject());
		return studnet;
	}
}
