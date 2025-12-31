package com.dbaconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeInsertData {

	private static final String INSERT_SQL = "INSERT INTO EMP_TEST (EMP_ID, EMP_NAME, EMP_EMAIL) VALUES (?, ?, ?)";

	public static void main(String[] args) {
		// Connection conn =null;
		// PreparedStatement pstmt= null;

		try (
				// 1. Get connection
				Connection conn = DriverManager.getConnection(DBPropertyLoader.getUrl(), DBPropertyLoader.getUser(),
						DBPropertyLoader.getPassword());

				// 2. Prepare statement
				PreparedStatement pstmt = conn.prepareStatement(INSERT_SQL)) {

			// 3. set values

			pstmt.setInt(1, 102);
			pstmt.setString(2, "Rudra");
			pstmt.setString(3, "Rudra@Test.com");

			// 4. Execute Update
			pstmt.executeUpdate();
			System.out.println("Insert successful");

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
