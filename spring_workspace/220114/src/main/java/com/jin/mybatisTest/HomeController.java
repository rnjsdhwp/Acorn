package com.jin.mybatisTest;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jin.DTO.Person;
import com.jin.Serv.ITestService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	private ITestService iTestServ;
	private DataSource dataSource;
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = {"/", "home"})
	public String home() {
		try {
			dataSource.getConnection();
			logger.info("success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.info("fail");
		}
		return "home";
	}
	
	@RequestMapping(value = "/insert")
	public String insert(Model model) {
		model.addAttribute("userId", "jin");
		
		return "insert";
	}
	
	@RequestMapping(value = "/insertProc")
	public String insertProc(Person person,
			@RequestParam("userId") String userId,
			Model model) {
		iTestServ.Insert(person);
		model.addAttribute("personList", iTestServ.selectAll());
		return "select";
	}
	
	@RequestMapping(value = "/selectAll")
	public String selectAll(Model model) {
		model.addAttribute("personList", iTestServ.selectAll());
		
		return "select";
	}
	
	@RequestMapping(value = "/selectPart")
	public String selectPart(Model model,
			@RequestParam("id") String id) {
		model.addAttribute("personList", iTestServ.selectAll());
		model.addAttribute("personPart", iTestServ.selectPart(id));
		return "select";
	}
	
	@RequestMapping(value = "/modify")
	public String modify(Model model,
			Person person) {
		model.addAttribute("personPart", person);
		return "modify";
	}
	
	@RequestMapping(value = "/modifyProc")
	public String modifyProc(Model model,
			Person person) {
//		서비스 이동 > DAO이동 > mapper에서 DB 수정
		iTestServ.modifyProc(person);
//		model.addAttribute("personList", iTestServ.selectAll());
//		redirect:[명령어]
		return "redirect:selectAll";
	}
	
	@RequestMapping(value = "/deleteProc")
	public String deleteProc(@RequestParam("id") String id) {
		iTestServ.deleteProc(id);
		return "redirect:selectAll";
	}
}
