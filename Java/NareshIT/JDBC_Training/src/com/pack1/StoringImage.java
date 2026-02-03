package com.pack1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StoringImage {
	String driver = "oracle.jdbc.OracleDriver";
	String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
	String dbUname ="Vikrant";
	String dbPwd = "Db123";
	String query1 = "Insert into mydata values(?,?)";
	String query2 = "select PIC_DATA from mydata where id = ?";
	String query3 = "Insert into mydata2 values(?,?)";
	String query4 = "select FILE_DATA from mydata2 where id = ?";
	
	Connection connect() {
		Connection con =null;
		
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
		
		try(Connection con= connect();){
		
		PreparedStatement pstmt1 = con.prepareStatement(query1);
		
		pstmt1.setString(1,"101");
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Vikrant\\Desktop\\DB JAR\\Day-36-2PM.png");
		pstmt1.setBlob(2, fis,fis.available());
		int rowCount = pstmt1.executeUpdate();
		
		if(rowCount == 0) {
			throw new RuntimeException("Image not Inserted");
		}
		IO.println("Image Inserted");
		
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	void meth2() {
		try(Connection con = connect();){
			PreparedStatement ptsmt2 = con.prepareStatement(query2);
			ptsmt2.setString(1,"101");
			ResultSet rs = ptsmt2.executeQuery();
			
			if(rs.next()) {
				Blob b = rs.getBlob(1);
				byte arr[] = b.getBytes(1,(int)b.length());
				try (FileOutputStream fout = new FileOutputStream("C:\\Users\\Vikrant\\Desktop\\DB JAR\\pic2.png")) {
					fout.write(arr);
				}
				
				IO.println("Image Retrived");
				
			}
			else {
				IO.println("Image not Found");
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
void meth3() {
		
		try(Connection con= connect();){
		
		PreparedStatement pstmt1 = con.prepareStatement(query3);
		
		pstmt1.setString(1,"101");
		
		FileReader fis = new FileReader("C:\\Users\\Vikrant\\Desktop\\DB JAR\\new.txt");
		pstmt1.setClob(2,fis);
		int rowCount = pstmt1.executeUpdate();
		
		if(rowCount == 0) {
			throw new RuntimeException("File not Inserted");
		}
		IO.println("File Inserted");
		
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	





void meth4() {
	try{
		
		Connection con = connect();
		PreparedStatement ptsmt2 = con.prepareStatement(query4);
		ptsmt2.setString(1,"101");
		ResultSet rs = ptsmt2.executeQuery();
		
		if(rs.next()) {
			Clob b = rs.getClob(1);
			Reader data = b.getCharacterStream();
			BufferedReader br = new BufferedReader(data);
			FileWriter fw = new FileWriter("C:\\Users\\Vikrant\\Desktop\\DB JAR\\newfile1.txt");
			String line;
			while((line= br.readLine())!=null) {
				fw.write(line);
			}
			IO.println("Image Retrived");
			
		}
		else {
			IO.println("Image not Found");
		}
		
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
	
	void main() {
		StoringImage si = new StoringImage();
		
//		si.meth1();
//		si.meth2();
//		si.meth3();
		si.meth4();
		
	}
}
