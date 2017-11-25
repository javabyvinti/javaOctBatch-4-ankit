package com.bmpl.javabasic;

// this keyword --> to represent class--> 
// constructor, method or block or instance variables

public class ConsDemo3 {

	//instance variables
	int rollno;
	String name;
	String collegeName;	// objects multiple
	float percentage;
	
	ConsDemo3(){
		//initialize instance variables with own default values
		//rollno = 1;
		//name = "Ram";
		collegeName = "BMPL";
	}
	
	ConsDemo3(String name, int rollno){
		
		this(65.54f);	// calling constructor
		// constructor chaining
		this.rollno = rollno;
		this.name = name;
	}
	
	ConsDemo3(float percent){
		this();	//must be first statement
		percentage = percent;
	}
	void print(){
		System.out.println("Rollno = " +rollno);
		System.out.println("Name = " +name);
		System.out.println("College name = " + collegeName);
		System.out.println("Percentage = "+percentage);
	}
	
	public static void main(String[] args) {
		ConsDemo3 obj = new ConsDemo3("Ram", 1);
		obj.print();

	}
}