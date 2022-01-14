package com.jin.dbtest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jin.DTO.Person;

@Service
public class HomeServiceImpl implements IHomeService {
	private static final Logger logger = LoggerFactory.getLogger(HomeServiceImpl.class);
	
	@Autowired
	private IPersonDAO iPersonDAO;
	
	@Override
	public void Insert(Person person) {
//		logger.info("id : " + person.getId());
		logger.info("firstname : " + person.getFirstname());
		logger.info("lastname : " + person.getLastname());
		iPersonDAO.Insert(person);
	}

}
