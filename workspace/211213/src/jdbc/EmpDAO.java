package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmpDAO {
	public EmpDAO() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean insert(EmpDTO dto) {
		boolean isSuccess = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kic",
					"kic12","kic12");
			
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO emp(empno, ename, job, mgr, hiredate, sal, comm, deptno) ");
			sql.append("VALUES(?,?,?,?,NOW(),?,?,?)");
			
			pstmt = con.prepareStatement(sql.toString());
			int index=1;
			pstmt.setInt(index++, dto.getNo());
			pstmt.setString(index++, dto.getName());
			pstmt.setString(index++, dto.getJob());
			pstmt.setInt(index++, dto.getMgr());
			pstmt.setDouble(index++, dto.getSal());
			pstmt.setDouble(index++, dto.getComm());
			pstmt.setInt(index++, dto.getDeptno());
			
			pstmt.executeUpdate();
			
			isSuccess = true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(con, pstmt, null);
		}
		
		return isSuccess;
	}

	public boolean update(EmpDTO dto) {
		boolean isSuccess = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kic",
					"kic12","kic12");
			
			StringBuffer sql = new StringBuffer();
			sql.append("UPDATE emp ");
			sql.append("SET ename=?, job=?, mgr=?, hiredate=?, sal=?, comm=NULL, deptno=? ");
			sql.append("WHERE empno=?");
			
			pstmt = con.prepareStatement(sql.toString());
			int index=1;
			pstmt.setString(index++, dto.getName());
			pstmt.setString(index++, dto.getJob());
			pstmt.setInt(index++, dto.getMgr());
			pstmt.setString(index++, dto.getHireDate());
			pstmt.setDouble(index++, dto.getSal());
			pstmt.setInt(index++, dto.getDeptno());
			pstmt.setInt(index++, dto.getNo());
			
			pstmt.executeUpdate();
			
			isSuccess = true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(con, pstmt, null);
		}
		return isSuccess;
	}
	
	public boolean delete(int num) {
		boolean isSuccess = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kic",
					"kic12","kic12");
			
			StringBuffer sql = new StringBuffer();
			sql.append("DELETE FROM emp ");
			sql.append("WHERE empno=?");
			
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, num);
			
			pstmt.executeUpdate();
			
			isSuccess = true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(con, pstmt, null);
		}
		
		return isSuccess;
	}
	
	public ArrayList<EmpDTO> select(int start, int len){
		ArrayList<EmpDTO> list = new ArrayList<EmpDTO>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kic",
					"kic12","kic12");
			
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT empno, ename, job, mgr, ");
			sql.append("DATE_FORMAT(hiredate, '%y. %m. %d.'), sal, comm, deptno ");
			sql.append("FROM emp ");
			sql.append("ORDER BY hiredate DESC ");
			sql.append("LIMIT ?,?");
			
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, start);
			pstmt.setInt(2, len);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int index = 1;
				int no = rs.getInt(index++);
				String name = rs.getString(index++);
				String job = rs.getString(index++);
				int mgr = rs.getInt(index++);
				String hireDate = rs.getString(index++);
				double sal = rs.getDouble(index++);
				double comm = rs.getDouble(index++);
				int deptno = rs.getInt(index++);
				
				list.add(new EmpDTO(no,name,job,mgr,hireDate,sal,comm,deptno));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(con, pstmt, null);
		}
		
		return list;
	}
	
	private void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
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
