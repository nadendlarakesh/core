package com.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBaseMetaData {

	public static void main(String[] args) throws SQLException {
		Connection con = new DbConnection().getConn();
		if (con != null) {
			DatabaseMetaData dbmd = con.getMetaData();
			System.out.println(dbmd.getDriverName());
			System.out.println(dbmd.getDriverVersion());
			System.out.println(dbmd.getDatabaseMajorVersion());
			System.out.println(dbmd.getDatabaseMinorVersion());
			System.out.println(dbmd.getUserName());
			System.out.println(dbmd.getDatabaseProductName());
			System.out.println(dbmd.getDatabaseProductVersion());
			String table[]={"VIEW"};  
			ResultSet rs=dbmd.getTables(null,null,null,table);  			  
			while(rs.next()){  
			System.out.println(rs.getString(3));  
			}
			con.close();
		}
	}

}
