package pack.com;

import java.util.Scanner;

public class MyCalculatorASMD {

	public static void main(String[] args) {

		int firstnum,secondnum,ans,choice;
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter firstnumber");
		firstnum=sc.nextInt();
		System.out.println("Enter secondnumber");
		secondnum=sc.nextInt();
		
		System.out.println("**********MENU************");
		
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Remainder");
		System.out.println("please Enter your choice");
		choice=sc.nextInt();
		
		switch(choice) {
		case 1: ans=firstnum+secondnum;
		         System.out.println("addition of "+firstnum+" and "+secondnum+" is "+ans);
		         break;
		case 2:ans=firstnum-secondnum;
        		System.out.println("difference of "+firstnum+" and "+secondnum+" is "+ans);
        		break;
		case 3: ans=firstnum*secondnum;
        System.out.println("  Multiplication of "+firstnum+" and "+secondnum+" is "+ans);
        break; 
       case 4:ans=firstnum/secondnum;
		System.out.println("  Division of "+firstnum+" and "+secondnum+" is "+ans);
		break;
       case 5:ans=firstnum%secondnum;
       System.out.println("Remainder of "+firstnum+" and "+secondnum+" is "+ans);
       break;
        default:System.out.println("Invalid input");
		
		}
		
		
		
	}



	}


