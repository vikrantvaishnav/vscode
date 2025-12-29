package array;

public class ReverseArray {
	
	void main() {
		Integer n = Integer.parseInt(IO.readln("Enter n :"));
		Integer[] arr = new Integer[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(IO.readln("Enter ele "+ i+" "));
		}
		
		for(int i=n-1;i>=0;i--) {
			IO.print(arr[i]+" ");
		}
	}
}
