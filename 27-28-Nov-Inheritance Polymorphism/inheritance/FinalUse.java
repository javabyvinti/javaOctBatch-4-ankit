package com.bmpl.inheritance;

/*final*/ class Data{	// class cannot be inherited
	
	int value = 10;	// instance variable
	final int VALUE1 = 5; // static value means value is fixed and cannot be changed
	
	final void print(){ // cannot be override
		value++;
		value = value + VALUE1;
	}
	
	void input(){	// default- inside package
		
	}
	
}

class SubData extends Data{
	
	void input(){ // access specifier
		//return name;	//method creation	--> method overloading
	}
	
//	@Override
//	void print(){//override
//		
//	}
}

class SubData2 /*extends String*/{
	
}
public class FinalUse {

	public static void main(String[] args) {
		

	}

}
