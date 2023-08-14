package com.java.model;
@Deprecated
public class ChildClass extends Parent implements IntTest {
	private int value;

	public ChildClass(String name,int value) {
	 super(name);
	 this.value=value;
	}

	public void showValue() {
		// TODO Auto-generated method stub
		System.out.println("Values:"+value);
	}
	
}
