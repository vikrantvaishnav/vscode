package com.pack1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.util.Scanner;


public class JdbcPro8 
{
	String driver = "oracle.jdbc.OracleDriver";
	String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
	String dbUname ="Vikrant";
	String dbPwd = "Db123";
	
	Connection connect() {
		Connection con = null;
		try {
			Class.forName(driver);
			con =   DriverManager.getConnection(dbUrl,dbUname,dbPwd);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	void m1()
	{
		IO.println("Implementing Callable Statment");
		try
		{
			
			Connection con = connect();
			CallableStatement cstmt = con.prepareCall("{Call InsertData(?,?,?,?,?)}");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your Id");
			String id=sc.nextLine();
			System.out.println("Enter your name");
			String name = sc.nextLine();
			System.out.println("Enter your designation");
			String desg = sc.nextLine();
			System.out.println("Enter your basic salary");
			int bsal= Integer.parseInt(sc.nextLine());
			
			float tsal = bsal+(0.35f*bsal)+(0.15f*bsal);
			
			cstmt.setString(1, id);
			cstmt.setString(2, name);
			cstmt.setString(3, desg);
			cstmt.setInt(4, bsal);
			cstmt.setFloat(5, tsal);
			
			cstmt.execute();
			
			System.out.println("Data Inserted!!!!");
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	
	
	void meth2() {
		
		IO.println("Retriving the Data");
		Connection con = connect();
		
		try {
			CallableStatement cstmt = con.prepareCall("{call RetriveEmpData(?,?,?,?,?)}");
			String e_id = IO.readln("Enter Employee id:");
			cstmt.setString(1,e_id);
			
			cstmt.registerOutParameter(2, Types.VARCHAR);
			cstmt.registerOutParameter(3, Types.VARCHAR);
			cstmt.registerOutParameter(4, Types.INTEGER);
			cstmt.registerOutParameter(5, Types.INTEGER);
			
			cstmt.execute();
			
			IO.println("-------Employee Data-------");
			
			IO.println("Employee Id: "+e_id+"\nEmployee Name: "+cstmt.getString(2)+"\nEmployee Desg: "+cstmt.getString(3)+"\nEmployee Basic Sal: "+cstmt.getInt(4)+"\nEmployee Total Sal: "+cstmt.getInt(5));
			 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	void meth3() {
		
		Connection con = connect();
		
		try {
			CallableStatement cstmt = con.prepareCall("{call ?:=RetrieveTsal(?)}");
			String e_id = IO.readln("Enter Employee id:");
			cstmt.setString(2,e_id);
			cstmt.registerOutParameter(1, Types.INTEGER);
			cstmt.execute();
			IO.println("Total Salary is: "+cstmt.getInt(1));
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args)
	{
		JdbcPro8 obj = new JdbcPro8();
//		obj.m1();
//		obj.meth2();
		obj.meth3();
	}
}