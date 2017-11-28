package com.bmpl.inheritance;

class Account{
	
	protected int accountNumber;
	protected double principal;
	protected float rate;
	protected float time;
	
	Account(){}
	
	double interest(){
		return principal;
	}
	
	void display(){
		System.out.println("Account Number = " +accountNumber);
		System.out.println("Principal = "+principal);
		System.out.println("Rate = "+rate);
		System.out.println("Time = "+time);
	}
}

class SimpleInterest extends Account{
	
	double simpleInterest;

	
	SimpleInterest(){}
	
	SimpleInterest(double principal, float rate, float time){
		super.principal = principal;
		super.rate = rate;
		super.time = time;
	}
	
	double interest(){// override --> polymorphism
		simpleInterest = (principal * rate * time) / 100;
		return simpleInterest;
	}
	
	void display(){
		super.display();
		System.out.println("Interest is = " + simpleInterest);
	}
}

class CompoundInterest extends Account{
	
	double compoundInterest;
	
	double interest(){
		
		double result = principal *((1 + rate)/100);
		compoundInterest = Math.pow(result, time) - principal;
		 
		return compoundInterest;
	}
	
	void display(){
		super.display();
		System.out.println("Interest is = " + compoundInterest);
	}
	
}


public class Inheritance3 {

	public static void main(String[] args) {
		Account account = new Account();
//		account.principal = 10000;
//		account.rate = 3;
//		account.time = 2.5f;
		
		SimpleInterest simpleInterest = new SimpleInterest(20000.0, 3.0f, 2.5f);
		simpleInterest.interest();
		//System.out.println(simpleInterest.interest());
		simpleInterest.display();
	}

}
