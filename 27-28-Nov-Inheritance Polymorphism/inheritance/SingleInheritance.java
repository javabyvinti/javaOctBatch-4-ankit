package com.bmpl.inheritance;

class Person{
	String name;
	String address;
	long phn;
	
	void personInput(String name, long phn){
		this.name = name;
		this.phn = phn;
	}
	
	void personOutput(){
		System.out.println("Person Name =" + name);
		System.out.println("Person Phone No =" + phn);
	}
}

class Student extends Person{
	
	int studRollno;
	String studName;
	
	void studInput(int rollno, String name ){
		studRollno = rollno;
		studName = name;
	}
	
	void studOutput(){
		personOutput();
		System.out.println("Name is = " +studName);
		System.out.println("Rollno is = " +studRollno);
		//System.out.println("Phone is = "+ phn);
	}
	
}

public class SingleInheritance {

	public static void main(String args[]){
		
		Student ram = new Student();
		ram.personInput("Ram Kumar", 9865436543l);
		ram.studInput(1, "Ram Kumar");
		//ram.personOutput();
		ram.studOutput();
	}
	
}
