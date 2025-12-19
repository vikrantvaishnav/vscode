package lambda_Expression.applyFunction;

import java.util.function.Function;

public class CalculateProductDiscount1 {
	void main() {
		Function<Product,Double> fun = (pro)->{
			if(pro.price()>5000) {
				return pro.price() - (pro.price()*0.10);
			}
			return pro.price() - (pro.price()*0.05);
		
		};
		
		Integer id = Integer.parseInt(IO.readln("Enter id:"));
		String name = IO.readln("Enter name:");
		Double price = Double.parseDouble(IO.readln("Enter Price:"));
		
		Product p1 = new Product(id,name,price);
		
		IO.println("Final price"+fun.apply(p1));
		
		
	}
}

record Product(Integer id, String name, Double price) {
	
}