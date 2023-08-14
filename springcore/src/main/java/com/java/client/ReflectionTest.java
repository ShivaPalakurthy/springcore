package com.java.client;

import java.lang.annotation.Annotation;
import java.lang.module.ModuleDescriptor.Exports.Modifier;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionTest {
public static void main(String args[]) {
	//1. To get the class name
	System.out.println("-----------1. To get the class name-----------");
	Class<?> c1;
	try {
		c1=Class.forName("com.java.model.ChildClass");
		System.out.println("Class name: "+c1.getName());
		System.out.println("Class name: "+c1.getSimpleName());
	}catch(Exception e) {
		e.printStackTrace();
	}
	//2.Getting super class  
	System.out.println("--------------------------2.Getting super class----------------------");
	Class<?> c2;
	try {
		c2=Class.forName("com.java.model.ChildClass");
		System.out.println("Super Class name:"+c2.getSuperclass());
	}catch (Exception e) {
		e.printStackTrace();
	}
	
	//3.Getting implemented or extended interface  
	System.out.println("--------------------------3.Getting implemented or extended interface--------------------------");
	Class<?> c3;
	try {
		c3=Class.forName("com.java.model.ChildClass");
		System.out.println("Interfaces: "+Arrays.toString(c3.getInterfaces()));
	}catch (Exception e) {
		e.printStackTrace();
	}
	
	//4.Getting class modifier  
	System.out.println("-----------------------4.Getting Class modifier------------------------");
	Class<?> c4;
	try {
		c4=Class.forName("com.java.model.ChildClass");
		int modifiers=c4.getModifiers();
		System.out.println("Modifier: "+java.lang.reflect.Modifier.toString(modifiers));
	}catch (Exception e) {
		e.printStackTrace();
	}
	
	//5.Getting fields of the class  
	System.out.println("-----------------------5.Getting Fields of the class--------------------");
	Class<?> c5;
	try {
		c5=Class.forName("com.java.model.ChildClass");
		//Getting Fields of the class
		Field[] allfields=c5.getFields();//returns an array containing fields reflection all the accessible public fields of the class or interface represented by the class
		System.out.println("All Fields:"+Arrays.toString(allfields));
		
		//Getting fields of the class
		Field[] fields=c5.getDeclaredFields();//returns all the fields available in the child/derived class
		System.out.println("Fields:"+Arrays.toString(fields));
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	//6.Getting Constructors of the class
	System.out.println("----------------------6.Getting Constructors of the class-----------------------------");
	Class<?> c6;
	try {
		c6=Class.forName("com.java.model.ChildClass");
		Constructor<?>[] constructors=c6.getConstructors();//returns an array containing constructor objects contains all the public constructor of the class represented by child class 
		System.out.println("Constructors: "+Arrays.toString(constructors));
		
		Constructor<?>[] Deconstructors=c6.getDeclaredConstructors();//returns private public protected default
		System.out.println("Declared Constructors: "+ Arrays.toString(Deconstructors));
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	//7.Getting methods of the class  
	System.out.println("-------------------7.Getting methods of the class-------------------------");
	Class<?> c7;
	try {
		c7=Class.forName("com.java.model.ChildClass");
		//Getting all methods (even inherited ) of the class
		Method[] methods=c7.getMethods(); //gives public methods & inherited methods
		System.out.println("All methods: "+Arrays.toString(methods));
		
		//getting methods of a class
		methods=c7.getDeclaredMethods(); //gives private ,public ,default,protected but not inherited methods
		System.out.println("Class Methods: "+Arrays.toString(methods));
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
	//8.Getting Annotations 
	Class<?> c8;
	System.out.println("-----------------------8.Getting Annotations of the Class-------------------");
	try {
		c8=Class.forName("com.java.model.ChildClass");
		Annotation[] annotations=c8.getAnnotations(); //gives inherited annotations also
		System.out.println("Annotations :"+ Arrays.toString(annotations) );
		
		Annotation[] declaredannotations=c8.getDeclaredAnnotations();
		System.out.println("Declared Annotations :"+Arrays.toString(declaredannotations) );
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
}
