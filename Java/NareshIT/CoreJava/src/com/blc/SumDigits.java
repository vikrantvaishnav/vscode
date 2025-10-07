package com.blc;

public class SumDigits {
	
	public static int sum(int num) {
		int sum=0;
		while(num!=0) {
			int temp = num%10;
			sum+=temp;
			num/=10;
		}
		
		return sum;
	}
}
