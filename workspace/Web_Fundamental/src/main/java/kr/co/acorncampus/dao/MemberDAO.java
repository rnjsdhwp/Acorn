package kr.co.acorncampus.dao;
// mariadb-java-client-2.7.4.jar 파일을 추가해야 한다.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import kr.co.acorncampus.dto.MemberDTO;
import kr.co.acorncampus.util.ConnLocator;

//Web_Fundamental>WebContent>WEB-INF>lib>mariadb-java-client-2.7.4.jar 추가
public class MemberDAO {
	//singleton coding
	//1.자기 자신 클래스의 변수를 static 으로 선언하고 접근한정자는 private으로 설정
	private static MemberDAO singleton;
	
	//2. 생성자의 접근한정자를 private으로 설정
	private MemberDAO() {
		/*
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}
	//3. 객체를 생성할 수 있는 getInstance() 메서드 static으로 선언한다.
	public static MemberDAO getInstance() {
		if(singleton == null) {
			singleton = new MemberDAO();
		}
		return singleton;
	}
	
	
	
	public boolean insert(MemberDTO dto) {
		boolean isSuccess = false;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			//con = DriverManager.getConnection(
			//		"jdbc:mariadb://localhost/kic","kic12","kic12");
			//Connection Pool에 미리 만들어진 Connection 자원중에 하나를 반환 받는다.
			con = ConnLocator.getConnection();
			
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO member(email, pwd, NAME, phone,regdate) ");
			sql.append("VALUES(?,PASSWORD(?),?,?,NOW())");
			
			pstmt = con.prepareStatement(sql.toString());
			
			int index = 1;
			pstmt.setString(index++, dto.getEmail());
			pstmt.setString(index++, dto.getPwd());
			pstmt.setString(index++, dto.getName());
			pstmt.setString(index, dto.getPhone());
			
			pstmt.executeUpdate();
			
			isSuccess = true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				if(pstmt != null) pstmt.close();
				//Connection를 종료하는 것이 아니라 반납하는 것이다.
				if(con != null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return isSuccess;
	}
	
	public ArrayList<MemberDTO> select(int start, int len){
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			//con = DriverManager.getConnection(
			//		"jdbc:mariadb://localhost/kic","kic12","kic12");
			con = ConnLocator.getConnection();
			
			StringBuffer sql = new StringBuffer("");
			sql.append("SELECT email,  NAME, phone, ");
			sql.append("DATE_FORMAT(regdate,'%Y. %m. %d. %H:%i') ");
			sql.append("FROM member ");
			sql.append("ORDER BY regdate DESC ");
			sql.append("LIMIT ?, ? ");
			
			pstmt = con.prepareStatement(sql.toString());
			
			pstmt.setInt(1, start);
			pstmt.setInt(2, len);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String email = rs.getString(1);
				String name = rs.getString(2);
				String phone = rs.getString(3);
				String regdate = rs.getString(4);
				list.add(new MemberDTO(email,null,name,phone,regdate));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		return list;
	}
}






