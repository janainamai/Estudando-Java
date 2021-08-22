package br.com.janaina.devdojo.ZIjdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public static Connection getConnection() throws SQLException {
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String username = "postgres";
		String password = "admin";
			
		return DriverManager.getConnection(url, username, password);
	}
}
