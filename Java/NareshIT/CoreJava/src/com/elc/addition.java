package com.elc;
import com.blc.SumDigits;
import java.util.Scanner;

public class addition {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		
		int num = Integer.parseInt(sc.nextLine());
		
		System.out.println("Sum of two digits = "+SumDigits.sum(num));
		

	}

}
