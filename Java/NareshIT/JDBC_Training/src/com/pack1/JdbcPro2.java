package com.pack1;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;

public class JdbcPro2 {
	
	String Driver ="oracle.jdbc.OracleDriver";
	String DBurl = "jdbc:oracle:thin:@localhost:1521:orcl";
	String Uname = "vikrant";
	String Upwd = "Db123";
	String query = "select * from employee";
	String query2 = "insert into employee values('106','karan','meena',65030,'Delhi')";
	
	String query3 = "delete from employee where eid='106'";
	
	Connection connect() {
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
	
	void getEmpdata() {
		
		IO.println("Employee Details");
		
		try {
			Connection con = connect();
			IO.println("Connection Establish");
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery(query); 
			
			while(rs.next()) {
				IO.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	void insertData() {
	try {
		
		Class.forName(Driver);
		Connection con = DriverManager.getConnection(DBurl,Uname,Upwd);
		
		Statement smt  = con.createStatement();
		int row = smt.executeUpdate(query2);
		if(row ==0) {
			IO.println("Data not insert");
		}
		else {
			IO.println(row+"Row is innsert");
		}
		
		
	}
	catch(SQLIntegrityConstraintViolationException e) {
		IO.println("Duplicate Empid are not allowed");
		System.exit(0);
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	}	
	
	
	void deleteData() {
		try {
			Connection con = connect();
			Statement smt  = con.createStatement();
			int result = smt.executeUpdate(query3);
			if(result ==0) {
				IO.println("eid not present");
				System.exit(0);
				
			}
			else {
				IO.println("Delete the row");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	void main() {
		JdbcPro2 obj = new JdbcPro2();
		obj.insertData();
		IO.println();
		obj.getEmpdata();
		IO.println();
		obj.deleteData();
		IO.println();
		obj.getEmpdata();
	}
	
}
