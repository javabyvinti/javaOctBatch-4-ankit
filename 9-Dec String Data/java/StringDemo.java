package com.stringex.java;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		
		String name = "Ram";
		
		name = name.concat("Kumar");
		name = name.concat("Sharma");
		name = name.toUpperCase();
		//System.out.println(name.toLowerCase());
		System.out.println(name);
		System.out.println(name.charAt(0));

		String data = "This is my data";
		String newData[] =  data.split("i");
		
//		for(int i = 0; i<newData.length; i++){
//			System.out.println(newData[i]);
//		}
		
		//enhanced for loop
		for(String s : newData){
			System.out.println(s);
		}
		
		String fullName = "Ram Kumar Sharma";
		System.out.println("Length is = " +fullName.length());
		
		System.out.println("Replace = " + fullName.replace("Ram", "Mohan"));
		System.out.println("Substring = " +fullName.substring(5, 8));
		
		//String studName = "                 rohan";
		//System.out.println(studName.trim());
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name");
		String studName = scanner.nextLine();
		System.out.println(studName.trim());
		
		
		String userName[] = {"Ram Kumar", "Mohan", "Neha Sharma", "Ram", "Kuamr", "abc", "xyz", "Ram2"};
		
		String data2 = "This is my data for java program";
		
		System.out.println(data2.indexOf("for"));
	
		//System.out.println(data2.reverse());
	}

}










