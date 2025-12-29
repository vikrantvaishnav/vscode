package array;

public class SearchingElement {
	
	void main() {
		Integer n = Integer.parseInt(IO.readln("Enter n :"));
		Integer[] arr = new Integer[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(IO.readln("Enter ele "+ i+" "));
		}
		
		Integer ele = Integer.parseInt(IO.readln("Enter element"));
		
		
		for(int i=0; i<n; i++) {
			
			if(arr[i]== ele) {
				IO.println("Element found at index : "+i);
				System.exit(0);
			}
		}
		IO.println("Element not found");
	}
}
