package com.bmpl.javabasic;


//root class(internally executed) -->
public class ClassDemo1 extends Object{
	//3 types of variables
	//states --> instance variables
	//behaviour --> methods
	
	int rollno;//default --> can be accessed inside package
	static int data;
	
	static void print(){
		
	}
	
	public static void main(String[] args) {
	
		ClassDemo1 obj = new ClassDemo1();
		
		int value = 1;
		System.out.println(value);
		System.out.println(obj.rollno);
		System.out.println("Static value = " +data);
	}

}
