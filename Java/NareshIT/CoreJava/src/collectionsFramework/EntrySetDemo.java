package collectionsFramework;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;

public class EntrySetDemo {
	void main(){
        TreeMap<String,Float> empMap = new TreeMap<>();

        for(int i=0;i<5;i++){
            String name = IO.readln();
            Float salary = Float.parseFloat(IO.readln());

            empMap.put(name,salary);
        }

        ArrayList<Map.Entry<String,Float>> list = new ArrayList<>(empMap.entrySet());

        ListIterator<Map.Entry<String,Float>> litr = list.listIterator();

        while(litr.hasNext()){
            Map.Entry<String,Float> entry = litr.next();

            entry.setValue(entry.getValue()+5000);
        }

        IO.println("Updated Employee Details (After Bonus):");

        for(Map.Entry<String,Float> entry : list){
            IO.println("Name: "+entry.getKey()+", Salary: "+entry.getValue());
        }
    }
}

