package com.interfaceprogram.java;

public class Demo implements JavaInterface, Game{

	public static void main(String[] args) {
		
		System.out.println(Game.value);
		
		System.out.println(JavaInterface.value);
		
		Demo obj = new Demo();
		obj.data();
		obj.print();

		JavaInterface obj1;
		
	}

	@Override
	public void data() {
		System.out.println("Data");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		JavaInterface.super.print();
		System.out.println("Called inside a class");
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void idle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
