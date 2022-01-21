package com.jin.Membership;

import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.support.SessionStatus;

import com.jin.Login.Login;
import com.jin.mail.SHA;

@Service
public class MemberServiceImpl implements IMemberService{
	private static final Logger logger = 
			LoggerFactory.getLogger(MemberServiceImpl.class);
//	private String randNum;
	@Autowired
	private IMemberDAO iMemberDao;
	
	@Autowired
	private HttpSession session;
	
	@Override
	public String IsExistID(Login login) {
		int cnt = iMemberDao.IsExistID(login.getId());
		logger.warn("cnt : "+cnt);
		return null;
	}
	@Override
	public /* String */void sendAuth(Member member) {
		String authNum = (String)session.getAttribute("authNum");
		Boolean authState = (Boolean) session.getAttribute("authState");
		
		if(authNum == null && !authState) {
			Random rand = new Random();
			String randNum = String.format("%04d", rand.nextInt(10000));
			
			session.setAttribute("authNum", randNum);
			session.setMaxInactiveInterval(180);
		}
		
//		return randNum;
	}
	@Override
	public String authConfirm(String authNum/* , String sAuthNum, SessionStatus session */) {
		String sAuthNum = (String)session.getAttribute("authNum");
		
		if(sAuthNum == null)	return "������ȣ ������ ��������";
		if(sAuthNum.equals(authNum)) {
			session.setAttribute("authState", true);
			return "���� �Ϸ�";
		}
		return "���� ����";
	}
	@Override
	public String memberProc(Member member, Postcode postcode) {
		Boolean authState = (Boolean) session.getAttribute("authState");
		if(!authState) {
			return "������ �����ؾ� �մϴ�.";
		}
		
		SHA sha = new SHA();
		
		Login login = member;
		login.setPw(sha.encryptSHA512(member.getPw()));
		iMemberDao.memberProc(login);
		
		if(!"n".equals(member.getGender())){
			iMemberDao.InsertMember(member);
		}
		if(!"".equals(postcode.getZipcode())){
			iMemberDao.InsertPostcode(postcode);
		}
		
		return "";
	}
	@Override
	public List<Zipcode> searchZipcode(String addr) {
		return iMemberDao.searchZipcode(addr);
	}

}
