package com.java.array;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		
		Integer values[] = new Integer[5];
		
		//array intialization
		//int values[] = {10, 76, 32, 10, 76, 32, 10, 76, 32, 10, 76, 32}; 
		
		System.out.println("Enter 5 values");
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i< values.length; i++){
			values[i] = scanner.nextInt();
		}
		
		//length = 1
//		for(int i = 0; i<values.length; i++){
//			System.out.println(values[i]);
//		}
		
		//Enhanced for loop
		
		// values[0] = 32
		
		System.out.println("Array values are:");
		int index = 0;
		for(int i : values)
		{
			//System.out.println(values[i]);
			System.out.println("values" +"[" + index + "]" + "=" + i);
			index++;
		}
		
	}

}
