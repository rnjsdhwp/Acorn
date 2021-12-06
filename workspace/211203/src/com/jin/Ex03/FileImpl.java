package com.jin.Ex03;

import java.io.File;

import javafx.scene.Parent;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class FileImpl implements IFile{
	private void Insert() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void CreateFile(Parent form) {
		getText(form);
//		TextArea txtArea = (TextArea) form.lookup("#txtArea");
//		System.out.println(txtArea.getText());
	}
	private void getText(Parent form) {
		TextArea txtArea = (TextArea) form.lookup("#txtArea");
		System.out.println(txtArea.getText());
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
