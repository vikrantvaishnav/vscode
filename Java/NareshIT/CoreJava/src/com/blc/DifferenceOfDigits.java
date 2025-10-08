package com.blc;

public class DifferenceOfDigits {
	public static int getDiffOfDigits(int number) {
		
		
		int num1=number%10;
				
		int num2 =number/10;
		
		return num2-num1;
	}
}
