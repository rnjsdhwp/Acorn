package com.jin;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class SessionDeduplication implements HttpSessionAttributeListener{
	/*
	 * ConcurrentHashMap
	 * hashMap에 동기화 기능을 넣은 것
	 * hashmap의 경우 null값을 허용하나 ConcurrentHashMap은 null값을 허용하지 않음.
	 */
	private static final Map<String, HttpSession> sessionMap = new ConcurrentHashMap<>();
	public synchronized static void getSessions() {
		for(String key : sessionMap.keySet()) {
			System.out.println("key : " + key);
			HttpSession value = sessionMap.get(key);
			System.out.println("sessions.get(key) : " + value);
			if(value!=null)
				System.out.println("value.getAttribute(\"userId\") : " + value.getAttribute("userId"));
		}
	}
	
	public synchronized static boolean setSessions(String usrId, HttpSession session) {
		System.out.println("size "+ sessionMap.size());
		for(String key : sessionMap.keySet()) {
			HttpSession value = sessionMap.get(key);
			if(value!=null) {
				if(usrId.contentEquals(value.getAttribute("userId").toString())) {
					if(value.getId().contentEquals(session.getId()))
						return false;
					sessionMap.remove(key);
					value.removeAttribute("userId");
					return true;
				}
			}
		}
		return false;
	}
	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
		sessionMap.put(event.getSession().getId(), event.getSession());
		System.out.println("attributeAdded");
	}
	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
		System.out.println("attributeRemoved");
	}
	@Override
	public void attributeReplaced(HttpSessionBindingEvent event) {
		//sessionMap.put(event.getSession().getId(), event.getSession());
		System.out.println("attributeReplaced");
	}
}
