package interfacce.PaymentProcessing;

public class ShoppingCart {

	private double totalAmount;
	
	public ShoppingCart(double totalAmount) {
		this.totalAmount = totalAmount;
		
	}
	
	public void checkout(Payment pay) {
		
		pay.makePayment(totalAmount);
	}
	
	public void cancelOrder(Payment refund) {
		refund.makeRefund(totalAmount);
	}
}
 