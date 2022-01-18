package com.jin.DAO;

import java.util.List;
import java.util.Map;

import com.jin.DTO.Person;

public interface ITestDAO {
	public void Insert(Person person);
	public List<Person> selectAll();
	public Person selectPart(String id);
	public void modifyProc(Map<String, String> map);
	public void deleteProc(String id);
}
