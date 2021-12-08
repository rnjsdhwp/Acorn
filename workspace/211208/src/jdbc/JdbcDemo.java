package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcDemo {

	public static void main(String[] args){
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
//			1. jdbc driver loading
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이버 로드 성공");
			
//			2. Connection 객체를 생성한다.
//			ctrl + shift + o => 자동 import
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/kic?autoReconnect=true",	//url
					"kic12",	//user
					"kic12");	//password
			System.out.println("MariaDB 데이터베이스 연결 성공");
			
//			3. PreparedStatement 객체를 생성 - SQL문 전송할 수 있는 객체
			StringBuffer sql = new StringBuffer();
//			? -> 바인딩 변수
			sql.append(
					"INSERT INTO member(num, NAME, addr) VALUES (?, ?, ?)");
			pstmt = con.prepareStatement(sql.toString());
			
//			4. 바인딩 변수 설정
			pstmt.setInt(1, 25);
			pstmt.setString(2, "이름25");
			pstmt.setString(3, "주소25");
			
//			5. SQL문을 MariaDB 서버로 전송
			int resultCount = pstmt.executeUpdate();	//갱신된 행의 수 반환
			System.out.println("갱신된 행의 수 : " + resultCount);
			
			
		}catch(ClassNotFoundException | SQLException e){
//			오류원인
//			1. 클래스패스에 jdbc driver가 추가되지 않은 경우
//			2. org.mariadb.jdbc.Driver가 잘못된 경우
			e.printStackTrace();
			System.out.println("드라이버 로드 실패");
		}finally {
//			6. 모든 자원 역순으로 반납 (클라이언트와 MariaDB 서버의 연결고리를 끊는다.)
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
