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
		
		int max = 0;
		
		for(int i = 0; i<values.length; i++){
			if(max<values[i]){
				max = values[i];
			}
		}
		System.out.println("Maximum value is = " + max);
	}
}