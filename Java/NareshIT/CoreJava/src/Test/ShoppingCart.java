package Test;
import java.util.Scanner;

public class ShoppingCart {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		double bill = sc.nextDouble();
		
		System.out.println("-----Bill Summary-----");
		System.out.println("Customer Name: "+name);
		System.out.println("Original Bill: "+bill);
		System.out.println("Amount Payable after Discount: "+Discount.calculateDiscount(bill));
	}

}
