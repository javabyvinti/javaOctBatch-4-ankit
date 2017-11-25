package com.bmpl.inheritance;

class ParentNew{
	
	private int value1;//only accessed inside class
	int value3; // inside package
	protected int value2;//can be accessed outside through inheritance 
	public int value4;
	
}

class Child1 extends ParentNew{
	
	void result(){
		//int res = value1 + value2 + value3 + value4;
	}
}

class Child2{
	
	void result(){
		ParentNew p = new ParentNew();
		//int res = p.value1 + p.value2 + p.value3 + p.value4;
	}
	
}
public class Inheritance2 {

	private int value1;//only accessed inside class
	protected int value2;//can be accessed through inheritance
	int value3;
	public int value4;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
