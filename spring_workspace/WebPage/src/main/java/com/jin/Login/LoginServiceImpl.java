package com.jin.Login;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jin.mail.SHA;

@Service
public class LoginServiceImpl implements ILoginService{
	private static final Logger logger = 
			LoggerFactory.getLogger(LoginServiceImpl.class);
	@Autowired private ILoginDao iLoginDao;
	@Autowired private HttpSession session;
	private final int LOGINSUCCESS = 1;
	
	@Override
	public int loginProc(Login login) {
		SHA sha = new SHA();
		
		String encryptPW = sha.encryptSHA512(login.getPw());
		login.setPw(encryptPW);
		
		int loginResult = iLoginDao.loginProc(login);
//		logger.warn(cnt+"");
		setSession(loginResult, login.getId());
		
		return loginResult;
	}

	private void setSession(int loginResult, String id) {
		if(loginResult == LOGINSUCCESS) {
			session.setAttribute("id", id);
		}
	}

}
