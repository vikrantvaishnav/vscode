package collectionsFramework;

import java.util.ArrayList;
import java.util.Comparator;

public class ComparatorDemo {
	 void main(){
		    ArrayList<Emp> list = new ArrayList<>();

		    for(int i=0; i<5;i++){
		        int id = Integer.parseInt(IO.readln());
		        String name = IO.readln();
		        double salary = Double.parseDouble(IO.readln());

		        list.add(new Emp(id,name,salary));
		    }

		    list.sort(Comparator.comparing(Emp::empName));

		    IO.println("Employees in Alphabetical Order of Names:");

		    for(Emp e: list){
		        IO.println(e.empno()+"  "+e.empName()+"  "+e.salary());
		    }
		    }
}

   

record Emp(int empno, String empName, double salary){

}