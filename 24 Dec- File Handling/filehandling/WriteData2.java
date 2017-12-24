package com.java.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData2 {

	public static void main(String[] args) {
		
		File file = new File("E://data1.doc");
		
		try {
			FileWriter fw = new FileWriter(file);
			
			fw.write("Write this data into my file");
			System.out.println("Data written");
			
			fw.close();
			
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			System.out.println(br.readLine());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// FileOutputStream
		

	}

}
