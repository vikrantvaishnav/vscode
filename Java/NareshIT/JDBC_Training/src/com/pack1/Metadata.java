package com.pack1;

import java.lang.reflect.Parameter;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

import oracle.net.aso.m;

public class Metadata {
	String driver = "oracle.jdbc.OracleDriver";
	String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
	String dbUname ="Vikrant";
	String dbPwd = "Db123";
	String query = "Select * from EMPLOYEE WHERE EID = ?";
	
	
	Connection connet() {
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
	void meth() {
		IO.println("Implementing meta data .");
		Connection con= connet();
		try {
			DatabaseMetaData dmtdt=con.getMetaData();
			IO.println("getDatabaseProductName : "+dmtdt.getDatabaseProductName());
			IO.println("getDatabaseProductVersion :"+dmtdt.getDatabaseProductVersion());
			IO.println("getDriverName :"+dmtdt.getDriverName());
			IO.println("supportsStoredProcedures :"+dmtdt.supportsStoredProcedures());
			
			IO.println("-----------------------------------------------------------------------");
			
			PreparedStatement prst = con.prepareStatement(query);
			prst.setString(1, "101");
			ResultSet rs = prst.executeQuery();
			ParameterMetaData pmtdt = prst.getParameterMetaData();
			IO.println("getParameterCount :"+pmtdt.getParameterCount());
			IO.println("getParameterType :"+pmtdt.getParameterType(1));
			IO.println("getParameterMode :"+pmtdt.getParameterMode(1));
			IO.println("isNullable :"+pmtdt.isNullable(1));
			
	        IO.println("=========================================");
	        ResultSetMetaData rsmtdt = rs.getMetaData();
	        IO.println("getColumnCount :"+rsmtdt.getColumnCount());
	        IO.println("getColumnName :"+rsmtdt.getColumnName(1));
	        IO.println("isAutoIncrement :"+rsmtdt.isAutoIncrement(1));
			
	        IO.println("--------------------------------------------------------------------------");
	        RowSetFactory rsf = RowSetProvider.newFactory();
	        CachedRowSet crs = rsf.createCachedRowSet();
	        crs.setUrl(dbUrl);
			crs.setUsername(dbUname);
			crs.setPassword(dbPwd);
			crs.setCommand("SELECT EID,EFNAME,ESAL FROM EMPLOYEE");
			crs.execute();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
void main() {
	new Metadata().meth();
}
	
	
	
}