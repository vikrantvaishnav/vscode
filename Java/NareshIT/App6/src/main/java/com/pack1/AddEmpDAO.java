package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLIntegrityConstraintViolationException;

public class AddEmpDAO {
	public int insertempdata(EmpBean eb) {
		int rowCount=0;
		
		try {
			Connection con= DBConnect.getCon();
			PreparedStatement ptsmt = con.prepareStatement("insert into emp(?,?,?,?,?)");
			
			ptsmt.setString(1,eb.getEmp_id());
			ptsmt.setString(2,eb.getEmp_fname());
			ptsmt.setString(3,eb.getEmp_lname());
			ptsmt.setString(4,eb.getEmp_sal());
			ptsmt.setString(5,eb.getEmp_addr());
			
			
			rowCount = ptsmt.executeUpdate();
			
		}
		catch(SQLIntegrityConstraintViolationException e) {
			System.out.println("Duplicate EmpId are not allowed");
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return rowCount;
	}
}
