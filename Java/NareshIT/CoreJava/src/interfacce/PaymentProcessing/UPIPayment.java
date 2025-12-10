package interfacce.PaymentProcessing;

public non-sealed class UPIPayment implements Payment {
	
	private String upiId;
	
	public UPIPayment(String upiId) {
		this.upiId = upiId;
	}
	@Override
	public void makePayment(double amount) {
		IO.println("Starting checkout for amount RS :"+amount
				+ "\nPaid RS "+amount+" using UPI ID : "+upiId);

	}

	@Override
	public void makeRefund(double amount) {
		IO.println("Order Canceled. Initiating Refund...\n"
				+ "Cancelling order for amount RS :"+amount
				+ "Refunded RS "+amount+"to UPI ID : "+upiId);

	}

}
