package Test;

public class Hotel {
	public static double calculateTotalAmount(double roomRate,int days){
	return roomRate*days;
	}
	
	public static double calculateDoscountAmount(int days,double totalAmount) {
		
		if(days >=10) {
			return totalAmount - totalAmount*0.20;
			
		}
		else if(days>=5) {
			return totalAmount - totalAmount*0.10;
		}
		else if(days>=3) {
			return totalAmount - totalAmount*0.05;
		}
		else {
			return totalAmount;
		}
	}
}
