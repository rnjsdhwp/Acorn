package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcSalgradeSelect {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/kic",
					"kic12",
					"kic12");
			
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT GRADE, LOSAL, HISAL ");
			sql.append("FROM salgrade");
			
			pstmt = con.prepareStatement(sql.toString());
			
			rs = pstmt.executeQuery();
			System.out.printf("%-6s %-6s %-6s\n", "GRADE", "LOSAL", "HISAL");
			while(rs.next()) {
				int grade = rs.getInt(1);
				int losal= rs.getInt(2);
				int hisal = rs.getInt(3);
				System.out.printf("%-6d %-6d %-6d\n", grade, losal, hisal);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				try {
					if(rs != null)	rs.close();
					if(pstmt != null)	pstmt.close();
					if(con != null)	con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

}
