package com.jin;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class SessionInfoDisplay implements HttpSessionAttributeListener{
	/*
	 * ConcurrentHashMap
	 * hashMap�� ����ȭ ����� ���� ��
	 * hashmap�� ��� null���� ����ϳ� ConcurrentHashMap�� null���� ������� ����.
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
