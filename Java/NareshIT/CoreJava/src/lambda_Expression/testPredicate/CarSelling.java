package lambda_Expression.testPredicate;
import java.util.function.Predicate;

record Car(String brand, Double price, Integer mileage){
	
}

public class CarSelling {

	void main() {
		String brand = IO.readln("Enter brand name:");
		Double price = Double.parseDouble(IO.readln("Enter price: "));
		Integer mileage = Integer.parseInt(IO.readln("Enter mileage: "));
		
		Car car = new Car(brand,price,mileage);
	


	Predicate<Car> pre = (car1)->(car1.price()<500000 && car1.mileage()>=20);
	
	if(pre.test(car)) {
	IO.println(brand+" is eligible for sale");
	}
	else {
		IO.println(brand+" is not eligible for sale");
	}
	
	}
}
