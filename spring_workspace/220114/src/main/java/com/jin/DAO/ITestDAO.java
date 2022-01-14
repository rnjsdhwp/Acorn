package com.jin.DAO;

import java.util.List;

import com.jin.DTO.Person;

public interface ITestDAO {
	public void Insert(Person person);
	public List<Person> selectAll();
	public Person selectPart(String id);
}
