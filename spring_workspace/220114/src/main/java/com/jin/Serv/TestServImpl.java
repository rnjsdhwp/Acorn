package com.jin.Serv;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	@Override
	public List<Person> selectAll() {
		return iTestDAO.selectAll();
	}

	@Override
	public Person selectPart(String id) {
		return iTestDAO.selectPart(id);
	}

	@Override
	public void modifyProc(Person person) {
		Map<String, String> map = new HashMap<String, String>();
		
//		map.put("id", String.valueOf(person.getId()));
		map.put("id", person.getId()+"");
		map.put("fn", person.getFirstname());
		map.put("ln", person.getLastname());
		
//		iTestDAO.modifyProc(person);
		iTestDAO.modifyProc(map);
	}

	@Override
	public void deleteProc(String id) {
		iTestDAO.deleteProc(id);
	}

}
