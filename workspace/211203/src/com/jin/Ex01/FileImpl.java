package com.jin.Ex01;

import java.io.File;

import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class FileImpl implements IFile{

	@Override
	public void Save() {
		SaveWindow();
		CreateFile();
		Insert();
	}

	private void Insert() {
		// TODO Auto-generated method stub
		
	}

	private void CreateFile() {
		// TODO Auto-generated method stub
		
	}

	private void SaveWindow() {
		FileChooser fileChooser = new FileChooser();
		fileChooser.getExtensionFilters().addAll(
				new ExtensionFilter("Text files", "*.txt"),
				new ExtensionFilter("All files", "*.*")
				);
		File file = fileChooser.showSaveDialog(null);
		System.out.println(file);
	}

}
