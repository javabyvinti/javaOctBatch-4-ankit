package com.staticdemo.java;

public class StaticDemo {

	int value;	//instance variable
	public static int value1; // static variable
	
	StaticDemo(){
		
		value++;
		value1++;
		System.out.println("Value =" +value);
		System.out.println("Value1 = " +value1);
		
	}
	
	static void demo(){
		
	}
	
	public static void main(String[] args) {
		
		StaticDemo obj1 = new StaticDemo();
		StaticDemo obj2 = new StaticDemo();
		StaticDemo obj3 = new StaticDemo();
		
		int val = 0; // static variable or local variables
		
		System.out.println(StaticDemo.value1);

		demo();
		
	}

}
