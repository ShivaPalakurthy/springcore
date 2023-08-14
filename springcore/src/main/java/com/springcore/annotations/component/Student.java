package com.springcore.annotations.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component //to elimination <bean> from xml file
public class Student {
	@Value("SHiva")
	private String studentName;
	@Value("Bangalore")
	private String city;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}
}
