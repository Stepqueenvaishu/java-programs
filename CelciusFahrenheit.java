package pack.com;

import java.util.Scanner;

public class CelciusFahrenheit {

	public static void main(String[] args) {
		float celcius,fahrenheit,ans;
		int choice;
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter celcius value");
		celcius=sc.nextFloat();
		System.out.println(" Enter fahrenheit value");
		fahrenheit=sc.nextFloat();
		
System.out.println("*********WELCOME TO YOUR CHOICES*********");
		
		System.out.println("1.Celcius to fahrenheit");
		System.out.println("2.fahrenheit to celcius");
		System.out.println(" Enter choice");
		choice=sc.nextInt();	
		
		switch(choice) {
		case 1:fahrenheit =celcius *9/5+32;
		System.out.println("The celcius to fahrenheit value is "+fahrenheit);//ALT 0176 to get degree symbol 
        break;
		case 2:celcius =(fahrenheit-32)*5/9;
		System.out.println("The fahrenheit to celcius is "+celcius);
		break;
		default:System.out.println("Invalid Input");
		break;
		}

	}

}
