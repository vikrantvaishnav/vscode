package array;

import java.util.Arrays;
import java.util.Scanner;

class Employee implements Comparable<Employee>
{
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id, String name, double salary) 
	{
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee e2) 
	{
		return this.name.compareTo(e2.name);
	}
	
	
}


public class EmployeeComparator {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size :");
		int size = Integer.parseInt(sc.nextLine());
		
		Employee employees[] = new Employee[size];
		
		for(int i =0; i<size; i++)
		{
			System.out.print("Enter employee id :");
			int id = Integer.parseInt(sc.nextLine());
			
			System.out.print("Enter employee name :");
			String name = sc.nextLine();
			
			System.out.print("Enter employee salary :");
			double salary = Double.parseDouble(sc.nextLine());
			
			employees[i] = new Employee(id, name, salary);		
			
		}
		
		System.out.println("Original data");
		for(Employee employee : employees)
		{
			System.out.println(employee);
		}
		
		
		
		Arrays.sort(employees);  //compareTo()  ---> Comparable
		
		System.out.println("Sorted data");
		for(Employee employee : employees)
		{
			System.out.println(employee);
		}
		
		

	}

}




