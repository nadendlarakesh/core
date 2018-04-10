package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestPreStatement {

	public static void main(String[] args) throws SQLException {
		Connection con = new DbConnection().getConn();
		if (con != null) {
			//PreparedStatement ps= con.prepareStatement("create table student(id number(1),name varchar2(10))");
			//ps.executeUpdate();
			PreparedStatement ps1= con.prepareStatement("insert into student values(?,?)");		
			ps1.setInt(1, 5);
			ps1.setString(2, "r5");
			ps1.executeUpdate();
			PreparedStatement ps3 = con.prepareStatement("select * from student");
			ResultSet rs = ps3.executeQuery();
			while(rs.next()){
				System.out.println(rs.getInt(1)+"-----"+rs.getString(2));
			}
			ps1.close();
			con.close();
		}
	}

}
