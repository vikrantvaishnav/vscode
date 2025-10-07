package com.blc;

public class Discount {
	
	public static double calculateDiscount(double billAmount) {
		if(billAmount >= 5000) {
			return billAmount-billAmount*0.20;
		}
		else if(billAmount>=3000) {
			return billAmount- billAmount*0.15;
		}
		else if(billAmount>=1000) {
			return billAmount-billAmount*0.10;
		}
		else {
			return billAmount-billAmount*0.05;
		}
		
	}
}
