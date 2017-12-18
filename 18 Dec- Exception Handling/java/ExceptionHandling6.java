package com.exceptionhandling.java;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

// throw vs throws --> 
//throw --> statement level
// when you want to throw an exception explicitly
// own exception can be throwned

//throws --> method level --> when the function don't want 
	//to handle exception instead the calling function should handle the exception

public class ExceptionHandling6 extends Object{

	int result, first, second;
	Scanner scanner;
	
	File file;
	
	void input() throws Exception{
		scanner = new Scanner(System.in);
		
		System.out.println("Enter first value");
		first = scanner.nextInt();
		
		System.out.println("Enter second value");
		second = scanner.nextInt();
		
	}
	
	void calculate() throws Exception{
		input();
		result = first + second;
	}
	
	void print() throws Exception{
		calculate();
		System.out.println("Result is = " + result);
	}
	
	public static void main(String[] args) //throws Exception 
	{
		ExceptionHandling6 obj = new ExceptionHandling6();
		
		String n = "-";
		int array[] = new int[10];
		
		//obj.input();
		
		//obj.calculate();
		try{
			array[12] = 19;		
			//obj.print();
			//System.out.println(obj.toString());
		}catch(Exception e){
			System.out.println("Some Exception Occured" + e);
			return;
		}
		finally{
			System.out.println("Always executed");
			//obj.scanner.close();
			
			//System.out.println(n += "f");
		}
		
	}
}