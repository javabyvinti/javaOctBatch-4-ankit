package com.java.array;

import java.util.Scanner;

public class MultiplicationArray {

	public static void main(String[] args) {
		
		Integer matrix1[][] = new Integer[2][2];
		Integer matrix2[][] = new Integer[2][2];
		Integer matrix3[][] = {{0,0}, {0,0}};
		
				
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter 4 values in first matrix");
		
		for(int row = 0; row<2; row++){
			for(int column = 0; column<2; column++){
				matrix1[row][column] = scanner.nextInt();
			}
		}
		
		System.out.println("Enter 4 values in second matrix");
		
		for(int row = 0; row<2; row++){
			for(int column = 0; column<2; column++){
				matrix2[row][column] = scanner.nextInt();
			}
		}
		
		int i = 0; 
		for(int row = 0; row<2; row++)//row = 1
		{
			for(int column = 0; column<2; column++)//column = 1
			{
				for(int val = 0; val<2; val++)
				{			//01--> 6				//  01 --> 2  *  8 --> 16   
					matrix3[row][column] += matrix1[row][val] * matrix2[val][column];
				}
			}
		
		}
		
		for(int row = 0; row<2; row++){
			for(int column = 0; column<2; column++)//column = 0
			{
				System.out.print(matrix3[row][column]+"\t");
			}
			System.out.println();
		}
		
	}

}