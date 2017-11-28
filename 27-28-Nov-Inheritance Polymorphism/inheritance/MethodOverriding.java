package com.bmpl.inheritance;

class Bank{

	void deposit(){
		
	}
	
	void withdraw(){
		
	}
	
	void checkBalance(){
		
	}
	
	void rateOfInterest(){
		System.out.println("Minimum is 2%");
	}
	
}

class ICICI extends Bank{
	
	@Override
	void rateOfInterest() {
		super.rateOfInterest();
		System.out.println("Rate of Interest = 5%");
	}

	void doorToDoorService(){
		
	}
}


class PNB extends Bank{
	
}

public class MethodOverriding {

	public static void main(String[] args) {
		ICICI obj = new ICICI();// upcasting are automatic or implicit --> inheritance
// Downcasting are explicit or forcefully --> scope of object is bigger but we are reducing that scope

	}

}
