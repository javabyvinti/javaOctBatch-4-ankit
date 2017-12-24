package com.java.filehandling;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) {
		
		String pathOfFile = "E://FirstFile.doc";
		String pathOfFolder = "E://a/b/c/d/FirstFile.txt";
		
		File file = new File(pathOfFolder);
		try {
			System.out.println("Folder Created = " + file.getParentFile().mkdirs());
			System.out.println("File Created = "+ file.createNewFile());
		} 
//		catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		 catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
	}
}