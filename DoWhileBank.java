package pack.com;

import java.util.Scanner;

public class DoWhileBank {

	public static void main(String[] args) {
		int choice;
		char ch;
		float deposit_amount,withdrawal_amount,Balance_amount, amount=20000;
Scanner sc=new Scanner(System.in);
System.out.println("**********MENU************");
		do {
		System.out.println("1.deposit amount");
		System.out.println("2. withdrawal amount");
		System.out.println("3.Balance amount");
		System.out.println("please Enter your choice");
		choice=sc.nextInt();
		
		switch(choice) {
		case 1: System.out.println("Enter deposit amount");
		deposit_amount=sc.nextFloat();
		if(deposit_amount>0) {
		amount=amount+deposit_amount;
		System.out.println(" your deposit amount is "+amount);
		}
		else {
			System.out.println("Invalid deposit amount");	
		}
		break;
		case 2:System.out.println("Enter withdrawal amount");
		withdrawal_amount=sc.nextFloat();
	    if(withdrawal_amount<amount) {
		amount=amount-withdrawal_amount;
		System.out.println("your withdrawal amount is "+amount);
	    }
	    else {
	    	System.out.println("Insufficient balance");
	    }
	    break;
		case 3: 
		System.out.println("Balance amount is "+amount);
		
		break;
		default:System.out.println("Invalid input");
		}
		System.out.println("Do you want to continue Y or N");
	    ch=sc.next().charAt(0);
		}while(ch!='N');
		System.out.println("Exit");
		
			
		
					
			}
		
		
		
		
		
	




	}


