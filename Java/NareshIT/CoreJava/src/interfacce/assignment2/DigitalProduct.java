package interfacce.assignment2;

public class DigitalProduct extends Product{
	private String licenceKey;
	
	public DigitalProduct(String name, double price, String category,String licenceKey) {
		super(name, price, category);
		this.licenceKey = licenceKey;
		
	}
	
	@Override
	public void applyDiscount(double percentage) {
		double discountAmount = (percentage / 100) * getPrice();
		IO.println("Discount :"+ percentage + "%");
		setPrice(getPrice() - discountAmount);
		IO.println("Updated Price: "+getPrice());
	}
	
	@Override
	public double calculateTax() {
		return getPrice() * 0.05; 
	}

	@Override
	public String toString() {
		return ""+ super.toString() + "\nlicence Key=" + licenceKey ;
	}
	
	

	
}
