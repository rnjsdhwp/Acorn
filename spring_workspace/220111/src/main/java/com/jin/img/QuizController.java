package com.jin.img;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.RequestAttributes;

/**
 * Handles requests for the application home page.
 */
@Controller
public class QuizController {
	
	private static final Logger logger = LoggerFactory.getLogger(QuizController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String Quiz() {
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
		
		String formattedDate = dateFormat.format(date);
//		logger.info("현재 날짜 : {}.", formattedDate);
		System.out.println("현재 날짜 : " + formattedDate);
		
		return "home";
	}
	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		
		return "login";
	}
	@RequestMapping(value = "/loginForm", method = RequestMethod.GET)
	public String login(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		
		return "/form/loginForm";
	}
	
	@RequestMapping(value = "/loginForm2", method = RequestMethod.GET)
	public String login2(@RequestParam("id") String id, @RequestParam("pw") String pw, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		
		return "/form/loginForm2";
	}
}
