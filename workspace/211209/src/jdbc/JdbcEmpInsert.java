package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

public class JdbcEmpInsert {

	public static void main(String[] args) {
//		1. emp테이블에 insert하기
//		2. empno : 9000, ename : KIM, job : MANAGER, mgr : 7839,
//			hiredate : 2021-12-09, sal : 3500, comm : null, deptno : 30
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/kic",
					"kic12",
					"kic12");
			
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO emp(empno, ename, job, mgr, hiredate, sal, comm, deptno) "
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
//			sql.append("INSERT INTO emp(empno, ename, job, mgr, hiredate, sal, comm, deptno) "
//					+ "VALUES (?, ?, ?, ?, now(), ?, ?, ?)");
			
			pstmt = con.prepareStatement(sql.toString());
			int index = 1;
			pstmt.setInt(index++, 9000);
			pstmt.setString(index++, "KIM");
			pstmt.setString(index++, "MANAGER");
			pstmt.setInt(index++, 7839);
			pstmt.setDate(index++, Date.valueOf("2021-12-09"));
			pstmt.setFloat(index++, 3500);
			pstmt.setNull(index++, Types.FLOAT);
			pstmt.setInt(index++, 30);
			
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
