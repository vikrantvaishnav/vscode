package com.blc;

public class EmployeDetails {

	Integer employeeId ;
	String employeeName;
	Double employeeSalary;
	
	public void setEmployeeData(int id, String name, double salary){
		
		this.employeeId = id;
		this.employeeName = name;
		this.employeeSalary = salary;
		
	}
	
	public void getEmployeeData() {
		System.out.println("EmployeeId= "+employeeId+"\nEmployeeName = "+employeeName+"\nEmployeeSalary = "+employeeSalary);

	}

}
