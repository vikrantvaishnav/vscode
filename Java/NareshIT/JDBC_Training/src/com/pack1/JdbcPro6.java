package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcPro6 
{
	String driver = "oracle.jdbc.OracleDriver";
	String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
	String dbUname ="vikrant";
	String dbPwd = "Db123";
	
	Connection connect()
	{
		Connection con = null;
		try
		{
			Class.forName(driver);
			con=DriverManager.getConnection(dbUrl, dbUname, dbPwd);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
	public void m1()
	{
		try
		{
			Connection con = connect();
			//Statement stm = con.createStatement(1003,1004);
			Statement stm = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet rs =stm.executeQuery("SELECT * FROM EMPLOYEE");
			
			while(rs.next())
			{
				IO.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
			}
			IO.println("----------------------------------------------------");
			while(rs.previous())
			{
				IO.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
			}
			IO.println("----------------------------------------------------");
			if(rs.last())
			{
				IO.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
			}
			IO.println("----------------------------------------------------");
			if(rs.first())
			{
				IO.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
			}
			IO.println("----------------------------------------------------");
			rs.afterLast();
			while(rs.previous())
			{
				IO.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
			}
			IO.println("----------------------------------------------------");
			rs.beforeFirst();
			while(rs.next())
			{
				IO.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
			}
			IO.println("----------------------------------------------------");
			if(rs.absolute(1))
			{
				IO.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
			}
			IO.println("----------------------------------------------------");
			if(rs.relative(0))
			{
				IO.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
			}
			IO.println("----------------------------------------------------");
			if(rs.absolute(-1))
			{
				IO.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
			}
			IO.println("----------------------------------------------------");
			if(rs.relative(-1))
			{
				IO.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));

			}


		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	
	
	public void method2() {
		IO.println("Implementing Scrollable ResultSet");
		Connection con=connect();
		try {
			Statement smt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = smt.executeQuery("select eid,efname,esal from employee");
			
			while(rs.next()) {
				String e_id = rs.getString(1);
				if(e_id.equals("102")) {
					rs.updateInt(3,17000);
					rs.updateRow();
				}
			}
			IO.println("Data Updated\n");
			rs.absolute(2);
			IO.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args)
	{
		JdbcPro6 obj = new JdbcPro6();
//		obj.m1();
		obj.method2();
	}
}