package com.interfaceprogram.java;

public interface JavaInterface {

	int value = 20;
	
	void data(); // public abstract
	
	// interface are not 100% abstract from java 8
	
	default void print(){
		System.out.println("Print inside interface");
	}
	
	static void input(){
		System.out.println("Input inside interface");
	}
}
