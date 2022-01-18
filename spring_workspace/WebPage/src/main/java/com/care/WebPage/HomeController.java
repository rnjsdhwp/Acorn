package com.care.WebPage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/")
	public String index(Model model) {
		model.addAttribute("formPath", "home");
		return "index";
	}
	@RequestMapping(value = "index")
	public String index2(Model model,
			@RequestParam("formPath") String formPath) {
		model.addAttribute("formPath", formPath);
		return "index";
	}
	@RequestMapping(value = "home")
	public String home() {
		return "home";
	}
	@RequestMapping(value = "login")
	public String login() {
		return "MemberForm/loginForm";
	}
	@RequestMapping(value = "membership")
	public String membership() {
		return "MemberForm/memberForm";
	}
	@RequestMapping(value = "/board")
	public String board() {
		return "BoardForm/boardForm";
	}
	
}
