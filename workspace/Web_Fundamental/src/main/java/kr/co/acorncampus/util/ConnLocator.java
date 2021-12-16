package kr.co.acorncampus.util;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnLocator {
	public static Connection getConnection() throws SQLException {
		//DataSource를 이용하여 Connection 객체를 생성하면 2가지 이점이 있음
		//1. 드라이브로드와 DriverManager 역할을 대신한다.
		//2. Connection Pool를 사용한다.
		DataSource ds = null;
		Connection con = null;
		
		try {
			Context context = new InitialContext();
			// java:comp/env/ 고정
			// jdbc/kic -> context.xml의 name 속성값을 참조해야 함.
			ds = (DataSource) context.lookup("java:comp/env/jdbc/kic");
			con = ds.getConnection();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return con;
	}
}
