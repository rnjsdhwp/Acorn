package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcInsert {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/kic",
					"kic12",
					"kic12");
			
			StringBuffer sql = new StringBuffer();
//			ctrl + alt + 아래방향키
			sql.append("INSERT INTO dept(deptno, dname, loc) VALUES (?, ?, ?)");
			
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, 5);
			pstmt.setString(2, "ENGINEER");
			pstmt.setString(3, "LA");
			
			pstmt.executeUpdate();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null)	pstmt.close();
				if(con != null)	con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
