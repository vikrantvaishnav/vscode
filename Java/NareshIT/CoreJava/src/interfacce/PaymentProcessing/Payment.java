package interfacce.PaymentProcessing;

public sealed interface Payment permits CreditCardPayment, DebitCardPayment, UPIPayment {
	void makePayment(double amount);
	void makeRefund(double amount);
}

