package pack.com;

import java.util.Scanner;

public class Divisiblity {

	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		n=sc.nextInt();
		if(n%5==0 && n%3==0) {
			System.out.println("Divisible by 5 and 3");
		}
			else if(n%3==0) {
				System.out.println(n+" is only divisible by 3");
			}
				else if(n%5==0) {
					System.out.println(n+" is only divisible by 5");
				}
				else {
					System.out.println("Not divisible by both numbers");
				}
					
		
		}
		
			
		
		

	}


