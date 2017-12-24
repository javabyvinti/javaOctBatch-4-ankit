package com.java.filehandling;

import java.io.File;

public class FileDemo3 {

	public static void main(String[] args) {
		
		File file = new File("E://");
		
		//String listArray[] = file.list();
		
		File listArray[] = file.listFiles();
		
		for(File data : listArray){
			System.out.println(data);
		}
		System.out.println("Total files are = "+ listArray.length);
	}

}
