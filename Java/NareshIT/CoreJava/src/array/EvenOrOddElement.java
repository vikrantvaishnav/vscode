package array;

public class EvenOrOddElement {
	void main() {
		Integer n = Integer.parseInt(IO.readln("Enter n :"));
		Integer[] arr = new Integer[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(IO.readln("Enter ele "+ i+" "));
		}
		
		IO.print("Even:");
		for(int i=0; i<n; i++) {
			if(arr[i]%2==0) {
				IO.print(arr[i]);
			}
		}
		
		IO.println();
		IO.print("Odd:");
		for(int i=0; i<n; i++) {
			if(arr[i]%2!=0) {
				IO.print(arr[i]);
			}
		}
	}
}
