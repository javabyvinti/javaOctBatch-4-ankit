package com.exceptionhandling.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter your first value");
		
		try{
		
		int first = scanner.nextInt();
		
		System.out.println("Enter your second value");
		int second = scanner.nextInt();
		
			float result = first / second;
			System.out.println("Result is = " + result);
				
		}catch(ArithmeticException e){
			
			System.out.println("Division by zero is not possible " + e.getMessage());
				
		}
//		catch(InputMismatchException e){
//			System.out.println("Only numbers are allowed");
//		}
//		catch(Exception e){
//			System.out.println("Some exception occured.. Try later");
//		} 
		finally{ // i will always execute either exception occur or not
			// reference all must be closed
			scanner.close();
			System.out.println("Program executed");
		}
		
		System.out.println("Enter value");
		int value = scanner.nextInt();
		System.out.println(value);
	}

}
