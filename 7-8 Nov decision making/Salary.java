import java.util.Scanner;

class Salary{

	public static void main(String args[])
	{

		int basicSalary, hra, da, ta, netSalary;
		int pf = 1400;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your basic salary");
		basicSalary = scanner.nextInt();		
		
		hra = (30 * basicSalary)/100;
		da = (20 * basicSalary)/100;
		ta = (10 * basicSalary)/100;

		int allowances = hra + da + ta;
		netSalary = basicSalary + allowances - pf;
		
		System.out.println("Net Salary = " +netSalary);	
		System.out.println("HRA = "+hra);	
		System.out.println("DA = "+da);
		System.out.println("TA = "+ta);	

	}
}