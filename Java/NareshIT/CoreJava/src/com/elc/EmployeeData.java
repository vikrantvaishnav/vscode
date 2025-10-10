package com.elc;

import java.util.Scanner;

import com.blc.ProductInfo;

public class EmployeeData {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee details:");
		
		System.out.println("Enter EmployeeName:");
		String name = sc.nextLine();
		System.out.println("Enter EmployeeSalary:");
		double price = sc.nextDouble();
		System.out.println("Enter Employee Id:");
		int id = sc.nextInt();
		
		ProductInfo pi = new ProductInfo();
		
		
		pi.setProductData(id, name, price);
		
		pi.getProductInfo();
		sc.close();

	}

}
