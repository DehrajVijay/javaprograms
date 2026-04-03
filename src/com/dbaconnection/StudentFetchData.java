package com.dbaconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentFetchData {

	private static final String FETCH_STUDENTS = "SELECT * FROM STUDENT";

	public static void fetchStudents() {

		try (Connection conn = DBConnection.getConnection();
				PreparedStatement ps = conn.prepareStatement(FETCH_STUDENTS);
				ResultSet rs = ps.executeQuery()) {

			while (rs.next()) {
				int id = rs.getInt("ID");
				String name = rs.getString("NAME");
				String email = rs.getString("EMAIL");

				System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		fetchStudents();
	}
}
