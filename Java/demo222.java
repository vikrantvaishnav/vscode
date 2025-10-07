import java.util.Scanner;


public class demo222 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter customer name: ");
        String name = sc.nextLine();
        System.out.println();
        System.out.print("Enter contact number: ");
        String number = sc.nextLine(); 
        System.out.println();
        System.out.print("Enter total purchase amount: ");
        double amount = sc.nextDouble(); 

        double discountRate = 0.10;
        double discount = amount * discountRate;
        double finalPrice = amount - discount;

        System.out.println("\n--- Shopping Receipt ---");
        System.out.println("Customer Name: " + name);
        System.out.println("Contact Number: " + number);
        System.out.println("Original Amount: " + amount);
        System.out.println("Discount Applied: 10%");
        System.out.println("You Saved: " + discount);
        System.out.println("Final Price: " +finalPrice);
    }
}