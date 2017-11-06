class ReferenceType{


	public static void main(String args[]){

		int value1 = 10;	//primitive
		int value2 = 10;
		
		//Integer value1 = new Integer(20);
		//Integer value2 = 10;
		
		//Integer --> equals()
		//String --> 
		// Float --> Long, Double
		//System.out.println(value1 == value2);


		String name1 = new String("Ram");
		String name2 = new String("ram");


		System.out.println(name1.equalsIgnoreCase(name2));

	}


}