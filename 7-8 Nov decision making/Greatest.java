// greatest from 3 numbers

import java.util.Scanner;

class Greatest{


	public static void main(String args[])
	{

		int value1, value2, value3;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your first value");
		value1 = scanner.nextInt();


		System.out.println("Enter your second value");
		value2 = scanner.nextInt();


		System.out.println("Enter your third value");
		value3 = scanner.nextInt();

		if(value1 > value2 && value1 > value3)
			System.out.println("Value1 is greater");
		else if(value2 > value3)
			System.out.println("Value2 is greater");
		else 
			System.out.println("Value3 is greater");
			
	}
}