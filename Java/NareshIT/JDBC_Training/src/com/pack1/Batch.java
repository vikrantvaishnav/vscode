package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Scanner;

public class Batch {
	String driver = "oracle.jdbc.OracleDriver";
	String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
	String dbUname ="Vikrant";
	String dbPwd = "Db123";
	
	Scanner sc = new Scanner(System.in);
	
	Connection connect() {
		Connection con = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(dbUrl,dbUname,dbPwd);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}
	
	
	void meth1() {
		IO.println("Implementation Batch Processing");
		
		try(Connection con = connect();){
			Statement stmt = con.createStatement();
			int no_queries = Integer.parseInt(IO.readln("how many quries you want to add to the batch:"));
			
			
			for(int i=1;i<no_queries;i++) {
				IO.println("enter "+i+" query");
				stmt.addBatch(sc.nextLine());
				
			}
			IO.println(no_queries+" Queies addad to the batch");
			int row_count[] = stmt.executeBatch();
			IO.println("===>"+Arrays.toString(row_count));
			stmt.clearBatch();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	void main() {
		Batch obj = new Batch();
		obj.meth1();
	}
}
