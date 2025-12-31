package com.dbaconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeeInsertTest {

	private static final String INSERT_SQL = "INSERT INTO EMP_TEST (EMP_ID, EMP_NAME, EMP_EMAIL) VALUES (?, ?, ?)";

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try

		{
			// 1. Get connection

			conn = DriverManager.getConnection(DBPropertyLoader.getUrl(), DBPropertyLoader.getUser(),
					DBPropertyLoader.getPassword());

			// 2. Prepare statement
			pstmt = conn.prepareStatement(INSERT_SQL);

			// 3. Set Values

			pstmt.setInt(1, 101);
			pstmt.setString(2, "Vijay Dehraj");
			pstmt.setString(3, "vijay@test.com");
			
			
			// 4. Execute Update
			
			int rowsInserted =pstmt.executeUpdate();
			if(rowsInserted>0) {
				
				System.out.println("Record inserted successfully!");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();

			}
		}
	}
}