package com.jin.home;

import java.nio.file.Paths;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jin.home.DTO.Categories;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	private Map<String, String> pageMap;
	public HomeController() {
		pageMap = new HashMap<String, String>();
		
//		member
		pageMap.put("login", "member/");
		pageMap.put("myPage", "member/");
		pageMap.put("email", "member/");
		
//		seoul
		pageMap.put("intro", "seoul/");
		pageMap.put("join", "seoul/");
	}
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		
		return "home";
	}
//	{pathName}은 url로 들어오는 형식 중 "/명령어" 형식일 경우 동작
//	ex. /intro/test 로 들어오게 되면 /{pathName}은 동작되지 않음
//	pathName은 변수명으로 원하는 값으로 변경 가능
//	4.
	@RequestMapping(value = "/{pathName}", method = RequestMethod.GET)
	public String home(@PathVariable String pathName,
//			@RequestParam("categoryId") String categoryId,
//			@RequestParam("categoryName") String categoryName,
//			@RequestParam("description") String description,
			Categories categories,
			Model model) {
//		model.addAttribute("categoryId", categoryId);
//		model.addAttribute("categoryName", categoryName);
//		model.addAttribute("description", description);
		model.addAttribute("categories", categories);
		
		return pageMap.get(pathName) + pathName;
	}
	
//	3.
//	@RequestMapping(value = "/{pathName}", method = RequestMethod.GET)
//	public String home(@PathVariable String pathName) {
//		if(pathName.equals("login")||pathName.equals("myPage")||pathName.equals("email"))
//			return "member/"+pathName;
//		else if(pathName.equals("intro")||pathName.equals("join"))
//			return "seoul/"+pathName;
//		return "home";
//	}

//	2.
//	@RequestMapping(value = "/member/{pathName}", method = RequestMethod.GET)
//	public String member(@RequestParam("id") String id, @RequestParam("name") String name, 
//			@RequestParam("description") String description, Model model,
//			@PathVariable String pathName) {
//		model.addAttribute("id", id);
//		model.addAttribute("name", name);
//		model.addAttribute("description", description);
//		System.out.println(pathName);
//		
//		return "/member/"+pathName;
//	}
//	@RequestMapping(value = "/seoul/{pathName}", method = RequestMethod.GET)
//	public String seoul(@RequestParam("id") String id, @RequestParam("name") String name, 
//			@RequestParam("description") String description, Model model,
//			@PathVariable String pathName) {
//		model.addAttribute("id", id);
//		model.addAttribute("name", name);
//		model.addAttribute("description", description);
//		
//		return "/seoul/"+pathName;
//	}
//	1.
//	@RequestMapping(value = "/login", method = RequestMethod.GET)
//	public String login(@RequestParam("id") String id, @RequestParam("name") String name, 
//			@RequestParam("description") String description, Model model) {
//		model.addAttribute("id", id);
//		model.addAttribute("name", name);
//		model.addAttribute("description", description);
//		
//		return "/member/login";
//	}
//	@RequestMapping(value = "/myPage", method = RequestMethod.GET)
//	public String myPage(@RequestParam("id") String id, @RequestParam("name") String name, 
//			@RequestParam("description") String description, Model model) {
//		model.addAttribute("id", id);
//		model.addAttribute("name", name);
//		model.addAttribute("description", description);
//		
//		return "/member/myPage";
//	}
//	@RequestMapping(value = "/email", method = RequestMethod.GET)
//	public String email(@RequestParam("id") String id, @RequestParam("name") String name, 
//			@RequestParam("description") String description, Model model) {
//		model.addAttribute("id", id);
//		model.addAttribute("name", name);
//		model.addAttribute("description", description);
//		
//		return "/member/email";
//	}
//	@RequestMapping(value = "/intro", method = RequestMethod.GET)
//	public String intro(@RequestParam("id") String id, @RequestParam("name") String name, 
//			@RequestParam("description") String description, Model model) {
//		model.addAttribute("id", id);
//		model.addAttribute("name", name);
//		model.addAttribute("description", description);
//		
//		return "/seoul/intro";
//	}
//	@RequestMapping(value = "/join", method = RequestMethod.GET)
//	public String join(@RequestParam("id") String id, @RequestParam("name") String name, 
//			@RequestParam("description") String description, Model model) {
//		model.addAttribute("id", id);
//		model.addAttribute("name", name);
//		model.addAttribute("description", description);
//		
//		return "/seoul/join";
//	}
}
