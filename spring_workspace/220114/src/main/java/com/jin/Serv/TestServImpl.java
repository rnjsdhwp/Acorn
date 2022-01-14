package com.jin.Serv;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jin.DAO.ITestDAO;
import com.jin.DTO.Person;

@Service
public class TestServImpl implements ITestService{
	private static final Logger logger = LoggerFactory.getLogger(TestServImpl.class);
	@Autowired
	private ITestDAO iTestDAO;
	
	@Override
	public void Insert(Person person) {
		logger.warn(person.getLastname());
		iTestDAO.Insert(person);
	}

}
