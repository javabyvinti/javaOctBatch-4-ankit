package com.java.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteData {

	public static void main(String[] args) {
		
		File file = new File("E://FirstFile.txt");
		
		Scanner scanner = new Scanner(System.in);
		// FileOutputStream
		
		try {
			file.createNewFile();
		
		FileOutputStream fout = new FileOutputStream(file, true);	
		
		//String data = "New Data";
		
		//byte dataNew[] = data.getBytes();
		
		System.out.println("Enter data to  write into file");
		
		String data = scanner.nextLine();
		
		fout.write(data.getBytes());	
		System.out.println("Data written");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileInputStream fin = new FileInputStream(file);
		
			System.out.println("Data is = ");
			
			int data;
			while((data = fin.read())!=-1){
				System.out.print((char)data);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}