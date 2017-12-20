package com.java.array;

import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your 5 values");
		
		Integer values[] = new Integer[5];
		
		for(int i = 0; i < values.length; i++){
			values[i] = scanner.nextInt();
		}
		int min = values[0];
		//int max = 0;
		
		for(int i = 1; i<values.length; i++){
			if(min>values[i]){
				min = values[i];
			}
		}
		System.out.println("Minimum value is = " + min);
	}
}