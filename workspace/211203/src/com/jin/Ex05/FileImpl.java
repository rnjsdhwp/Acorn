package com.jin.Ex05;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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

}
