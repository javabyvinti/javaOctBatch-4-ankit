package com.bmpl.javabasic;

/*

A
AB
ABC
ABCD
ABCDE

 */


public class Pattern2 {

	public static void main(String[] args) {
		for(char row = 'A'; row<='E'; row++){
			//printing
			for(char column = 'A'; column<=row; column++)
			{
				System.out.print(column);
			}
			System.out.println();
		}


	}
}