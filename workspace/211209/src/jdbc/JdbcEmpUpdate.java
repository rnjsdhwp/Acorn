package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcEmpUpdate {

	public static void main(String[] args) {
//		1. emp테이블에 update하기 (업데이트 시 empno(9000)으로 수정)
//		2. empno : 9000, ename : KIM1, job : SALESMAN, mgr : 7698,
//			hiredate : 2021-12-08, sal : 3400, comm : 600, deptno : 20
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/kic",
					"kic12",
					"kic12");
			
			StringBuffer sql = new StringBuffer();
			sql.append("UPDATE emp 							");
			sql.append("SET ename=?, job=?, mgr=?, 			");
			sql.append("hiredate=?, sal=?, comm=?, deptno=? ");
			sql.append("where empno=?						");
			
			pstmt = con.prepareStatement(sql.toString());
			int index = 1;
			pstmt.setString(index++, "KIM1");
			pstmt.setString(index++, "SALESMAN");
			pstmt.setInt(index++, 7698);
			pstmt.setString(index++, "2021-12-08");
			pstmt.setInt(index++, 3400);
			pstmt.setInt(index++, 600);
			pstmt.setInt(index++, 20);
			pstmt.setInt(index++, 9000);
			
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
