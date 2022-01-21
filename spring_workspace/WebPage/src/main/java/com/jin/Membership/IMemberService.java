package com.jin.Membership;

import java.util.List;

import org.springframework.web.bind.support.SessionStatus;

import com.jin.Login.Login;

public interface IMemberService {
	public String IsExistID(Login login);
	public void sendAuth(Member member);

	public String authConfirm(String authNum/* , String sAuthNum, SessionStatus session */);
	public String memberProc(Member member, Postcode postcode);
	public List<Zipcode> searchZipcode(String addr);
}
