class Swap{
	
	public static void main(String args[])
	{
		int value1 = 30, value2 = 20;

		// 30 + 20 = 50 --> value1
		value1 = value1 + value2;

		//50 - 20 = 30(value2)
		value2 = value1 - value2;					
		//50 - 30 = 20
		value1 = value1 - value2;
		
		System.out.println("Value1 is= " +value1);
		System.out.println("Value2 is= " +value2);
	
	}
}