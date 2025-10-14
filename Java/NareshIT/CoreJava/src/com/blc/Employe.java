package com.blc;

public class Employe {
	String firstName;
	String lastName;
	Integer empId;
	Double salary;
	Integer noOfProject;
	
	public void setEmployeeData(String firstName,String lastName,Integer empId,Double salary, Integer noOfProject) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.empId = empId;
		this.salary = salary;
		this.noOfProject = noOfProject;
		
	}
	
	public void calculatesalary() {
		
		if(this.noOfProject>=20) {
			this.salary+=15000;
			
		}
		else if(this.noOfProject>10) {
			this.salary+=10000;
		}
		else if(this.noOfProject>5) {
			this.salary+=5000;
		}
	}
	
	public void displayEmployeeDetails() {
		System.out.println("First Name: "+this.firstName);
		System.out.println("Last Name: "+this.lastName);
		System.out.println("Employee ID: "+this.empId);
		System.out.println("Salary: "+this.salary);
		System.out.println("No of Project: "+this.noOfProject);
	}
}
