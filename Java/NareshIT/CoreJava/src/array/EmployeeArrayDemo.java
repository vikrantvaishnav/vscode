package array;
import java.util.Scanner;

public class EmployeeArrayDemo {
	
	void main() {
	Scanner sc = new Scanner(System.in);
	Integer num = Integer.parseInt(IO.readln("Enter Emp num: "));
	Employee11 arr[] = new Employee11[num];
	
	for(int i= 0;i<num; i++) {
		IO.print("Enter id: ");
		Integer id = sc.nextInt();
		String name = IO.readln("Enter name");
		IO.print("Enter Salary: ");
		Double salary = sc.nextDouble();
		
		arr[i] = new Employee11(id,name,salary);
	}
	
	
	for(Employee11 emp :arr) {
		IO.println(emp);
	}
	sc.close();
}
	
}


class Employee11{
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee11(Integer id,String name,Double salary) {
		this.id =id;
		this.name = name;
		this.salary = salary;
	}
	
	public String toString() {
		return "id= "+id +" name: "+name+", Salary: "+salary;
	}
}


