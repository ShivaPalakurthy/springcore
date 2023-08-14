package com.springcore.setter;

public class Student {
	private int studentid;
	private String studentName;
	private String studentAddress;
	public int getStudentId() {
		return studentid;
	}
	public void setStudentId(int studentId) {
		this.studentid = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentid = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentid + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}
	
	public void show() {
		System.out.println("Student Id is "+ studentid+" Student Name is "+studentName+" Student Address "+studentAddress);
	}
}
