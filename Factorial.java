package pack.com;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,num,factorial=1;
		System.out.println("Enter the number:");
		num=sc.nextInt();
		i=num;
		while(i>=1) {
			factorial=factorial*i;
			i=i-1;
		}
			System.out.println("factorial of "+num+" is "+factorial);
		}
		
			
		}

	


