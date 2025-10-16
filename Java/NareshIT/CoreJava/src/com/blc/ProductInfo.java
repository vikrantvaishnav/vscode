package com.blc;

public class ProductInfo {
	
	private Integer productId;
	private String productName;
	private Double productPrice;
	
	public void setProductData(Integer productId, String productName, double productPrice) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		
//		System.out.println(this.toString());
//		this.calculateDiscount();
	}
private Double discountAmount;	
	public void calculateDiscount() {
		
		if(this.productPrice>5000) {
			this.discountAmount=this.productPrice*0.15;
		}
		else if(this.productPrice>=1000) {
			this.discountAmount=this.productPrice*0.10;
		}
		else{
			this.discountAmount=this.productPrice*0.05;
		}
		

		System.out.println("Discount Amount:"+discountAmount);
		System.out.println("Price After Discount:"+(productPrice-discountAmount));
		
	}

	@Override
	public String toString() {
		
		return "ProductInfo [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	
	
	
	
	
}
