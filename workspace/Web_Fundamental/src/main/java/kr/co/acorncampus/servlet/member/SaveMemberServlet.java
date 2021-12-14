package kr.co.acorncampus.servlet.member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.acorncampus.dao.MemberDAO;
import kr.co.acorncampus.dto.MemberDTO;

/**
 * Servlet implementation class SaveMemberServlet
 */
@WebServlet("/member/saveMemberServlet")
//사용자로 부터 입력 받은 정보를 데이터 베이스로 insert 해줘야함.
public class SaveMemberServlet extends HttpServlet {
	

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, 
			HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		//파라미터 정보중에 2바이트 즉 한글로 넘어온 데이터를 깨지지 않게 하기위한 작업
		request.setCharacterEncoding("utf-8");
		
		//request.getParameter() : 파라미터 정보를 가져오기 위한 메서드
		String email = request.getParameter("email");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		
		//out.print("email : "+ email + "<br>");
		//out.print("pwd : "+ pwd + "<br>");
		//out.print("name : "+ name + "<br>");
		//out.print("phone : "+ phone + "<br>");
		
		MemberDAO dao = MemberDAO.getInstance();
		MemberDTO dto = new MemberDTO(email, pwd, name, phone, null);
		boolean isSuccess = dao.insert(dto);
		
		if(isSuccess) {
			response.sendRedirect("/member/listMemberServlet");
		}else {
			response.sendRedirect("/member/join.html");
		}
		
		
		
	}

}




