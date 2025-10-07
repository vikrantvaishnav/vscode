package com.elc;
import java.util.Scanner;
import com.blc.Calculators;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("1.Addition\n2.Subtration\n3.Multiplication\n4.division");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		
		
		System.out.println("Enter two number");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		
		
		
		switch(choice) {
		case 1: System.out.println("Addition of number ="+Calculators.addition(num1, num2));
		break;
		
		case 2: System.out.println("Subtraction of number ="+Calculators.subtraction(num1, num2));
		break;
		
		case 3: System.out.println("Multiplication of number ="+Calculators.multiplication(num1, num2));
		break;
		
		case 4: System.out.println("Division of number ="+Calculators.division(num1, num2));
		break;
		}
		
		

	}

}
