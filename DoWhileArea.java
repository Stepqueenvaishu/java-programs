package pack.com;

import java.util.Scanner;

public class DoWhileArea {

	public static void main(String[] args) {
		int choice;
		char ch;
		float b,l,h,rad,a,ans;
		
		Scanner sc=new Scanner(System.in);
		do {
		
		
		System.out.println("Enter breadth value");
		b=sc.nextFloat();
		System.out.println("Enter height value");
		h=sc.nextFloat();
		System.out.println("Enter length value");
		l=sc.nextFloat();
		System.out.println("Enter area value");
		a=sc.nextFloat();
		System.out.println("Enter radius value");
		rad=sc.nextFloat();
		
		
		System.out.println("**********MENU************");
		
		System.out.println("1.Triangle");
		System.out.println("2.Rectangle");
		System.out.println("3.Square");
		System.out.println("3.Circle");
		System.out.println("please Enter your choice");
		choice=sc.nextInt();
		
		switch(choice) {
		case 1: ans=0.5f*b*h;
		         System.out.println(" Area of Triangle "+b+" and "+h+" is "+ans);
		         break;
		case 2:ans=l*b;
        		System.out.println(" Area of rectangle"+l+" and "+b+" is "+ans);
        		break;
		case 3:ans=a*a;
		        System.out.println(" Area is "+ans);
		        break;
		case 4:ans=3.14159f *rad *rad;
		       System.out.println("Area of circle is "+ans);
		       break;
		
        		
        default:System.out.println("Invalid input");
		
		}
		System.out.println("Do you want to continue Y/N");
		ch=sc.next().charAt(0);
		}while(ch!='N');
		System.out.println("Exit your calculation");
		
		
		
		
		
	}



	




	




	



	}


