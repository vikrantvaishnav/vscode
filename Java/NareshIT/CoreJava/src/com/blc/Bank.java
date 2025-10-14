package com.blc;

public class Bank {
	
	private String customerName;
	private Integer accountNumber;
	private Double currentBalance;
	
	static String bankName ="SBI";
	static String bankAddress = "Ameerpet";
	static String bankIFSCCode = "SBI000123";
	
	public void setCustomerDetails(String customerName,Integer accountNumber,Double balance) {
		
		this.customerName = customerName;
		this.accountNumber = accountNumber;
		
		if(balance<=0) {
			System.err.println("Amount should be Positive");
			System.exit(0);
		}
		else {
			this.currentBalance = balance;
			System.out.println("Customer account Created Successfully!");
		}
	}
	
	public void withdraw(Double amount) {
		
		if(amount>this.currentBalance) {
			System.out.println("you have insufficent balance");
			System.exit(0);
		}
		else {
			this.currentBalance-= amount;
			System.out.println(displayDetails());
		}
			
	}
	
	public void deposit(Double amount) {
		if(amount<=0) {
			System.err.println("Amount should be Positive");
			System.exit(0);
		}
		else {
			this.currentBalance+=amount;
			System.out.println("Deposit successful!");
			System.out.println(displayDetails());
		}
		
	}
	
	public Double getCurrentBalance() {
		
		return this.currentBalance;
	}
	
	public String displayDetails() {
		
		return toString();
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", AccountNumber=" + accountNumber + ", CurrentBalance="
				+ currentBalance + "]";
	}

	
}
