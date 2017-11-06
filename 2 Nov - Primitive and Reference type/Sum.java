class Sum{

	public static void main(String args[])
	{
		int firstValue;
		int secondValue;

		// two ways
		// --> by command line arguments
		// --> by using Scanner

		// Wrapper classes --> wrap data from one type to another
	
		//Integer integer = new Integer();	//constructor	
		//new --> new memory allocation
		
		firstValue = Integer.parseInt(args[0]);	//10
		secondValue = Integer.parseInt(args[1]);	

		int result = firstValue + secondValue;
		
		System.out.println("Result is= " + result);

	}



}

		//type cast
//		int f = 6554;
//		float i = (float)f;

//	--> primitive datatype --> int, float, char, long, byte, short, //boolean, double

	--> non-primtive --> type cast --> help wrapper classes


