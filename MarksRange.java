package pack.com;

import java.util.Scanner;

public class MarksRange {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		char grade;
		System.out.println("Enter student grade");
		grade=sc.next().charAt(0);
		if(grade=='A') {
		System.out.println("Your marks range is 90-100");
		}
		else if(grade=='B') {
		System.out.println("Your marks range is 70-89");
		}
	    else if(grade=='C') {
	    System.out.println("Your marks range is 40-69");
	    }
	    else if( grade=='D') {
	    System.out.println("Your marks range is 0-39");
	    }
	    else {
	    	System.out.println("Invalid grade");
	    }
	
	    	
	    
	}    
	    	
	    	
	    
	    
		
			
		
		
		

	}


