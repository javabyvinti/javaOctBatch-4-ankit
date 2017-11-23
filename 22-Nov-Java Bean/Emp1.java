package com.bmpl.javabasic;

import java.util.Scanner;

public class Emp1 {

	public static void main(String[] args) {
		
		Encapsulation encapsulation = new Encapsulation();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name");
		encapsulation.setName(scanner.nextLine());
		
		System.out.println("Enter your phn");
		encapsulation.setPhn(scanner.nextLong());
		
		System.out.println("Enter your salary");
		encapsulation.setSalary(scanner.nextInt());
		
		System.out.println("Enter your id");
		encapsulation.setId(scanner.nextInt());
		
		System.out.println(encapsulation.getId());
		System.out.println(encapsulation.getName());
		System.out.println(encapsulation.getSalary());
		System.out.println(encapsulation.getPhn());
		
		//encapsulation.input();
		//encapsulation.print();

	}

}
