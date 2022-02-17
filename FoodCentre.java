package pack.com;

import java.util.Scanner;

public class FoodCentre {

	public static void main(String[] args) {
		int choice;
		float Tea=10,Coffee=30,quantity,amount;
Scanner sc=new Scanner(System.in);


        System.out.println("MENU");
		System.out.println("1.Tea=10");
		System.out.println("2.Coffee=30");
		System.out.println("please enter your choice");
		choice=sc.nextInt();
		System.out.println("Enter quantity:");
		quantity=sc.nextFloat();
		
		switch(choice) {
		case 1:Tea=sc.nextFloat();
		amount=Tea*quantity;
		System.out.println("The amount of tea is "+amount);
	    break;
		case 2:Coffee=sc.nextFloat();
		amount=Coffee*quantity;
		System.out.println("The amount of coffee is "+amount);
	    break;
		}
	}
	
	
		
			
			
		
					
			
		
		
		
		}
		
	



		
		
		

	


