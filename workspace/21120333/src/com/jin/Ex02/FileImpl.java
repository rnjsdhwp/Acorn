package com.jin.Ex02;

import java.io.File;

import javafx.scene.Parent;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class FileImpl implements IFile{

	@Override
	public void Save(Parent form) {
		SaveWindow();
		CreateFile(form);
		Insert();
	}
	private void Insert() {
		// TODO Auto-generated method stub
		
	}
	private void CreateFile(Parent form) {
		getText(form);		
	}
	private void getText(Parent form) {
		TextArea txtArea = (TextArea) form.lookup("#txtArea");
		System.out.println(txtArea.getText());
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
