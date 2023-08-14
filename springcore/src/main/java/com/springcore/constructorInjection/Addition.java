package com.springcore.constructorInjection;

public class Addition {
	private int a;
	private int b;
	
	public  Addition(double a,double b) {
		this.a=(int)a;
		this.b=(int)b;
		System.out.println("Constructor : double, double");
	}
	public  Addition(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println("Constructor : int, int");
	}
	/*
	 * This code is for understanding the ambiguity between the constructor arguments if you write double at first then the
	 * values will be get passed to the double constructor if you write int arguments first then the bean values will be passed
	 * to the int constructor, but when you write String constructor,then the irrespective of the order it will pass the values
	 * to the spring constructor. This is ambiguity. reason is when you give bean values in xml file it takes them as string,
	 * so while passing the value it will check in addition class whether there is a constructor that takes both the string values or not
	 * if there is such constructor then it will directly pass those values to the string constructor. so in order to avoid this
	 * we will write type in the constructor argument in xml file like type="int"/type="double"/type="string" thereby, avoiding
	 * such ambiguity 
	 * 
	 * 		we can also change the value to which argument we are going pass through constructor argument with the help of
	 * index & index starting from 0,1,...
	 */
	public  Addition(String a,String b) {
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
		System.out.println("Constructor : String , String");
	}
	public void dosum() {
		{	System.out.println("Value of a is "+this.a);
			System.out.println("Value of b is "+this.b);
			System.out.println("Sum is "+(this.a+this.b));
		}
	}
}
