package interfacce.assignment2;

public abstract class Product {
	private String name;
	private double price;
	private String category;
	
	public Product(String name,double price, String category) {
		this.name = name;
		this.price = price;
		this.category = category;
		
	}
	
	public abstract double calculateTax();
	
	public abstract void applyDiscount(double percentage);

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product name = " + name + "\nprice = " + price + "\ncategory = " + category;
	}
	
	
	
	
}
