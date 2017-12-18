package com.exceptionhandling.java;

public class ExceptionHandling4 {

	public static void main(String[] args) {
		
		int first, second;
		
		try{
		
		first = Integer.parseInt(args[0]);// one
		second = Integer.parseInt(args[1]);
		
		int result = first + second;
		System.out.println(result);
	
		}catch(NumberFormatException e){
			System.out.println("Exception occured " + e);
		}
			
	}

}
