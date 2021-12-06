package com.jin.Ex08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import javafx.scene.Parent;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class FileImpl implements IFile{
	private void Insert() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void CreateFile(Parent form, String filePath) {
		String txt = getText(form);
		
		try {
//			���� ����
			FileWriter writer = new FileWriter(filePath);
//			���Ͽ� ���� ����
			writer.write(txt);
//			���Ḧ �ؾ� �����
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private String getText(Parent form) {
		TextArea txtArea = (TextArea) form.lookup("#txtArea");
		return txtArea.getText();
	}
	@Override
	public String SaveWindow() {
		FileChooser fileChooser = new FileChooser();
		fileChooser.getExtensionFilters().addAll(
				new ExtensionFilter("Text files", "*.txt"),
				new ExtensionFilter("All files", "*.*")
				);
		File file = fileChooser.showSaveDialog(null);
		return file.getPath();
	}
	@Override
	public File OpenWindow() {
		FileChooser fileChooser = new FileChooser();
		 
		return fileChooser.showOpenDialog(null);
	}
	@Override
	public void ReadFile(File file) {
		
		try {
//			���Ͽ��� �� ��ü�� ������
//			FileInputStream fis = new FileInputStream(file);
//			InputStreamReader isr = new InputStreamReader(fis);
//			BufferedReader br = new BufferedReader(isr);
			BufferedReader br = new BufferedReader(
					new InputStreamReader(
						new FileInputStream(file)
					));
			
			while(true) {
//				�ٹٲ� ������ �б�, �� �� �پ� �б�
				String line = br.readLine();
//				���̻� �о� ���� ���� ���ٸ�
				if(line==null)	break;
//				�о� ���� �� ���
				System.out.println(line);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
