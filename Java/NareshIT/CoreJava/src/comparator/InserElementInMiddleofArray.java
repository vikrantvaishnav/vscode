package comparator;

public class InserElementInMiddleofArray {

	void main() {
		int[] arr = {1,2,3,5,6};
		
		int n = arr.length;
		int ele =4;
		int[] arr1 = new int[n+1];
		
		for (int i = 0, j = 0; i < arr1.length; i++) {
		    if (i == ele-1) {
		        arr1[i] = ele;
		    } else {
		        arr1[i] = arr[j++];
		    }
	}
		
		for(int ele1:arr1) {
			IO.print(ele1+" ");
		}
}
}
