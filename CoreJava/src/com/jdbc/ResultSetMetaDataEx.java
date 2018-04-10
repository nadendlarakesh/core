package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ResultSetMetaDataEx {

	public static void main(String[] args) throws SQLException {
		Connection con = new DbConnection().getConn();
		if (con != null) {
			PreparedStatement ps3 = con.prepareStatement("select * from student");
			ResultSet rs = ps3.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println(rsmd.getColumnCount());
			System.out.println(rsmd.getColumnName(1));
			System.out.println(rsmd.getColumnTypeName(1));
			ps3.close();
			con.close();
		}
	}

}
