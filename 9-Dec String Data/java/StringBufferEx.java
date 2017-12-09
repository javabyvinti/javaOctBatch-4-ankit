package com.stringex.java;

public class StringBufferEx {

	public static void main(String[] args) {
		String name = new String("Hello String");
		
		
		
		StringBuffer sb = new StringBuffer("Hello Buffer" + 16);
//  '\0'
		sb.append("Java is the best programming language to use or to work with");
		System.out.println(sb);
		
		
	}

}
