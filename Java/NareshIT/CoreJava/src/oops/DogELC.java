package oops;
import java.util.Scanner;

public class DogELC {

	public static  void main(String[] args) {
		
		
		DogBehavior dog1 = new DogBehavior();
		
		System.out.println(dog1.getDogInformation());
		
		System.out.println(dog1.bark());
		
		System.out.println();
		
//		DogBehavior dog2 = new DogBehavior();
//		
//		System.out.println(dog2.getDogInformation());
//		
//		System.out.println(dog2.bark());
//		
		
	}

}




 class DogBehavior {
	 
	 
	
	public  String  getDogInformation() {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Dog details");
		String name = sc.nextLine();
		Double height = sc.nextDouble();
		int age = sc.nextInt();
		return "Dog Name is "+name+"\nHeight: "+height+"\nAge: "+age;
	}
	
	public  String bark() {
		
		return "Dog is bark";
	}
	
	

}

