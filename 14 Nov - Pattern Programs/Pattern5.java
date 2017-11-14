package com.bmpl.javabasic;

/*
     *		= 1
    *** 	= 3
   *****  	= 5
  *******   = 7
 *********  = 9

 */


public class Pattern5 {

	public static void main(String[] args) {
		for(int row = 1; row<=5; row++){
			//printing

			for(int space = 5; space>=row; space--)
			{
				System.out.print(" ");
			}
			
			for(int column = 1; column<=(2*row-1); column++)
			{
				System.out.print("*");
			}
			System.out.println();		//     1
		}								//    12


	}

}
