package com.java.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyData {

	public static void main(String[] args) {
		
		File readFile = new File("D://file.jpg");
		File writeFile = new File("D://newfile.jpg");
		
		try {
			FileInputStream fin = new FileInputStream(readFile);
		
			FileOutputStream fout = new FileOutputStream(writeFile);
			
			int i = 0;
			
			while((i = fin.read())!=-1){
				fout.write(i);
			}
			
			System.out.println("File copied");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		

	}

}
