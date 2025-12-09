package interfacce.assignment2;

public class ProductStore {

	void main() {
		
		int choice = Integer.parseInt(IO.readln());
		String name = IO.readln();
		double price = Double.parseDouble(IO.readln());
		String category = IO.readln();
		double discountPercentage = Double.parseDouble(IO.readln());
		
		switch(choice) {
		
			case 1 -> {
			double shippingWeight = Double.parseDouble(IO.readln());
			PhysicalProduct physicalProduct = new PhysicalProduct(name, price, category, shippingWeight);
			IO.println(physicalProduct.toString());
			physicalProduct.applyDiscount(discountPercentage);
			IO.println("Tax: " + physicalProduct.calculateTax());
			IO.println("Shipping Cost: " + physicalProduct.calculateShippingCost());
		}
			case 2 -> {
			String licenceKey = IO.readln();
			DigitalProduct digitalProduct = new DigitalProduct(name, price, category, licenceKey);
			IO.println(digitalProduct.toString());
			digitalProduct.applyDiscount(discountPercentage);
			IO.println("Tax: " + digitalProduct.calculateTax());
			
		}
		


}
	}
}
