package com.dbaconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class OracleConnect {
	public static void main(String[] args) {
        // Database credentials
		
    	
    	
        try {	
            // 1. Load the Driver (Optional in newer JDBC versions, but good practice)
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // 2. Establish Connection
            Connection conn = DriverManager.getConnection(
            		DBPropertyLoader.getUrl(),
            		DBPropertyLoader.getUser(),
            		DBPropertyLoader.getPassword()
            		);

            if (conn != null) {
                System.out.println("Connected to the Oracle 18c XE database successfully!");
                conn.close();
            }

        } catch (ClassNotFoundException e) {
            System.err.println("Oracle JDBC Driver not found. Add the JAR to your classpath.");
        } catch (SQLException e) {
            System.err.println("Connection Failed! Check output console");
            e.printStackTrace();
        }
    }
}
