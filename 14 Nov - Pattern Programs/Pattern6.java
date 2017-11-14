package com.bmpl.javabasic;

/*
 
*****
****
***
**
*

 */

public class Pattern6 {

	public static void main(String[] args) {
		for(int row = 1; row<=5; row++){
			//printing
			
			for(int column = 5; column>=row; column--)
			{
				System.out.print("*");
			}
			System.out.println();		//     1
		}								//    12


	}

}
