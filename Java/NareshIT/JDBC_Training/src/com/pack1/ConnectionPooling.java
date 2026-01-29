package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Vector;

public class ConnectionPooling {
	String driver, dbUrl, dbUname, dbPwd;
	Vector<Connection> pool = new Vector<Connection>();

	public ConnectionPooling(String driver, String dbUrl, String dbUname, String dbPwd) {
		super();
		this.driver = driver;
		this.dbUrl = dbUrl;
		this.dbUname = dbUname;
		this.dbPwd = dbPwd;

	}
public void con_Initialization() {
	IO.println("connection pool is empety");
	IO.println("there are "+pool.size()+" connection objects");
	while(pool.size()<5) {
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(dbUrl, dbUname, dbPwd);
			pool.addElement(con);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	for(Object obj:pool) {
		IO.println(obj);
		IO.println("there are "+pool.size()+" connection objects");
	}
}
public Connection con_Acquasition() {
	Connection con=pool.get(0);
	pool.remove(0);
	return con;
}
public void con_return(Connection con) {
	IO.println("adding the connection object to the connection pool");
	pool.addElement(con);
	IO.println("there are "+pool.size()+"connections object");
	for(Object o:pool) {
		IO.println(o);
	}
}
}