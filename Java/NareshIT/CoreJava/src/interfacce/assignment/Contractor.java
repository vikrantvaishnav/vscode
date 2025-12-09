package interfacce.assignment;

public class Contractor {
	
	void main() {
		Payable contractor = new Payable(){

			@Override
			public void pay(double amount) {
				IO.println("Contractor Paid: "+amount);
				
			}
			
		};
		contractor.pay(18000.0);
	}
}
