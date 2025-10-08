package com.elc;
import com.blc.DifferenceOfDigits;
import java.util.Scanner;
public class Difference {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int number = sc.nextInt();
		
		
//		int diff = DifferenceOfDigits.getDiffOfDigits(number);
//		
//		System.out.println("Difference :"+diff);
		
		System.out.println("Diff: "+DifferenceOfDigits.getDiffOfDigits(number));
		
		
		
		

	}

}
