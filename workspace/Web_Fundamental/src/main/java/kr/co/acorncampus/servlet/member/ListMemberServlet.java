package kr.co.acorncampus.servlet.member;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.acorncampus.dao.MemberDAO;
import kr.co.acorncampus.dto.MemberDTO;

/**
 * Servlet implementation class ListMemberServlet
 */
@WebServlet("/member/listMemberServlet")
public class ListMemberServlet extends HttpServlet {
	
	
	protected void service(HttpServletRequest request, 
			HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.print("<!DOCTYPE html>");
		out.print("<html lang=\"ko\">");
		out.print("<head>");
		out.print("<meta charset=\"UTF-8\">");
		out.print("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
		out.print("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
		out.print("<title>table</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>회원리스트</h1>");
		out.print("<table>");
		out.print("<colgroup>");
		out.print("<col width=\"300px\"/>");
		out.print("<col width=\"300px\"/>");
		out.print("<col width=\"300px\"/>");
		out.print("<col width=\"300px\"/>");
		out.print("</colgroup>");
		out.print("<thead>");
		out.print("<tr>");
		out.print("<th>이메일</th>");
		out.print("<th>이름</th>");
		out.print("<th>핸드폰</th>");
		out.print("<th>가입날짜</th>");
		out.print("</tr>");
		out.print("</thead>");
		out.print("<tbody>");
		
		MemberDAO dao = MemberDAO.getInstance();
		ArrayList<MemberDTO> list = dao.select(0, 5);
		for( MemberDTO dto : list) {
			String email = dto.getEmail();
			String name = dto.getName();
			String phone = dto.getPhone();
			String regdate = dto.getRegdate();
			out.print("<tr>");
			out.print("<td>"+email+"</td>");
			out.print("<td>"+name+"</td>");
			out.print("<td>"+phone+"</td>");
			out.print("<td>"+regdate+"</td>");
			out.print("</tr>");
		}
		out.print("</tbody>");
		out.print("</table>");
		out.print("<a href='/member/join.html'>회원가입</a>");
		out.print("</body>");
		out.print("</html>");
		
	}

}
