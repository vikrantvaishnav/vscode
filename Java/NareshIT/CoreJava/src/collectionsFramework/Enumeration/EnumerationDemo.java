package collectionsFramework.Enumeration;

import java.util.ListIterator;
import java.util.Vector;

public class EnumerationDemo {
	
	void main() {
		Vector<String> listOfCity = new Vector<>();

		listOfCity.add("Hyderabad");
		listOfCity.add("Kolkata");
		listOfCity.add("Pune");
		listOfCity.add("Indore");
		listOfCity.add("Mumbai");

		
		// Using Enumeration 
		
//		Enumeration<String> em = listOfCity.elements();
//		
//		while(em.hasMoreElements()) {
//			IO.println(em.nextElement());
//		}
		
		
		//Using Iterator
//		Iterator<String> itr = listOfCity.iterator();
//		
//		while(itr.hasNext()) {
//			IO.println(itr.next());
//		}
		
		
		
		
		//UsingListIterator
		
		ListIterator<String> litr = listOfCity.listIterator();
		
		
		litr.add("Rajasthan");
		
		
		
		
		litr.next();
		litr.set("Delhi");
		litr.previous();
		while(litr.hasNext()) {
			IO.println(litr.next());
		}
		
	}
	
	
}
