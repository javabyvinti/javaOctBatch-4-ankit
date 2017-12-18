package com.exceptionhandling.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your value");
		
		try{
		int value = scanner.nextInt();
		System.out.println(value);
		} catch(InputMismatchException i){
			System.out.println("Only Numbers are allowed ");
			i.printStackTrace();
		}

	}

}
