package pack.com;

import java.util.Scanner;

public class VowelsCase {

	public static void main(String[] args) {
		char ch;
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		switch(ch) {
		case 'a': System.out.println("a is a vowel");// or ("vowel");
		break;
		case 'e': System.out.println("e is a vowel");
		break;
		case 'i': System.out.println("i is a vowel");
		break;
		case 'o': System.out.println("o is a vowel");
		break;
		case 'u': System.out.println("u is a vowel");
		break;
		
			// to get vowels in uppercase use the same program using uppercase letter with case 'A' like that.
		// IT IS ENOUGH TO USE ONE DEFAULT STATEMENT IN SAME CASE IF WE USE
		case 'A': System.out.println("A is a vowel");// or ("vowel");
		break;
		case 'E': System.out.println("E is a vowel");
		break;
		case 'I': System.out.println("I is a vowel");
		break;
		case 'O': System.out.println("O is a vowel");
		break;
		case 'U': System.out.println("U is a vowel");
		break;
		default:
			System.out.println("It is not a vowel");
			
		
		
		}
		

	}

}
