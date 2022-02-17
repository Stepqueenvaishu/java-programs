package p1;

import java.util.Scanner;

public class ScannerModel {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int i;
	float f;
	double d;
	char ch;
	String n;
	System.out.println("Enter your name"); 
	n=sc.nextLine();
	System.out.println("Enter float value");
	f=sc.nextFloat();
	System.out.println("Enter integer value");
	i=sc.nextInt();
	System.out.println("Enter double value");
	d=sc.nextDouble();
	System.out.println("Enter character value");
	ch=sc.next().charAt(0);
	System.out.println("integer i ="+i);
	System.out.println("float f = "+f);
	System.out.println("char ch="+ch);
	System.out.println("double d="+d);
	System.out.println("string n ="+n);
	}
}
	
	
	


