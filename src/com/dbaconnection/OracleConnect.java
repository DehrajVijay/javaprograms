package com.dbaconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class OracleConnect {

	public static void main(String[] args) {
	    try {
	        // Load Driver
	        Class.forName(DBPropertyLoader.getDriver());

	        // The connection will automatically close at the end of the }
	        try (Connection conn = DriverManager.getConnection(
	                DBPropertyLoader.getUrl(), 
	                DBPropertyLoader.getUser(),
	                DBPropertyLoader.getPassword())) {

	            if (conn != null) {
	                System.out.println("Connected to Oracle successfully via properties!");
	                
	                // You can now execute queries here...
	            }
	        } // 'conn' closes automatically here

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}