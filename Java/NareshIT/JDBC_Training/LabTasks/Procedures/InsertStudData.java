package Procedures;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;


public class InsertStudData {
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
	
	void meth1() {
		IO.println("Implementing Callable Statment");
		try(Connection con = connect();)
		{
			
			
			CallableStatement cstmt = con.prepareCall("{Call insertstuData(?,?,?,?,?,?,?,?,?)}");
			
			int stuId = Integer.parseInt(IO.readln("Enter your Id"));
			int stuRollNo =Integer.parseInt(IO.readln("Enter your rollNo:"));
			String stuName = IO.readln("Enter upir name: ");
			String stuBranch = IO.readln("Enter your Branch: ");
			int stuHno = Integer.parseInt(IO.readln("Enter your House Number:"));
			String city = IO.readln("Enter your City: ");
			int pincode = Integer.parseInt(IO.readln("Enter your Pincode:"));
			String Mail = IO.readln("enter your MailId: ");
			String phone = IO.readln("Enter your phone:");
			
			
			cstmt.setInt(1,stuId);
			cstmt.setInt(2,stuRollNo);
			cstmt.setString(3,stuName);
			cstmt.setString(4,stuBranch);
			cstmt.setInt(5,stuHno);
			cstmt.setString(6,city);
			cstmt.setInt(7,pincode);
			cstmt.setString(8,Mail);
			cstmt.setString(9,phone);
			
			
			cstmt.execute();
			
			System.out.println("Data Inserted!!!!");
			
			con.close();
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
			
		}
	}
	
	
	void main() {
		InsertStudData obj =new InsertStudData();
		obj.meth1();
	}
	
	
	
}
