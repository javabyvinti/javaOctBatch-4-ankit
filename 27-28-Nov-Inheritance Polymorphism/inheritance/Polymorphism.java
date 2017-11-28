package com.bmpl.inheritance;

public class Polymorphism {

	int first = 89 , second = 78;
	
	//method overloading
	
	void add(int first, int second){
		System.out.println(first + second);
	}
	
	void add(){
		System.out.println(first + second);
	}
	
	void add(int first, float second){
		System.out.println(first + second);
	}
	
	int add(int first, int second, int third){
		return first + second + third;
	}
	
	float add(float first, float second){
		return first + second;
	}
	
	long add(long first, long second){
		return first + second;
	}
	
	public static void main(String[] args) {
		
		Polymorphism obj = new Polymorphism();
		obj.add();
		obj.add(54, 32);
		System.out.println(obj.add(43.65f, 43.87f));
		System.out.println(obj.add(5443222352l, 87654324332l));
		System.out.println(obj.add(43, 12, 32));
	}
	
}
