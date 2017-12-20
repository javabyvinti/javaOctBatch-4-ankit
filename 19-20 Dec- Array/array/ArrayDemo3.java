package com.java.array;

import java.util.Scanner;

// use 3 subjects and total and percentage and grade

public class ArrayDemo3 {

	public static void main(String args[])
	{
		int total = 0;
		float percentage = 0;
		char grade;
		int totalSubjects = 3;
		
		Integer marks[] = new Integer[3];
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter marks of 3 subjects");
		
		for(int i = 0; i<marks.length; i++){
			marks[i] = scanner.nextInt();
		}

		for(int i : marks){
			total += i;
		}
		
		percentage = total/totalSubjects;
		
		if(percentage>80 && percentage<=100){
			grade = 'A';
		} else if(percentage>60 && percentage<=80)
		{
			grade = 'B';
		} else if(percentage>40 && percentage<=60){
			grade = 'C';
		} else {
			grade = 'D';
		}
		
		System.out.println("**************Result****************");
		System.out.println("Marks are:");
		
		for(int i : marks){
			System.out.println(i);
		}
		
		System.out.println("Percentage is: " + percentage);
		System.out.println("Grade is: " + grade);
		
	}
}