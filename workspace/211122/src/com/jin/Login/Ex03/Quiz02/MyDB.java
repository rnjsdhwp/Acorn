package com.jin.Login.Ex03.Quiz02;

import java.util.HashMap;
import java.util.Map;

public class MyDB {
	private Map<String, String> db;
	
	public MyDB() {
		db = new HashMap<String, String>();
		
		db.put("jin", "jin1234");
		db.put("din", "din1234");
		db.put("admin", "admin1234");
	}
	public boolean isLogin(String id, String pw) {
//		로그인 성공 유무 확인
		if(!db.containsKey(id))
			return false;
		
		if(db.get(id).equals(pw))
			return true;
		return false;
	}
}
