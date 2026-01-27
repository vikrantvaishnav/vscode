package com.pack1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;


/*
	 Task 1: Retrieve the employee details
	 Task2: Ask the user to enter employee data and insert that data into employee table
	 Task3: ask the user to enter eid and retrieve that employee record from the data base if the  record is not available in record then display the message to the console include empId
	 Task 4: Ask the user the eid and delete that employee recode
	 Task 5: Ask the user to enter Eid and esal and update that record in the table accordingly if the recode is not available display that msg in the console including EMpid
 */
public class JdbcPro3 {
	
	String Driver = "oracle.jdbc.OracleDriver";
	String DBurl = "jdbc:oracle:thin:@localhost:1521:orcl";
	String Uname = "vikrant";
	String Upwd = "Db123";
	
	public Connection connect() {
		Connection con = null;
		
		try {
			Class.forName(Driver);
			con = DriverManager.getConnection(DBurl,Uname,Upwd);
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		return con;
	}
	
	//employee details
	public void getEmpDetail() {
		IO.println("\nEmployee Details\n");
		
		try {
			Connection con = connect();
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery("select * from employee");
			
			while(rs.next()) {
				IO.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4)+" "+rs.getString(5));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	// Update Table
	
	public void addEmp() {
		
		IO.println("Enter Employee details");
		
		try {
			String Id = IO.readln("E nter Employee ID");
			String Fname = IO.readln("Enter Employee First Name:");
			String Lname = IO.readln("Enter Employee Last Name:");
			Integer sal = Integer.parseInt(IO.readln("Enter employee salary:"));
			String address = IO.readln("Enter Employee Address:");
			
			Connection con = connect();
//			Statement smt = con.createStatement();
//			int noRow = smt.executeUpdate("insert into employee values("+Id+",'"+Fname+"','"+Lname+"',"+sal+",'"+address+"')");
			
			//using PreparedStatement
//			String sql = "INSERT INTO employee VALUES (?, ?, ?, ?)";

			PreparedStatement ps = con.prepareStatement("INSERT INTO employee VALUES (?, ?, ?, ?,?)");

			ps.setString(1, Id);
			ps.setString(2, Fname);
			ps.setString(3, Lname);
			ps.setInt(4, sal);
			ps.setString(5, address);

			int noRow = ps.executeUpdate();
			
			if(noRow ==0) {
				IO.println("\nData not insert\n");
			}
			else {
				IO.println("\n"+noRow+"Row is insert\n");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	//Retrive Employee detail
	
	public void getdetail() {
		
		IO.print("Employee Detail Using ID:");
		try {
			int empid = Integer.parseInt(IO.readln());
			Connection con = connect();
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("select * from employee where eid ="+empid);
			boolean found = false;
			while(rs.next()) {
				  found = true;
				IO.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4)+" "+rs.getString(5));
			}
			if (!found) {
			    IO.println("\nEmployee ID "+empid+" not available");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	//Delete Employee Detail
	
	public void deltEmp() {
		
		try {
			int empid = Integer.parseInt(IO.readln());
			
			Connection con = connect();
			Statement stm = con.createStatement();
			int row = stm.executeUpdate("delete from employee where eid="+empid);
			
			if(row >0) {
				IO.println("Employee deleted sucessfully");
			}
			else {
				IO.println("Employee Id not avalable");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//Update Employee Salary
	public void updSalary() {
		
		try {
			int id = Integer.parseInt(IO.readln("enter employee Id:"));
			int sal = Integer.parseInt(IO.readln("enter the salary:"));
			Connection con = connect();
			Statement stm = con.createStatement();
			int row = stm.executeUpdate("update employee set esal="+sal+"where eid ="+id);
			if(row >0) {
				IO.println("Salary Update sucessfully");
			}
			else {
				IO.println("Employee Id not avalable");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	void main() {
		
		while(true) {
			IO.println("1. View Employee table.\n2. Add Employee\n3. Search Employee using ID\n4. Delete employee Id\n5. Update Salary\n6. Exit");
		
			int choice = Integer.parseInt(IO.readln("Enter your choice"));
			JdbcPro3 obj = new JdbcPro3();
		
			switch(choice) {
			case 1->{
				obj.getEmpDetail();
				IO.println();
			}
			case 2->{
				obj.addEmp();
				IO.println();
			}
			case 3->{
				obj.getdetail();
				IO.println();
			}
			case 4->{
				obj.deltEmp();
				IO.println();
			}
			case 5->{
				obj.updSalary();
				IO.println();
			}
			case 6->{
				IO.println("Exit Application");
				System.exit(0);
			}
			default ->{
				
				IO.println("Exit Application");
				System.exit(0);
			}
			}	
		}
	}
	
	
}
