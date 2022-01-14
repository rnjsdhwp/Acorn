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
//	RequestMapping : 사용자가 서버에 접근할 때 URI 정보를 받는 부분
//	URI는 http://localhost:8080/hello/ 에서 hello 다음 부분을 의미함
//	value에는 접근할 명령어를 적어줌, 여기서는 hello다음의 /가 됨
	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String 메소드명() 이 기본 형식
//	Model : 값을 jsp로 전달할 때 사용
	public String home(Locale locale, Model model) {
//		logger : 현재 상태를 console에 출력하기 위한 것
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		
//		jsp에 값을 전달할 때 첫번째 인자는 전달할 변수명, 두번째 인자는 전달할 데이터를 의미함
//		전달할 데이터는 형식이 자유로움, list, map 등 모두 가능
		model.addAttribute("serverTime", formattedDate );
		
		ArrayList list = new ArrayList();
		list.add(0, "1");
		list.add(1, 2);
		model.addAttribute("serverTime1", list );
		
//		호출할 jsp 페이지 이름 지정
		return "home";
	}
	
}
