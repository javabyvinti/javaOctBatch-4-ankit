package com.bmpl.javabasic;

public class BreakContinue {

	public static void main(String[] args) {
		
		//nested loop
		//outer loop
		for(int a = 1; a<=5;a++){
			System.out.println("a = "+a);
		
			//inner loop
		for(int i =1; i<=10; i++){
			if(i==5){
				continue;//skip current iteration
				//break;// to terminate
			}else{
				System.out.println(i);
			}
		}
		
		}
	}

}
