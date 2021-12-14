package kr.co.acorncampus.servlet.member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SaveMemberServlet
 */
@WebServlet("/member/saveMemberServlet")
//사용자로부터 입력받은 정보를 데이터 베이스로 insert 해줘야함
public class SaveMemberServlet extends HttpServlet{

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
//		파라미터 정보중에 2바이트, 즉 한글로 넘어온 데이터를 깨지지 않게 하기위한 작업
		request.setCharacterEncoding("utf-8");
		
//		request.getParameter() : 파라미터 정보를 가져오기 위한 메서드
		String email = request.getParameter("email");
		String pwd = request.getParameter("pwd");
		String name= request.getParameter("name");
		String phone = request.getParameter("phone");
		
		out.println("email : " + email + "<br>");
		out.println("pwd : " + pwd + "<br>");
		out.println("name : " + name + "<br>");
		out.println("phone : " + phone + "<br>");
	}

}
