package com.java.array;

import java.util.Scanner;

public class ArrayDemo5 {

	public static void main(String[] args) {
		
		Integer array[][] = new Integer[2][2];
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter 4 values");
		for(int row = 0; row<2; row++){
			for(int column = 0; column<2; column++)
			{
				array[row][column] = scanner.nextInt();
						
			}
		}
		
		System.out.println("Array is = ");

		for(int row = 0; row<2; row++){
			for(int column = 0; column<2; column++)
			{
				//Transpose of Matrix
				System.out.print(array[column][row] + "\t");
			}
			System.out.println();
		}
		
	}

}
