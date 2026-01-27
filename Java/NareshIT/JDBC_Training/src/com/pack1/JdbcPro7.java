package com.pack1;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class JdbcPro7 {
	String Driver = "oracle.jdbc.OracleDriver";
	String DBurl = "jdbc:oracle:thin:@localhost:1521:orcl";
	String dbUname ="vikrant";
	String dbPwd = "Db123";
	
	void meth1() {
		IO.println("Inplementing JdbcRowSet");
		
		try {
			RowSetFactory rsf = RowSetProvider.newFactory();
			JdbcRowSet jrs = rsf.createJdbcRowSet();
			jrs.setUrl(DBurl);
			jrs.setUsername(dbUname);
			jrs.setPassword(dbPwd);
			jrs.setCommand("select * from employee");
			jrs.execute();
			
			while(jrs.next()) {
				IO.println(jrs.getString(1)+" "+jrs.getString(2)+" "+jrs.getString(3)+" "+jrs.getInt(4));
			}
			IO.println("--------------");
			jrs.afterLast();
			while(jrs.previous()) {
				IO.println(jrs.getString(1)+" "+jrs.getString(2)+" "+jrs.getString(3)+" "+jrs.getInt(4));
			}
			IO.println("--------------");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	void meth2() {
		IO.println("Implemetiong CashRowSet");
		try {
			RowSetFactory rsf = RowSetProvider.newFactory();
			CachedRowSet crs = rsf.createCachedRowSet();
			crs.setUrl(DBurl);
			crs.setUsername(dbUname);
			crs.setPassword(dbPwd);
			crs.setCommand("select * from employee");
			crs.execute();
			
			
			while(crs.next()) {
				int e_id = crs.getInt(1);
				if(e_id == 102) {
					crs.updateInt(3,7500);
					crs.updateRow();
				}
			}
			crs.acceptChanges();
			
			crs.beforeFirst();
			while(crs.next()) {
				if(crs.getString(1).equals("102"))
					System.out.println(crs.getString(1)+" "+crs.getString(2)+" "+crs.getInt(3));
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	void main() {
		JdbcPro7 obj = new JdbcPro7();
		obj.meth1();
		obj.meth2();
		
	}
}
