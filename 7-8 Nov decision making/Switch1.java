package com.bmpl.javabasic;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		
		// character is vowel or consonant
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your character");
		
		char userChoice = scanner.next().toLowerCase().charAt(0);
		
		//String userData = scanner.next();
		
		// switch(condition)
		
		
		switch(userChoice){// a
			//cases
		
//		case "Monday": // userChoice == 'a'
//			System.out.println("10% discount");
//		break;

		case 'a':
	//	case 'A': 
		case 'e':
	//	case 'E':
		case 'i':
	//	case 'I':
		case 'o':
	//	case 'O':
		case 'u':
	//	case 'U':
			System.out.println("Vowel");
		break;
		
		default:
			System.out.println("Consonant");
		break;
		}
		
		System.out.println("Exited from switch");

	}

}
