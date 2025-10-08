package com.blc;

public class NextMultipleOfHundred {
	public static int getNextMultipleOfHundred(int number) {
		
		number/=100;
		number++;
		number*=100;
		
		return number;
	}
}
