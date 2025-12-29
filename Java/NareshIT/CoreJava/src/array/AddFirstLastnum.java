package array;

public class AddFirstLastnum {
	void main() {
		Integer n = Integer.parseInt(IO.readln("Enter n :"));
		Integer[] arr = new Integer[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(IO.readln("Enter ele "+ i+" "));
		}
		
		IO.println("Addition:"+(arr[0]+arr[n-1]));
	}
}
