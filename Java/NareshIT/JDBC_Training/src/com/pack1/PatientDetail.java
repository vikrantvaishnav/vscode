package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PatientDetail {
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
	
	
	
	public void Addpatient() {
		
		try {
			Connection con = connect();
			PreparedStatement pstm = con.prepareStatement("Insert into patient values(?,?,?,?)");
			
			while(true) {
				String str = IO.readln("Want to Add More Patient(y/n):");
				switch(str){
				case "y"->{
					int pid = Integer.parseInt(IO.readln("Enter Paitent ID:"));
					String pname = IO.readln("Enter Patient Name");
					int age = Integer.parseInt(IO.readln("Enter Paitent Age:"));
					int contact = Integer.parseInt(IO.readln("Enter Paitent Contact:"));
					
					
					pstm.setInt(1,pid);
					pstm.setString(2,pname);
					pstm.setInt(3,age);
					pstm.setLong(4,contact);
					
					int row = pstm.executeUpdate();
					
					if(row>0) {
						IO.println("Data Inserted\n");
					}
					else {
						IO.println("no row updated\n");
					}
				}
				
				case "n"->{
					IO.println("Exit from Add Patient");
					return;
				}
				}
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void viewDetails() {
		
		try {
			Connection con = connect();
			PreparedStatement pstm = con.prepareStatement("select * from patient");
			
			
			ResultSet rs = pstm.executeQuery();
			
			while(rs.next()) {
				IO.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getLong(4));
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	public void RetriveData() {
		try {
			IO.println("View Detail By using Patient ID:");
			int id = Integer.parseInt(IO.readln("Enter paitent Id"));
			Connection con = connect();
			PreparedStatement pstm = con.prepareStatement("select * from patient where pid=?");
			
			pstm.setInt(1,id);
			ResultSet rs = pstm.executeQuery();
			if(rs.next()) {
				IO.println("\n"+rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
			}
			else {
				IO.println("Patient Id not Present");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void deleteData() {
		try {
			IO.println("Delete Patient Record By using Patient ID:");
			int id = Integer.parseInt(IO.readln("Enter paitent Id"));
			Connection con = connect();
			PreparedStatement pstm = con.prepareStatement("delete from patient where pid=?");
			
			pstm.setInt(1,id);
			int row = pstm.executeUpdate();
			if(row>0) {
				IO.println("Patient Record Deleted Successfully");
			}
			else {
				IO.println("Patient Id not Present");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updateData() {
		try {
			IO.println("Update Patient Record By using Patient ID:");
			int id = Integer.parseInt(IO.readln("Enter paitent Id"));
			Connection con = connect();
			PreparedStatement pstm = con.prepareStatement("update patient set pname=?,age=?,contact=? where pid=?");
			
			String pname = IO.readln("Enter Patient Name");
			int age = Integer.parseInt(IO.readln("Enter Paitent Age:"));
			int contact = Integer.parseInt(IO.readln("Enter Paitent Contact:"));
			
			pstm.setString(1,pname);
			pstm.setInt(2,age);
			pstm.setLong(3,contact);
			pstm.setInt(4,id);
			
			int row = pstm.executeUpdate();
			if(row>0) {
				IO.println("Patient Record Updated Successfully");
			}
			else {
				IO.println("Patient Id not Present");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
	}
	}
	
	
void main() {
		
		while(true) {
			IO.println("1. Add Patient Details.\n2. View All Patients\n3. Retrive Patient Data using ID\n4. Update Patient Data\n5. Delete Patient Record \n6. Exit");
		
			int choice = Integer.parseInt(IO.readln("Enter your choice"));
			PatientDetail obj = new PatientDetail();
		
			switch(choice) {
			case 1->{
				obj.Addpatient();
				IO.println();
			}
			case 2->{
				obj.viewDetails();
				IO.println();
			}
			case 3->{
				obj.RetriveData();
				IO.println();
			}
			case 4->{
				obj.updateData();
				IO.println();
			}
			case 5->{
				obj.deleteData();
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
