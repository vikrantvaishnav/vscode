package com.string;

public class PaymentProcessing {
		void main(){
			
			int choice = Integer.parseInt(IO.readln());
			
			switch(choice) {
			case 1 -> {
				Payment credit = new CreditCardPayment();
				paymentgateway(credit);
			}
			case 2 -> {
				Payment debit = new DebitCardPayment();
				paymentgateway(debit);
			}
			case 3 -> {
				Payment upi = new UpiPayment();
				paymentgateway(upi);
			}
			default -> IO.println("Invalid Choice");
			}
		}
			
		public void paymentgateway(Payment ...payments) {
			
			for(Payment payments1 : payments ) {
				payments1.processPayment();
			}
		}
		



		
}

class Payment{
	public void processPayment(){
		IO.println("Processing Payment");
	}
}
	
	class CreditCardPayment extends Payment{
		
		@Override
		public void processPayment() {	
			IO.println("Processing credit card payment");
		}
	}
	
	class DebitCardPayment extends Payment{
		@Override
		public void processPayment() {
			IO.println("Processing debit card payment");
		}
	}
	
	class UpiPayment extends Payment{
		@Override
		public void processPayment() {
			IO.println("Processing UPI payment");
		}
	}
