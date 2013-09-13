package com.ibatis.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUtil {
	public static Connection getConnection() throws ClassNotFoundException,
			SQLException {
		Connection con;
		String jdbcUrl = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user = "hr";
		String pass = "hr123";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection(jdbcUrl, user, pass);
		return con;
	}

	public static void close(Connection con, Statement pstmt) {
		if(pstmt != null )
			try{pstmt.close();}catch(Exception e){}
		if(con != null )
			try{con.close();}catch(Exception e){}
	}

} // end class
