package pack.com;

import java.util.Scanner;

public class ConditionalOperators {

	public static void main(String[] args) {
		//int i=9,k=2;
		//int p;
		//p=(i>k)?i:k;
		//System.out.println(" largest of "+i+" and "+k+" is "+p);
		//p=(i<k)?i:k;
		//System.out.println(" smallest of "+i+" and "+k+" is "+p);
		
		// for 3 no.s
		//int i=9,k=8,l=7;
		// b;
		//b=(i>k&&i>l)?i:(k>i&&k>l)?k:l;
		//.out.println("Largest of "+l+" and "+k+" and "+i+" is "+b);
		//to make it smaller use < symbol
		
		
		//4 no.s
		//int i=9,k=8,l=7,v=6;
		//int b;
		//=(i>k&&i>l&&i>v)?i:(k>i&&k>l&&k>v)?k:(l>i&&l>k&&l>v)?l:v;
		//.out.println("Largest of "+l+" and "+k+" and "+i+" is "+b);
		
		//conditional statements using greater than o or lesser than o
		
	int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	num=sc.nextInt();
	if(num>0) {
		System.out.println(" num is greater than zero" +num);
	}
	else {
		System.out.println(" num is lesser than zero" +num);
	
	}
		
		
		
		
		
			

	}

}
