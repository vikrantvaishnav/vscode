package interfacce.assignment2;

public class PhysicalProduct extends Product{
	
	private double shippingWeight;
	
	public PhysicalProduct(String name, double price, String category ,double shippingWeight) {
		super(name,price,category);
		this.shippingWeight = shippingWeight;
	}
	
	@Override
	public void applyDiscount(double percentage) {
		double discountAmount = getPrice()*(percentage/100);
		setPrice(getPrice()-discountAmount);
		IO.println("Discount :"+ percentage + "%");
		IO.println("Updated Price: "+getPrice());
	}
	
	@Override
	public double calculateTax() {
		return getPrice() * 0.08; 
	}
	
	public double calculateShippingCost() {
		double costPerKg = 5.0; 
		return shippingWeight * costPerKg;
	}

	@Override
	public String toString() {
		return ""+ super.toString() + "\nShipping Weight= " + shippingWeight+ " kg";
	}
	
	
}
