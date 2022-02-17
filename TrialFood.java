package pack.com;

import java.util.Scanner;

public class TrialFood {

	public static void main(String[] args) {
		int t=10,c=20,m=90,tea_quantity,coffee_quantity,choice;
		
		float quantity,amount;
Scanner sc=new Scanner(System.in);



System.out.println("*****MENU*******");
System.out.println("1.tea=10");
System.out.println("2.coffee=20");
System.out.println("3.milkshake=90");
System.out.println("4.tea and coffee");
System.out.println("please enter your choice");
choice=sc.nextInt();
System.out.println("Enter quantity:");
quantity=sc.nextFloat();


	switch(choice) {
		case 1:
		amount=t*quantity;
		System.out.println("The amount of tea is "+amount);
		
	break;
	    case 2:
	    amount=c*quantity;
	System.out.println("The amount of coffee is "+amount);
	
	break;
   case 3:
   amount=m*quantity;
    System.out.println("The amount of milkshake is "+amount);

break;
   case 4:System.out.println("Enter tea quantity:");
   tea_quantity=sc.nextInt();
   System.out.println("Enter coffee quantity:");
   coffee_quantity=sc.nextInt();
   amount=t*tea_quantity+c*coffee_quantity;
  
   System.out.println("The amount of tea and coffee is "+amount);
   break;
   
   default:System.out.println(" Sorry!! FOOD IS NOT AVAILABLE");
   System.out.println("welcome again");
	}
	}
}

   


	

