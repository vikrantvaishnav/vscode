package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Restaurant {
	String driver = "oracle.jdbc.OracleDriver";
	String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
	String dbUname ="Vikrant";
	String dbPwd = "Db123";
	String query1 = "select * from food";
	String query2 = "select price from food where food_id = ?";
	String query3 = "insert into orders1 values(?,?,?,?)";
	String query4 = "select * from orders1";
	
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
	
	void display() {
		
		
		try(Connection con = connect();){
			PreparedStatement pstmt1 = con.prepareStatement(query1);
			
			ResultSet rs = pstmt1.executeQuery();
			while(rs.next()) {
				IO.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	void orderFood() {
		IO.println("Welcome to the Restaurant");
		display();
			int foodId = Integer.parseInt(IO.readln("Enter the Food ID you want to order:"));
			int quantity = Integer.parseInt(IO.readln("Enter the quantity:"));
			
			calculateBill(foodId,quantity);
			
		
		
		
	}
	
	void calculateBill(int foodId, int quantity) {
		
		
		try(Connection con = connect();){
			
			PreparedStatement pstmt1 = con.prepareStatement(query2);
			pstmt1.setInt(1, foodId);
			ResultSet rs = pstmt1.executeQuery();
			if(rs.next()) {
				int price = rs.getInt(1);
				int total = price * quantity;
				PreparedStatement pstmt2 = con.prepareStatement(query3);
				int orderId = (int)(Math.random()*10000);
				pstmt2.setInt(1, orderId);
				pstmt2.setInt(2, foodId);
				pstmt2.setInt(3, quantity);
				pstmt2.setInt(4, total);
				IO.println("Your Order ID is: "+orderId);
				IO.println("Total Bill Amount is: "+total);
				
				
				pstmt2.executeUpdate();
			}
			else {
				IO.println("Invalid Food ID");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	void displayBill() {
		
	}
	
	void main() {
		Restaurant rs = new Restaurant();
		rs.orderFood();
	}
}
