package com.jin.Serv;

import java.util.List;

import com.jin.DTO.Person;

public interface ITestService {
	public void Insert(Person person);
	public List<Person> selectAll();
	public Person selectPart(String id);
}
