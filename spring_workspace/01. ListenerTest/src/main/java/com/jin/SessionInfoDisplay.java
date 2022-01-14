package com.jin;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class SessionInfoDisplay implements HttpSessionAttributeListener{
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
	
	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
		sessionMap.put(event.getSession().getId(), event.getSession());
		System.out.println("attributeAdded");
	}
	@Override
	public void attributeReplaced(HttpSessionBindingEvent event) {
		System.out.println("attributeReplaced");
	}
	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
		System.out.println("attributeRemoved");
	}
}
