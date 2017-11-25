package com.bmpl.javabasic;
//inside package
public class ConsDemo1 extends Object{
	
	public ConsDemo1(){
		
	}
	
	
	//overload constructors
	ConsDemo1(int value){
		
	}
	
	
	//overload constructors
	ConsDemo1(float value){	//ambuity generated
		
	}
	
	ConsDemo1(int value,  int value2){
		
	}
	
	ConsDemo1(int value, float value2, float value3, String name){
		
	}
	
	//public --> access within or outside package

	public ConsDemo1(int i, float f) {
		System.out.println("Param called");
	}

	public static void main(String[] args) {
		
		ConsDemo1 obj1 = new ConsDemo1();
		ConsDemo1 obj = new ConsDemo1(78, 67.6f);

	}

}
