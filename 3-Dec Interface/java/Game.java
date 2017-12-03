package com.interfaceprogram.java;

public interface Game {

	int value = 10;
	public final static int MAXLIFE = 10; // by default final by default static by default scope --> public
	int MINLIFE = 1;
	
	public abstract void jump();// by default abstract by default scope--> public

	void walk();
	
	void attack();
	
	void idle();
	
	void run();
	
}
