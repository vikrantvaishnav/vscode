package com.elc;
import java.util.Scanner;
import com.blc.ProductInfo;

public class ProductDetail {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product details:");
		
		System.out.println("Enter ProductName:");
		String name = sc.nextLine();
		System.out.println("Enter ProductPrice:");
		double price = sc.nextDouble();
		System.out.println("Enter Product Id:");
		int id = sc.nextInt();
		
		ProductInfo pi = new ProductInfo();
		
		
		pi.setProductData(id, name, price);
		
		pi.getProductInfo();
		sc.close();
		
		
		
		
		
		
	}

}
