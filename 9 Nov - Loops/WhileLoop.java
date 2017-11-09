package com.bmpl.javabasic;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int number = scanner.nextInt();
		
		int value = 1;

		
		while(value<=10){//11<=10
			//2 X 1 = 2
			System.out.println(number + " X " + value + " = " + (number * value));//2 4 6
			value++; // value = 11
		}
		
		
		// 15 --> 
		
//		while(value >= 1){ // 11<=10
//			System.out.println(value); 	//1
//			value = value - 1; // 10 + 1 = 11
//		}
//		System.out.println("Outside value = " +value);
		

	}

}
