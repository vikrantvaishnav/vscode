package interfacce.assignment;

public class Employee {
	
	void main() {
		Payable employee = new Payable(){

			@Override
			public void pay(double amount) {
				IO.println("Employee Paid "+ amount);
				
			}
			
		};
		employee.pay(2500.0);
	}

}
