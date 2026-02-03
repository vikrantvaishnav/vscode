package retriveEmpData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class Employee {
	
	private String Driver ="oracle.jdbc.OracleDriver";
	private String dburl = "jdbc:oracle:thin:@localhost:1521:orcl";
	String dbUname ="Vikrant";
	String dbPwd = "Db123";
	String query ="Select * from employee";
	
	private int id;
	private String Fname;
	private String Lname;
	private double Esal;
	private String address;
	
	List<Employee> listofEmp = new LinkedList<>();
	
	Connection connect() {
		Connection con = null;
		try {
			Class.forName(Driver);
			con = DriverManager.getConnection(dburl,dbUname,dbPwd);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	void retriveData() {
		
		try(Connection con = connect();){
			
			PreparedStatement pstmt = con.prepareStatement(query);
			
			ResultSet rs = pstmt.executeQuery();
			
			
			while(rs.next()) {
				Employee emp = new Employee();
				emp.id = rs.getInt(1);
				emp.Fname = rs.getString(2);
				emp.Lname = rs.getString(3);
				emp.Esal = rs.getDouble(4);
				emp.address = rs.getString(5);
				listofEmp.add(emp);
				
				
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	void displayData() {
		for(Employee emp : listofEmp) {
			System.out.println("ID: "+emp.id);
			System.out.println("First Name: "+emp.Fname);
			System.out.println("Last Name: "+emp.Lname);
			System.out.println("Salary: "+emp.Esal);
			System.out.println("Address: "+emp.address);
			System.out.println("-----------------------");
		}
	}
	
	void main() {
		retriveData();
		displayData();
	}
	
	
}
