package com.bmpl.temppackage;

class GrandParent{
	
	int value = 10;
	
	GrandParent(){
		super();
		System.out.println("Default of GrandParent " + value);
	}
	
}

class Parent extends GrandParent{
	
int value = 20;
	
	Parent(){
		super();
		System.out.println("Default of Parent " + value);
	}
	
	Parent(int value){
		super();
		this.value = value;
	}
}

class ChildNew  extends Parent{

int value = 30;
	
	ChildNew(){
		this(5);
		//super(4);
		//super(); //always point to the parent
		System.out.println("Default of ChildNew " + value);
	}
	
	ChildNew(int data){		
		System.out.println("Param cons "+data);
	}
	
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		
		ChildNew obj = new ChildNew();
		
	}
}