package com.jin;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextListenerTest implements ServletContextListener{
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("start context");
	}
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("end context");
	}
}
