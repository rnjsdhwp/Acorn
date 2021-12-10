package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DeptDAO {

	public DeptDAO() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean insert(DeptDTO dto) {
		boolean isSuccess = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection(
					"jdbc:mariadb://localhost/kic","kic12","kic12");
			
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO dept ");
			sql.append("VALUES (?,?,?)");
			
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, dto.getDeptno());
			pstmt.setString(2, dto.getDname());
			pstmt.setString(3, dto.getLoc());
			
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

	public boolean update(DeptDTO dto) {
		boolean isSuccess = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection(
					"jdbc:mariadb://localhost/kic","kic12","kic12");
			
			StringBuffer sql = new StringBuffer();
			sql.append("UPDATE dept SET dname=?, loc=? ");
			sql.append("WHERE deptno=?");
			
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, dto.getDname());
			pstmt.setString(2, dto.getLoc());
			pstmt.setInt(3, dto.getDeptno());
			
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
			con = DriverManager.getConnection(
					"jdbc:mariadb://localhost/kic","kic12","kic12");
			
			StringBuffer sql = new StringBuffer();
			sql.append("DELETE FROM dept WHERE deptno=?");
			
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
	
	public ArrayList<DeptDTO> select(int start, int len){
		ArrayList<DeptDTO> listDTO = new ArrayList<DeptDTO>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(
					"jdbc:mariadb://localhost/kic","kic12","kic12");
			
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT deptno, dname, loc ");
			sql.append("FROM dept ");
			sql.append("ORDER BY deptno DESC ");
			sql.append("LIMIT ?, ?");
			
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, start);
			pstmt.setInt(2, len);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int deptno = rs.getInt(1);
				String dname = rs.getString(2);
				String loc = rs.getString(3);
				
				listDTO.add(new DeptDTO(deptno, dname, loc));
			}
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(con, pstmt, rs);
		}
		
		return listDTO;
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
