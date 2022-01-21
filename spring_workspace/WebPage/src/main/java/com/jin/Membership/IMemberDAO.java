package com.jin.Membership;

import java.util.List;

import com.jin.Login.Login;

public interface IMemberDAO {
	public int IsExistID(String id);
	public void memberProc(Login login);
	public void InsertMember(Member member);
	public List<Zipcode> searchZipcode(String addr);
	public void InsertPostcode(Postcode postcode);
}
