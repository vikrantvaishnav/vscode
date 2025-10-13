package oops;

import java.util.Scanner;

public class switchdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Subject grade [A/B/C/D/E]");
		char grade = sc.nextLine().toUpperCase().charAt(0);
		String result = switch(grade)
		{
		case 'A', 'B' -> "Excellent";
		case 'C' -> "Very good";
		case 'D' -> "Good";
		case 'E' -> "Average";
		default -> "Invalid";
		};
		System.out.println("Your grade is: "+result);
		sc.close();
		}

	}






