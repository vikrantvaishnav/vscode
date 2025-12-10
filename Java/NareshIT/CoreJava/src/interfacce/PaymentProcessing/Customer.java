package interfacce.PaymentProcessing;

public class Customer {
	void main() {
		double totalAmount = Double.parseDouble(IO.readln("Enter your total bill Amount:"));
		int choise = Integer.parseInt(IO.readln("Choose Payment Method:\n1. Credit Card\n2. Debit card\n3. UPI\n Enter your Choise:"));
		
	switch(choise) {
		case 1 ->{
			
			String name = IO.readln("Enter your name:");
			CreditCardPayment credit = new CreditCardPayment(name);
			ShoppingCart cart = new ShoppingCart(totalAmount);
			cart.checkout(credit);
			IO.println();
			cart.cancelOrder(credit);
		
		}
		case 2 ->{
			
			String name = IO.readln("Enter Bank name:");
			DebitCardPayment debit = new DebitCardPayment(name);
			ShoppingCart cart = new ShoppingCart(totalAmount);
			cart.checkout(debit);
			IO.println();
			cart.cancelOrder(debit);
		
		}
		case 3 ->{
			
			String name = IO.readln("Enter UPI Id:");
			UPIPayment upi = new UPIPayment(name);
			ShoppingCart cart = new ShoppingCart(totalAmount);
			cart.checkout(upi);
			IO.println();
			cart.cancelOrder(upi);
		}
	}
		
		
		
	}
}
