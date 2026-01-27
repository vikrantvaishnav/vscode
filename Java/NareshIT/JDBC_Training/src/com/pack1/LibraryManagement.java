package com.pack1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class LibraryManagement {
	
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
	
	
	
	
	
	
	
	public void retriveBooks() {
		IO.println("Reteriving books from the Library\n");
		
		try {
			Connection con = connect();
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery("select * from library");
			
			while(rs.next()) {
				IO.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getDouble(5));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	public void addBook() {
		IO.println("Adding Book");
		
		try {
			int bookid = Integer.parseInt(IO.readln("Enter the Book ID:"));
			String BookName = IO.readln("Enter Book Name:");
			String Author = IO.readln("Enter Author Name");
			String Genere = IO.readln("Enter Genere:");
			Double price = Double.parseDouble(IO.readln("Enter Book Price"));
			
			Connection con = connect();
			Statement smt = con.createStatement();
			int row = smt.executeUpdate("Insert into library values("+bookid+",'"+BookName+"','"+Author+"','"+Genere+"',"+price+")");
			
			if(row ==0) {
				IO.println("\nData not insert\n");
			}
			else {
				IO.println("\n"+row+"Row is insert\n");
			}
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	public void deleteBook() {
		IO.println("Deleting the book");
		
		try {
			Connection con = connect();
			Statement stm = con.createStatement();
			int id = Integer.parseInt(IO.readln("Enter Book ID:"));
			int row = stm.executeUpdate("delete from library where bookid ="+id);
			
			if(row >0) {
				IO.println("Book deleted sucessfully");
			}
			else {
				IO.println("Book Id not avalable");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	public void searchBook() {
		IO.println("Searching Book Using Book Id");
		
		try {
			Connection con = connect();
			Statement stm = con.createStatement();
			int id = Integer.parseInt(IO.readln("Enter Book ID:"));
			ResultSet rs = stm.executeQuery("Select * from library where bookid ="+id);
			
			while(rs.next()) {
				IO.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getDouble(5));
			}
		}
		catch(Exception e) {
			
		}
	}
	
	
	
	
	void main() {
		
		while(true) {
			IO.println("1. View Library Books.\n2. Add NewBook\n3. Search Book using ID\n4. Delete Book Id\n5. Exit");
		
			int choice = Integer.parseInt(IO.readln("Enter your choice"));
			LibraryManagement obj = new LibraryManagement();
		
			switch(choice) {
			case 1->{
				obj.retriveBooks();
				IO.println();
			}
			case 2->{
				obj.addBook();
				IO.println();
			}
			case 3->{
				obj.searchBook();
				IO.println();
			}
			case 4->{
				obj.deleteBook();
				IO.println();
			}
			case 5->{
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
