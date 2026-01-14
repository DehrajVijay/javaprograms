package com.oracle.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseTester {

    public static void main(String[] args) {
        // Connection parameters
        String url = "jdbc:oracle:thin:@localhost:1521/orclpdb";
        String user = "practice_user"; // Or your specific username
        String password = "practice123"; 

        // Try-with-resources (automatically closes resources)
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            
            if (conn != null) {
                System.out.println("✅ SUCCESS: Connected to Oracle 18c XE!");
                
                // Let's run a simple built-in Oracle query to test data retrieval
                // DUAL is a dummy table in Oracle used for testing
                String sql = "SELECT 'Connection is working!' FROM DUAL";
                
                try (Statement stmt = conn.createStatement();
                     ResultSet rs = stmt.executeQuery(sql)) {
                    
                    if (rs.next()) {
                        System.out.println("Database Response: " + rs.getString(1));
                    }
                }
            }
        } catch (Exception e) {
            System.err.println("❌ ERROR: Could not connect.");
            e.printStackTrace();
        }
    }
}