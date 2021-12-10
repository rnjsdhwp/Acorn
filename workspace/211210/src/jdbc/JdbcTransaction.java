package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcTransaction {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		boolean isSuccess = false;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con = DriverManager.getConnection(
//					"jdbc:mysql://localhost/kic",
					"jdbc:mariadb://localhost/kic",
					"kic12",
					"kic12");
			
//			트랜잭션 시작
			con.setAutoCommit(false);
			
			StringBuffer sql1 = new StringBuffer();
			StringBuffer sql2 = new StringBuffer();
			sql1.append("INSERT INTO member VALUES(200, '이름200', '주소200')");
			sql2.append("INSERT INTO member VALUES(201, '이름201', '주소201')");
			
			pstmt1 = con.prepareStatement(sql1.toString());
			pstmt2 = con.prepareStatement(sql2.toString());
			
			pstmt1.executeUpdate();
			pstmt2.executeUpdate();
			
			isSuccess = true;
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
//				트랜잭션 끝
				if(isSuccess)	con.commit();
				else con.rollback();
				
//				Connection pool을 사용할 때 반드시 설정해야함.
				con.setAutoCommit(true);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
			try {
				if(pstmt2 != null)	pstmt2.close();
				if(pstmt1 != null)	pstmt1.close();
				if(con != null)	con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
