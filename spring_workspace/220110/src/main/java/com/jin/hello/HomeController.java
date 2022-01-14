package com.jin.hello;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
//	RequestMapping : ����ڰ� ������ ������ �� URI ������ �޴� �κ�
//	URI�� http://localhost:8080/hello/ ���� hello ���� �κ��� �ǹ���
//	value���� ������ ��ɾ ������, ���⼭�� hello������ /�� ��
	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String �޼ҵ��() �� �⺻ ����
//	Model : ���� jsp�� ������ �� ���
	public String home(Locale locale, Model model) {
//		logger : ���� ���¸� console�� ����ϱ� ���� ��
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		
//		jsp�� ���� ������ �� ù��° ���ڴ� ������ ������, �ι�° ���ڴ� ������ �����͸� �ǹ���
//		������ �����ʹ� ������ �����ο�, list, map �� ��� ����
		model.addAttribute("serverTime", formattedDate );
		
		ArrayList list = new ArrayList();
		list.add(0, "1");
		list.add(1, 2);
		model.addAttribute("serverTime1", list );
		
//		ȣ���� jsp ������ �̸� ����
		return "home";
	}
	
}
