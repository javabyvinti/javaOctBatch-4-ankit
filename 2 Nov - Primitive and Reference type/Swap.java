class Swap{


	public static void main(String args[]){

		int x = 20, y = 30, z;

		x = x + y;	// 20 + 30 = 50
		y = x - y;	//50 - 30 = 20
		x = x- y;	//50 - 20 = 30
		
		//z = x;
		//x = y;
		//y = z;
				
		System.out.println("X is = "+x);
		System.out.println("Y is = "+y);


	}
}