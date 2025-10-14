package com.elc;
import java.util.Scanner;
import com.blc.Employe;
public class EmployeeDetails {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Employe emp = new Employe();
		
		System.out.println("Enter First Name: ");
		String firstName = sc.nextLine();
		
		System.out.println("Enter Last Name: ");
		String lastName = sc.nextLine();
		
		System.out.println("Enter Employee ID: ");
		int empId = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Salary: ");
		double salary = Double.parseDouble(sc.nextLine());
		
		System.out.println("Enter No of Project: ");
		int noOfProject = Integer.parseInt(sc.nextLine());
		
		emp.setEmployeeData(firstName, lastName, empId, salary, noOfProject);
		emp.calculatesalary();
		emp.displayEmployeeDetails();
		
		sc.close();

	}

}
