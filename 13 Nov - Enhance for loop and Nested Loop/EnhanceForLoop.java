package com.bmpl.javabasic;

public class EnhanceForLoop {

	public static void main(String[] args) {
		
		//java 1.5 version
		//enhance for loop
		
		String array[] = {"Ram", "Rohan", "Sonu",
							"Meera","Ram","Amit",
							"Rishi", "Neha", "Arti"};
		
		System.out.println(array.length);
		
//		for(int i = 0; i<= array.length-1; i++){
//			System.out.println(array[i]);//array[1]
//		}
		
		//array traversing
		for(String a : array){
			System.out.println(a);
		}

	}

}
