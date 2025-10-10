package com.blc;

public class ProductInfo {
	
	int productId;
	String productName;
	double productPrice;
	
	public void setProductData(int id, String name, double price) {
		this.productId = id;
		this.productName = name;
		this.productPrice = price;
		
		
	}
	
	public void getProductInfo() {
		System.out.println("productId= "+productId+"\nProductName = "+productName+"\nProductPrice = "+productPrice);
		
	}
}
