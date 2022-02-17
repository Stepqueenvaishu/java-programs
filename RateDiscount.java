package pack.com;

import java.util.Scanner;

public class RateDiscount {

	public static void main(String[] args) {
		float rate,amount;
		Scanner sc=new Scanner(System.in);
		//amount=rate*discount/100
		System.out.println("Enter the rate of the product");
		rate=sc.nextFloat();
		if(rate>=1000 && rate<=2000) {
		amount=(rate*2)/100;
		}
		else if(rate>=2001 && rate<=4000) {
			amount=(rate*3)/100;
		}
		else if(rate>=4001 && rate<=6000) {
			amount=(rate*4)/100;
		}
		else {
			amount=(rate*5)/100;
		}
		System.out.println("discount " +amount);
		System.out.println("amount to be paid " +(rate-amount));
	}

	}
	
	
	
	

	
				

	


