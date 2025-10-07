package Test;

public class Sum {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		int sum = a+b+c;
		System.out.println("Sum = "+sum);
		System.out.println("Avegage = "+(float)sum/3);
		
	}

}
