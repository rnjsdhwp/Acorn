package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcDeptSelect {

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
			sql.append("SELECT deptno, dname, loc from dept");
			
			pstmt = con.prepareStatement(sql.toString());
			
			rs = pstmt.executeQuery();
			System.out.printf("%-7s %-11s %s\n", "deptno", "dname", "loc");
			while(rs.next()) {
				int deptno = rs.getInt(1);	//rs.getInt("deptno");
				String dname = rs.getString(2);
				String loc = rs.getString(3);
				System.out.printf("%-7d %-11s %s\n", deptno, dname, loc);
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
