package interfacce.PaymentProcessing;

public non-sealed class DebitCardPayment implements Payment {
	private String bankName;
	
	public DebitCardPayment(String bankName) {
		this.bankName = bankName;
	}
	@Override
	public void makePayment(double amount) {
		IO.println("Starting checkout for amount RS :"+amount+"\nPaid RS :"+amount+" using Debit Card Bank : "+bankName);

	}

	@Override
	public void makeRefund(double amount) {
		IO.println("Order Canceled. Initiating Refund...\n"
				+ "Cancelling order for amount RS :"+amount
				+ "\nRefunded RS :"+amount+" to Debit Card Bank :"+bankName);

	}

}
