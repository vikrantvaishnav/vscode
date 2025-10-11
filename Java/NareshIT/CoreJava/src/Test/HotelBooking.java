package Test;
import java.util.Scanner;

public class HotelBooking {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		
		String Hotelname = sc.nextLine();
		
		double roomRate = sc.nextDouble();
		
		int days = sc.nextInt();
		
		double totalAmount = Hotel.calculateTotalAmount(roomRate, days);
		
		
		System.out.println("----------Hotel Booking Summary--------");
		System.out.println("Customer Name : "+name+"\nHotel Name : "+Hotelname+"\nRoom Rate:$"+roomRate+"\nDays Stayed : "+days+"\nTotal Amount : $"+totalAmount+"\nAmount after Discount: $"+Hotel.calculateDoscountAmount(days, totalAmount));
		
		

	}

}
