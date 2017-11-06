// command line arguments
// Scanner use

import java.lang.*;	//String or System
import java.util.Scanner;

class Sum{


	public static void main(String args[])
	{
		Integer first = 90;
		int first, second, result;
		
		//Scanner --> Predefined class --> User input or output or 		//error

		//step-1: Create object of Scanner class

		Scanner scanner =  new Scanner(System.in);	//Refernce 								//variable 
		
		System.out.println("Enter your first value");
		first = scanner.nextInt();

		System.out.println("Enter your second value");
		second = scanner.nextInt();
		
		result = first + second;	
	
		System.out.println("Result is = " + result);

		//String args[];		//Reference array




	}
}