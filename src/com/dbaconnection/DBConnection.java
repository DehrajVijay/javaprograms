package com.dbaconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	private DBConnection() {
		// prevent object creation (utility class)
	}

	public static Connection getConnection() throws Exception {
		// Load driver only once
		Class.forName(DBPropertyLoader.getDriver());

		return DriverManager.getConnection(DBPropertyLoader.getUrl(), DBPropertyLoader.getUser(),
				DBPropertyLoader.getPassword());

	}
}
