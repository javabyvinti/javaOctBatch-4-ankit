package com.java.array;

import java.util.Scanner;

public class ArrayDemo6 {

	public static void main(String[] args) {
		
		// copy of one matrix into another matrix
		// multiplication of 2 matrix
		Integer matrix1[][] = new Integer[2][2];
		Integer matrix2[][] = new Integer[2][2];
		Integer matrix3[][] = new Integer[2][2];

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter values in first matrix");
		
		for(int row = 0; row<2; row++){
			
			for(int column = 0; column<2; column++)
			{
				matrix1[row][column] = scanner.nextInt();
				
			}
		}
		
		for(int row = 0; row<2; row++){
			
			for(int column = 0; column<2; column++)
			{
				matrix2[row][column] = matrix1[row][column];		
			}
		}
		
		for(int row = 0; row<2; row++){
			
			for(int column = 0; column<2; column++)
			{
				matrix3[row][column] = matrix1[row][column] + matrix2[row][column];		
			}
		}
		
		
		System.out.println("Data of Matrix1 is=");
		
		for(int row = 0; row<2; row++){
			
			for(int column = 0; column<2; column++)
			{
				System.out.print(matrix1[row][column] + "\t");		
			}
			System.out.println();
		}
		
		System.out.println("Data of Matrix2 is=");
		
		for(int row = 0; row<2; row++){
			
			for(int column = 0; column<2; column++)
			{
				System.out.print(matrix2[row][column] + "\t");		
			}
			System.out.println();
		}
		
		System.out.println("Data of Matrix3 is=");
		
		for(int row = 0; row<2; row++){
			
			for(int column = 0; column<2; column++)
			{
				System.out.print(matrix3[row][column] + "\t");		
			}
			System.out.println();
		}
		
	}
}