package com.jin.Notepad;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import com.jin.Common.Common;

import javafx.scene.Parent;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class FileServiceImpl implements IFileService{
	private IFileDao iFileDao;
	private int oldHash;
	public FileServiceImpl() {
		iFileDao = new FileDaoImpl();
	}
	@Override
	public String SaveWindow() {
//		������ ������ ��θ� ��� ���� ���� ���̾�α� ȣ�� �� ������ ��ġ ����
//		������ ����� file�� �����
		FileChooser fileChooser = new FileChooser();
		fileChooser.getExtensionFilters().addAll(
				new ExtensionFilter("Text files", "*.txt"),
				new ExtensionFilter("All files", "*.*")
				);
		File file = fileChooser.showSaveDialog(null);
		
//		���� ���� �� null�� ���� ���� ó��
		String filePath = "";
		
		try {
//			������ ��θ� ����
			filePath = file.getPath();
//			���� file�� Null�� ��� catch �κ� ����
		} catch (NullPointerException e) {
//			Mac�� �ٿ�ε� ������ ��� ó�� ���� ���� �ӽ� ������ ����
			filePath = getTmpDir() + "tmp.txt";
		}

		return filePath;
	}

	private String getTmpDir() {
//		String tmpDir = System.getProperty("java.io.tmpdir");
//		return tmpDir;
		return System.getProperty("java.io.tmpdir");
	}

	@Override
	public void SaveFile(Parent form, String filePath) {
		String contents = getText(form);
		SaveFile(filePath, contents);
	}
	private void SaveFile(String filePath, String contents) {
		try {
			FileWriter writer = new FileWriter(filePath);
			writer.write(contents);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private String getText(Parent form) {
		TextArea txtArea = (TextArea) form.lookup("#txtArea");
		return txtArea.getText();
	}

	@Override
	public void Insert(Parent form, String filePath) {
		String contents = getText(form);
		int hash = getHash(contents);
		if(oldHash == hash)	return;
		
		oldHash = hash;

		String key = String.valueOf(getHash(filePath));
		String value = filePath;
		iFileDao.Insert(key, value);
	}

	private int getHash(String contents) {
		return contents.hashCode();
	}
	
	@Override
	public void LoadRecent(Parent form) {
		List<String> pathLst = iFileDao.select();
		
		Common.StoreMenu(form, pathLst);
	}
	@Override
	public List<String> Select() {
		return iFileDao.select();
	}
	
}
