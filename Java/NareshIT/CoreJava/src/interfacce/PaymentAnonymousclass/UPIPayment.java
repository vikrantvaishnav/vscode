package interfacce.PaymentAnonymousclass;

public non-sealed class UPIPayment implements Payment {

	@Override
	public void processPayment() {
		IO.println("Processing UPI payment...");

	}

	@Override
	public void applyDiscount() {
		IO.println("Applying 5% discount for UPI payment");

	}

}
