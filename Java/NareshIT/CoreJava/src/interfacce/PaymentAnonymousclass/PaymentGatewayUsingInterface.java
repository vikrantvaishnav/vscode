package interfacce.PaymentAnonymousclass;

public class PaymentGatewayUsingInterface {

	void main(){
		String type = IO.readln("Enter Payment Type [CreditCard / UPI]: ");
		PaymentGateway gateway = new PaymentGateway();
		if(type.equalsIgnoreCase("CreditCard")) {
			Payment pay = gateway.initiatePayment("CreditCardPayment");
			pay.processPayment();
			pay.applyDiscount();
		}
		else if(type.equalsIgnoreCase("UPI")) {
			Payment pay = gateway.initiatePayment("UPIPayment");
			pay.processPayment();
			pay.applyDiscount();
		}
		else {
			IO.println("Invalid payment type selected!");
			System.exit(0);
		}
		
		
	}

}
