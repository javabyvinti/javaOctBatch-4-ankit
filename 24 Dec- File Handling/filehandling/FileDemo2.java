package com.java.filehandling;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileDemo2 {

	public static void main(String[] args) {
		
		File file = new File("E://a/b/c/d/FirstFile.txt");
		if(file.exists())
		{
			file.delete();
			
			System.out.println("File existed and deleted");
		} else{
			file.getParentFile().mkdirs();
			try {
				file.createNewFile();
				System.out.println("Absolute Path = " + file.getAbsolutePath());
				System.out.println("Canonical Path = " + file.getCanonicalPath());
				System.out.println("File is = " + file.isFile());
				System.out.println("Can Read = " + file.canRead());
				System.out.println("Can Write = " +file.canWrite());
				System.out.println("Name = " +file.getName());
				System.out.println("Parent = " + file.getParent());
				Date date = new Date(file.lastModified());
				
				System.out.println("Last Modified = " + date);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
