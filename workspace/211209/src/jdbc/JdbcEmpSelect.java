package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcEmpSelect {

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
			sql.append("SELECT empno, ename, job, mgr, ");
			sql.append("date_format(hiredate, '%Y. %m. %d.'), sal, comm, deptno ");
			sql.append("FROM emp ");
			sql.append("ORDER BY hiredate DESC ");
			sql.append("LIMIT ?, ?");
			
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, 0);
			pstmt.setInt(2, 5);
			
			rs = pstmt.executeQuery();
			System.out.printf("%-6s %-6s %-10s %-5s %-14s %-5s %-5s %s\n", 
					"empno", "ename", "jib", "mgr", 
					"hiredate", "sal", "comm", "deptno");
			
			while(rs.next()) {
				int index = 1;
				
				int empno = rs.getInt(index++);
				String ename = rs.getString(index++);
				String job = rs.getString(index++);
				int mgr = rs.getInt(index++);
				String hiredate = rs.getString(index++);
				int sal = rs.getInt(index++);
				int comm = rs.getInt(index++);
				int deptno = rs.getInt(index++);
				
				System.out.printf("%-6d %-6s %-10s %-5d %-14s %-5d %-5d %d\n",
						empno, ename, job, mgr, hiredate, sal, comm, deptno);
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
