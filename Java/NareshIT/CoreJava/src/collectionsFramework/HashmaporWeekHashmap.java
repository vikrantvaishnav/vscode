package collectionsFramework;

import java.util.HashMap;
import java.util.WeakHashMap;

record employee(int id){
	
}

public class HashmaporWeekHashmap {
	
	void main() {
		
		HashMap<employee,String> hm = new HashMap<>();
		
		WeakHashMap<employee, String> whm = new WeakHashMap<>();
		
		
		
		employee emp = new employee(101);
		
		hm.put(emp, "HashMap Entry");
        whm.put(emp, "WeakHashMap Entry");
        
        
        System.out.println("Before nullifying key:");
        System.out.println("HashMap: " + hm);
        System.out.println("WeakHashMap: " + whm);
        
        emp = null;
        
	}
	
}
