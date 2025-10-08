package com.elc;
import com.blc.NextMultipleOfHundred;
import java.util.Scanner;

public class NextMultiple {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int num = sc.nextInt();
		
		
		System.out.println("Multiple: "+NextMultipleOfHundred.getNextMultipleOfHundred(num));
		
		
	}

}
