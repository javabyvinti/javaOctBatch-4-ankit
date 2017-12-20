package com.java.array;

public class ArrayDemo4 {

	// 1D array
	// 2D array
	
	public static void main(String args[])
	{
		// 2 X 2 --> 4 elements
		Integer values[][] =  { {2,4}, 
								{5, 7},
								{54, 32},
								{76, 32 }
		}; // 12 rows X 3 columns = 36 elements
		
		//System.out.println(values.length);
		
		for(int row = 0; row<4; row++)// length = 0 < 4 
		{
			for(int column = 0; column<2; column++) // col = 2 < 3
			{
				System.out.println(values[row][column]); // values[0][0]
			}
		}
	}
}