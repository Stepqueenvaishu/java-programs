package pack.com;

import java.util.Scanner;

public class ConditionalScannerType {

	public static void main(String[] args) {
		//largest of 4 no.s
		int a,b,c,d,num1,num2,num3,num4,larg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a");
		a=sc.nextInt();
		System.out.println("Enter b");
		b=sc.nextInt();
		System.out.println("Enter c");
		c=sc.nextInt();
		System.out.println("Enter d");
		d=sc.nextInt();
		larg=(a>b&&a>c&&a>d)?a:(b>a&&b>c&&b>d)?b:(c>a&&c>b&&c>d)?c:d;
		System.out.println("largest of "+a+" and "+b+" and "+c+" and "+d+" is "+larg);
		
		
		

	}

}
