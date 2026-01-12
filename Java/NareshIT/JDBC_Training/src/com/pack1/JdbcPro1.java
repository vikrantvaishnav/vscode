package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcPro1 {

    String driver = "oracle.jdbc.OracleDriver";
    String dburl = "jdbc:oracle:thin:@localhost:1521:orcl";
//    String dburl = "jdbc:oracle:thin:@//localhost:1521/orclpdb";
    String dbUname = "system";
    String dbpwd = "Oracle123";

    void connect() {
        System.out.println("Connecting to the Database");

        try {
            // Load Oracle Driver
            Class.forName(driver);

            // Create Connection
            Connection con = DriverManager.getConnection(dburl, dbUname, dbpwd);
            System.out.println("Connection Created Successfully");

            // Close Connection
            con.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JdbcPro1 obj = new JdbcPro1();
        obj.connect();
    }
}
