package com.jin.Notepad;

import java.util.List;

public interface IFileDao {
	public void Insert(String key, String value);
	public List<String> select();
}
