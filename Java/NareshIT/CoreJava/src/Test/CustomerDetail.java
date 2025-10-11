package Test;
import java.util.Scanner;

public class CustomerDetail {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int id = Integer.parseInt(sc.nextLine());
		String name = sc.nextLine();
		double bill = sc.nextDouble();
		
		
		System.out.println(Customer.getCustomerDetails(id, name, bill));
		
	}

}
