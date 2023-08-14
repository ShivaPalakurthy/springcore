package com.springcore.annotations.config;

import org.springframework.stereotype.Component;

 
public class Student {
	private Subjects subject;
	
public Subjects getSubject() {
		return subject;
	}

	public void setSubject(Subjects subject) {
		this.subject = subject;
	}

public Student(Subjects subject) {
		super();
		this.subject = subject;
	}

public void study() {
	subject.display();
	System.out.println("student is studying");
}
}
