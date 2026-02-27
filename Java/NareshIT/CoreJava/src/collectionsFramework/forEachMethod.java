package collectionsFramework;

import java.util.Vector;
import java.util.function.Consumer;

public class forEachMethod {
	
	public static void main(String[] args) {
	Vector<String> listofCity = new Vector<>();
	listofCity.add("Hyderabad");
	listofCity.add("Kolkata");
	listofCity.add("Pune");
	listofCity.add("Indore");
	listofCity.add("Mumbai");
	//Anonymous inner class for Consumer
	Consumer<String> consumer = new Consumer<String>()
	{
	@Override
	public void accept (String city)
	{
	System.out.println(city.toUpperCase());
	}
	};
	listofCity.forEach(consumer);
	}
}
