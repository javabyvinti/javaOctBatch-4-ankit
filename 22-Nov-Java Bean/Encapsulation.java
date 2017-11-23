package com.bmpl.javabasic;

import java.util.Scanner;

//Encapsulation --> wrapping up of data into a single unit
// best eg--> class
// Good encapsulation--> Java Bean
// instance variables--> private
// methods			 -->  public
// getters and setters --> method --> individual field

//POJO --> Pure old java object

public class Encapsulation {


	//instance variable
	private int salary;
	private int id;
	private String name;
	private Long phn;
	
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if(id<0){
			System.out.println("Only Positive are allowed");
		} else{
			this.id = id;	
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhn() {
		return phn;
	}

	public void setPhn(Long phn) {
		String phone = phn.toString();
		//System.out.println("Phone length = " + phone.length());
		if(phn<0 || phone.length()<10){
			System.out.println("only positive and 10 numbers are allowed");
		}
		else{
			this.phn = phn;
		}
	}


	
	/*public void input()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name");
		name = scanner.nextLine();//deal with word without spaces
		//nextLine()--> sencentences or word with spaces
		System.out.println("Enter your phn");
		phn = scanner.nextLong();
		
		System.out.println("Enter your id");
		id = scanner.nextInt();
		
	}*/
	
	
/*	public Encapsulation(int salary){//param cons
		this.salary = salary;
	}*/

	/*public void print(){
		System.out.println("Name is = "+name);
		System.out.println("salary is = "+salary);
		System.out.println("id is = "+id);
		System.out.println("Phn is = "+phn);
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
