package com.exceptionhandling.java;

public class ExceptionDemo1 {

	public static void main(String[] args) {

		try{
		
		int value = Integer.parseInt(args[0]);//"forty" -->int value =  forty
		int result = 12/ value;
		System.out.println(result);

		}
		catch(ArrayIndexOutOfBoundsException exception){
			System.out.println("Please provide some value in array");
		}
		catch(Exception e){
			System.out.println("Some excpetion occured");
		}
	}
}