package com.jin.Ex09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
//			파일 생성
			FileWriter writer = new FileWriter(filePath);
//			파일에 내용 쓰기
			writer.write(txt);
//			종료를 해야 저장됨
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
	public void ReadFile(File file, ActionEvent e) {
		String txt = getText(file);
		
		Button btn = (Button) e.getSource();
		Scene scene = btn.getScene();
		Parent root = scene.getRoot();
		
		TextArea txtArea = (TextArea) root.lookup("#txtArea");
		txtArea.setText(txt);
	}
	private String getText(File file) {
		String txt ="";
		try {
//			한글 깨짐 해결
//			new InputStreamReader(new FileInputStream(file), "UTF-8")
			BufferedReader br = new BufferedReader(
					new InputStreamReader(
						new FileInputStream(file), "UTF-8"
					));
			
			while(true) {
				String line = br.readLine();
				if(line==null)	break;
				txt += line;
				txt += "\n";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return txt;
	}

}
