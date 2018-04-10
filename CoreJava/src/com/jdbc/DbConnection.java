package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	Connection con = null;

	public Connection getConn() {
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "rakesh");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

}
