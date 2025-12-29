package array;
import java.util.Scanner;


public class PrintArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer n = sc.nextInt();
		
		Integer arr[] = new Integer[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int arrr :arr) {
			System.out.println(arrr);
		}
	}

}
