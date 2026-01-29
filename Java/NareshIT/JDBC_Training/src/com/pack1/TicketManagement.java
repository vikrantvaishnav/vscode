// java
package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Savepoint;
import java.sql.SQLException;

public class TicketManagement {
    private static final String DRIVER = "oracle.jdbc.OracleDriver";
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:orcl";
    private static final String USER = "vikrant";
    private static final String PWD = "Db123";

    private static final String SQL_UPDATE_SEATS =
            "UPDATE TRAINSEATAVAILBILITY SET AVAILABLE_SEATS = AVAILABLE_SEATS - 1 " +
            "WHERE TRAIN_ID = ? AND JOURNEY_DATE = ? AND CLASS = ? AND AVAILABLE_SEATS > 0";
    private static final String SQL_INSERT_BOOKING =
            "INSERT INTO BOOKINGDETAILS VALUES(?,?,?,?,?)";
    private static final String SQL_CHECK_PAYMENT =
            "SELECT PAYMENT_STATUS FROM CUSTOMERPAYMENT WHERE CUSTOMER_ID = ?";
    private static final String SQL_CONFIRM_BOOKING =
            "UPDATE BOOKINGDETAILS SET STATUS = 'CONFIRMED' WHERE CUSTOMER_ID = ?";

    private Connection connect() throws SQLException {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            IO.println("JDBC Driver not found: " + e.getMessage());
        }
        return DriverManager.getConnection(URL, USER, PWD);
    }

    public void run() {
        IO.println("Implementing Transaction Management");

        try (Connection con = connect()) {
            IO.println("Database connected successfully");
            boolean originalAutoCommit = con.getAutoCommit();
            con.setAutoCommit(false);
            Savepoint sp = null;

            try {
                IO.println("AutoCommit before: " + originalAutoCommit + ", after disabling: " + con.getAutoCommit());

                // 1) Lock a seat
                try (PreparedStatement psm1 = con.prepareStatement(SQL_UPDATE_SEATS)) {
                    psm1.setString(1, "12345");
                    psm1.setString(2, "2024-10-10");
                    psm1.setString(3, "Sleeper");

                    int rowCount1 = psm1.executeUpdate();
                    if (rowCount1 == 0) {
                        throw new RuntimeException("Seats not available for booking!!");
                    }
                    IO.println("Seat is locked for booking");
                }

                // set savepoint after locking seat
                sp = con.setSavepoint();

                // 2) Insert booking record
                try (PreparedStatement psm2 = con.prepareStatement(SQL_INSERT_BOOKING)) {
                    psm2.setString(1, "B102");
                    psm2.setString(2, "12345");
                    psm2.setString(3, "C123");
                    psm2.setInt(4, 1);
                    psm2.setString(5, "Payment Pending");

                    int rowCount2 = psm2.executeUpdate();
                    if (rowCount2 == 0) {
                        throw new RuntimeException("Booking record not created!!");
                    }
                    IO.println("Booking record created & awaiting payment confirmation");
                }

                // 3) Check payment status
                String status = "Failed";
                try (PreparedStatement psm3 = con.prepareStatement(SQL_CHECK_PAYMENT)) {
                    psm3.setString(1, "C123");
                    try (ResultSet rs = psm3.executeQuery()) {
                        if (rs.next()) {
                            status = rs.getString(1);
                        } else {
                            throw new RuntimeException("No payment record found for customer");
                        }
                    }
                }

                if ("Failed".equalsIgnoreCase(status)) {
                    throw new RuntimeException("Transaction Failed");
                }

                // 4) Confirm booking
                try (PreparedStatement psm4 = con.prepareStatement(SQL_CONFIRM_BOOKING)) {
                    psm4.setString(1, "C123");
                    int rowCount3 = psm4.executeUpdate();
                    if (rowCount3 == 0) {
                        throw new RuntimeException("Transaction Failed at Payment portal");
                    }
                    IO.println("Ticket booked successfully");
                }

                con.commit();

            } catch (Exception ex) {
                IO.println("Error during transaction: " + ex.getMessage());
                try {
                    if (con != null) {
                        if (sp != null) {
                            con.rollback(sp);
                            IO.println("Rolled back to savepoint");
                        } else {
                            con.rollback();
                            IO.println("Rolled back entire transaction");
                        }
                    }
                } catch (SQLException rbEx) {
                    IO.println("Rollback failed: " + rbEx.getMessage());
                }
            } finally {
                try {
                    con.setAutoCommit(originalAutoCommit);
                    IO.println("AutoCommit restored to: " + originalAutoCommit);
                } catch (SQLException e) {
                    IO.println("Failed to restore autocommit: " + e.getMessage());
                }
            }
        } catch (SQLException e) {
            IO.println("Database connection failed: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new TicketManagement().run();
    }
}
