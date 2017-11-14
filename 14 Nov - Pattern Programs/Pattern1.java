package com.bmpl.javabasic;

/*

*
**
***
****
*****

1
12
123
1234
12345

 */

public class Pattern1 {

	public static void main(String[] args) {
		//positioning
		for(int row = 1; row<=5; row++){
			//printing
			for(int column = 1; column<=row; column++)
			{
				System.out.print(column);
			}
			System.out.println();
		}

	}

}
