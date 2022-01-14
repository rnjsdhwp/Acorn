package com.jin.dbtest;

import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jin.DTO.Person;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	private DataSource dataSource;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private IHomeService iHomeServ;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
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
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert() {
		
		return "insert";
	}
	
	@RequestMapping(value = "/insertProc", method = RequestMethod.POST)
	public String insertProc(Person person) {
		iHomeServ.Insert(person);
		
		return "insert";
	}
}
