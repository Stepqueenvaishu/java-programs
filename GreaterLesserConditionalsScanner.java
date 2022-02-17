package pack.com;

import java.util.Scanner;

public class GreaterLesserConditionalsScanner  {

	public static void main(String[] args) {
		int num1,num2;  // 2no.s condition scanner type
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		num1=sc.nextInt();
		System.out.println("Enter second number");
		num2=sc.nextInt();
		if(num1>num2) {
			System.out.println("num1 is greater than "+num2);
		}
		else if(num2>num1){
			System.out.println("num2 is greater than "+num1);
		}
		else {
			System.out.println("Both numbers are equal");
		}
	
	}
}


	
			
		
			
			
		
		

	


