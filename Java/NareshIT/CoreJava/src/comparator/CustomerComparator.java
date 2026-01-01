package comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class CustomerComparator {
	
	void main() {
	
//	Integer n = Integer.parseInt(IO.readln());

	Vector<Customer> arr = new Vector<>();
	arr.add(new Customer(333,"Scott",5000d));
	arr.add(new Customer(222,"Yash",1000d));
	arr.add(new Customer(111,"Aman",3000d));
	
//	for(int i=0;i<n;i++) {
//		Integer id = Integer.parseInt(IO.readln());
//		String name = IO.readln();
//		Double bill = Double.parseDouble(IO.readln());
//		
//		arr.add(new Customer(id,name,bill));
//	}
	
	
	
	Collections.sort(arr,(c1,c2)->Integer.compare(c1.id(),c2.id()));
	
	for(Customer customer :arr) {
		IO.println(customer);
	}
	IO.println();
	
	Collections.sort(arr,(c1,c2)->c1.name().compareTo(c2.name()));
	for(Customer customer :arr) {
		IO.println(customer);
	}
	
	IO.println();
	Collections.sort(arr,(c2,c1)->Double.compare(c1.bill(),c2.bill()));
	for(Customer customer :arr) {
		IO.println(customer);
	}
	
	}
}


record Customer(Integer id, String name, Double bill)
{
	
	
}