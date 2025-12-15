package interfacce.PaymentAnonymousclass;

public sealed interface Payment permits CreditCardPayment, UPIPayment {
	public abstract void processPayment();
	public abstract void applyDiscount();
	
	
}
