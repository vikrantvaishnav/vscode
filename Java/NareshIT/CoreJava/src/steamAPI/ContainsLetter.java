package steamAPI;

import java.util.Arrays;
import java.util.stream.Stream;

public class ContainsLetter {
	
	void main() {
		String[] names = {"Rahul", "Raj", "Arnav", "Scott", "Smith"};
		
//		IO.println(Arrays.stream(names)
//			.filter(name -> name.toLowerCase().contains("a")).toList());
		
		Object arr[] = Stream.of(names).filter(n->n.contains("a")).toArray();
		
		IO.println(Arrays.toString(arr));
		
	}
}
