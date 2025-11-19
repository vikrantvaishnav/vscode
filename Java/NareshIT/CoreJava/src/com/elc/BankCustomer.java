package com.elc;
import java.util.Scanner;
import com.blc.Bank;
public class BankCustomer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Bank c1 = new Bank();
		System.out.println("Enter Customer Name");
		 String customerName = sc.nextLine();
		 System.out.println("Enter Account Number");
		Integer accountNumber = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Openinng Balance");
		Double currentBalance= sc.nextDouble();
		
		c1.setCustomerDetails(customerName,accountNumber
				,currentBalance);
		
		
		while(true) {
			System.out.println("======MENU=====");
			System.out.println("1. Deposit\n2. Withdraw\n3. Check Balance\n4. Display Customer Details\n5. Exit");
			
			System.out.print("Enter your choice: ");
			int choise = sc.nextInt();
			switch(choise) {
			case 1 -> {
				System.out.println("Enter deposit amount");
				Double Balance= sc.nextDouble();
				c1.deposit(Balance);
				}
			case 2 ->{
				System.out.println("Enter withdraw amount");
				Double Balance= sc.nextDouble();
				c1.withdraw(Balance);
				}
			case 3 ->{
				System.out.println("You current Balace:"+c1.getCurrentBalance() );
			}
			
			};
		}
		
		
		

	}

}
