package collectionsFramework.vector;

import java.util.ArrayList;

record Customer(int custId,String customerName,String pickupLocation, String dropLocation, int distance, String phone) {}


class CustomeService{
	private ArrayList<Customer> customers;
	
	public CustomeService() {
		customers = new ArrayList<>();
	}
	
	public void addCustomer(Customer customer) {
		
		customers.add(customer);
	}
}

public class CabCustomerService {
	
}
