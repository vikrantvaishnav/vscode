package interfacce.PaymentProcessing;

public non-sealed class CreditCardPayment implements Payment {
	private String cardHolderName;
	
	public CreditCardPayment(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	@Override
	public void makePayment(double amount) {
		IO.println("Starting checkout for amount RS :"+amount+"\nPaid RS :"+amount+" using Credit Card Holder : "+cardHolderName);

	}

	@Override
	public void makeRefund(double amount) {
		IO.println("Order Canceled. Initiating Refund...\n"
				+ "Cancelling order for amount RS :"+amount
				+ "\nRefunded RS :"+amount+" to Credit Card Holder :"+cardHolderName);

	}

}
