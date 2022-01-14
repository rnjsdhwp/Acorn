package com.jin.dbtest;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.jin.DTO.Person;

@Repository
public class PersonDAOImpl implements IPersonDAO{
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public void Insert(Person person) {
		logger.info(person.getId()+"");
		
		IPersonDAO iPersonDAO = sqlSessionTemplate.getMapper(IPersonDAO.class);
		iPersonDAO.Insert(person);
	}
	
}