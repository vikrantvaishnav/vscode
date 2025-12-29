package array;

public class MiddleElement {

	void main() {
		Integer n = Integer.parseInt(IO.readln("Enter n :"));
		Integer[] arr = new Integer[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(IO.readln("Enter ele "+ i+" "));
		}
		int mid = (arr.length/2)-1;
		if(arr.length%2==0) {
			IO.println(arr[mid] +" "+arr[mid+1]);
		}
		else {
			IO.println(arr[mid]);
		}
	}
}
