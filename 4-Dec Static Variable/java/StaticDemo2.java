package com.staticdemo.java;

import java.util.Scanner;

public class StaticDemo2 {

	public static void main(String[] args) {
		
		StaticDemo obj = new StaticDemo();
		
		System.out.println(StaticDemo.value1);
		
		//
		
		//int s = Scanner.nextInt();
		Integer integer = new Integer(10);
		//int in = integer.parseInt("10");
		
		int i = Integer.parseInt("10");// static method

		StaticDemo.demo();
		
	}

}
