package interfacce.PaymentAnonymousclass;

public class PaymentGateway {

	public Payment initiatePayment(String paymentType) {
		if(paymentType.equalsIgnoreCase("CreditCardPayment")) {
			IO.println("Initiating Credit Card payment");
			CreditCardPayment credit = new CreditCardPayment();
			return credit;
			
		}
		else if(paymentType.equalsIgnoreCase("UPIPayment")) {
			IO.println("Initiating UPI payment");
			return new UPIPayment();
		}
		return null;
	}
	

}
