package steamAPI;

import java.util.Arrays;
import java.util.List;

public class RemoveNegativeNumber {
	void main() {
		Integer[] numbers = {-10, -5, 0, 5, 10, 15, -20};
		
//		Object[] numb = Arrays.stream(numbers)
//			.filter(num -> num>0).toArray();
		
//		IO.println(Arrays.toString(numb));
		
		
		List<Integer> num1 = Arrays.stream(numbers)
				.filter(num -> num>0).toList();
		
		
		IO.println(num1);
		
	}

	
}
