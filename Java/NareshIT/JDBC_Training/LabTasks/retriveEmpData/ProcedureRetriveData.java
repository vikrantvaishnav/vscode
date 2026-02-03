package retriveEmpData;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class ProcedureRetriveData {
	
	
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
	
	
void meth2() {
		
		IO.println("Retriving the Data");
		Connection con = connect();
		
		try {
			CallableStatement cstmt = con.prepareCall("{call retriveEmp(?,?,?,?,?)}");
			String e_id = IO.readln("Enter Employee id:");
			cstmt.setString(1,e_id);
			
			cstmt.registerOutParameter(2, Types.VARCHAR);
			cstmt.registerOutParameter(3, Types.VARCHAR);
			cstmt.registerOutParameter(4, Types.INTEGER);
			cstmt.registerOutParameter(5, Types.VARCHAR);
			
			cstmt.execute();
			
			IO.println("-------Employee Data-------");
			
			IO.println("Employee Id: "+e_id+"\nEmployee Name: "+cstmt.getString(2)+"\nEmployee Desg: "+cstmt.getString(3)+"\nEmployee Basic Sal: "+cstmt.getInt(4)+"\nEmployee Total Sal: "+cstmt.getString(5));
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}


	void main() {
		ProcedureRetriveData obj = new ProcedureRetriveData();
		obj.meth2();
	}
}
