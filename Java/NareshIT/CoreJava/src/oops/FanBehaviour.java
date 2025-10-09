package oops;
import java.util.Scanner;

public class FanBehaviour {
	
	public static void main(String [] args) {
		
		fan f = new fan();
		
		
		
	}
	
	

}


class fan{
	public String fanInfo() {
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		String coil = sc.nextLine();
		int wings = sc.nextInt();
		
		return "Fan name is: "+name+"\ncoil: "+coil+"\nWing: "+wings;
	}
	public void switchOn() {
		System.out.println("Fan is on");
	}
	public void switchOff() {
		System.out.println("Fan is off");
	}
}