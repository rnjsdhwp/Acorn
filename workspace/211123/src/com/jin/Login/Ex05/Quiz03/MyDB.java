package com.jin.Login.Ex05.Quiz03;

import java.util.HashMap;
import java.util.Map;

public class MyDB {
	private Map<String, String> loginTable;
	
	public MyDB() {
		loginTable = new HashMap<String, String>();
		
		loginTable.put("jin", "jin1234");
		loginTable.put("din", "din1234");
		loginTable.put("admin", "admin1234");
	}
	
	public boolean isLogin(String id, String pw) {
//		로그인 성공 유무 확인
		String dbpw = loginTable.get(id);
		if(pw.equals(dbpw))
			return true;
		else
			return false;
	}
}
