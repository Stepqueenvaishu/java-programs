package pack.com;

import java.util.Scanner;

public class SimpleInterestScanner {

	public static void main(String[] args) {
float p,t,r,s;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
p=sc.nextFloat();
System.out.println("Enter the time");
t=sc.nextFloat();
System.out.println("Enter the rate");
r=sc.nextFloat();
s=(p*t*r)/100;
System.out.println("simple interest "+s);







	}

}
