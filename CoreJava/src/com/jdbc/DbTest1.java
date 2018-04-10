package com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbTest1 {

	public static void main(String[] args) throws SQLException {
		Connection con = new DbConnection().getConn();
		if (con != null) {
			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			int i = stmt.executeUpdate("create table student(id number(1),name varchar2(10))");
			stmt.executeUpdate("insert into student values(1,'r1')");
			stmt.executeUpdate("insert into student values(2,'r2')");
			stmt.executeUpdate("insert into student values(3,'r3')");
			stmt.executeUpdate("insert into student values(4,'r4')");
			boolean ret = stmt.execute("update student set name='r6' where id=1");
			System.out.println(ret);//false for update,create,insert,delete
			boolean ret1 = stmt.execute("select * from student");
			System.out.println(ret1);// true for select only
			ResultSet rs = stmt.executeQuery("select * from student");
			rs.absolute(1);
			System.out.println(rs.getInt(1) + "-----" + rs.getString(2));			
			
			/*while (rs.next()) {
				System.out.println(rs.getInt(1) + "-----" + rs.getString(2));
			}*/
			//int k = stmt.executeUpdate("drop table student");
			rs.close();
			stmt.close();			
			con.close();
		}
	}

}
