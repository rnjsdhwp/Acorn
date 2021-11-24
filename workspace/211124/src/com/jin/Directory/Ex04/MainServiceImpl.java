package com.jin.Directory.Ex04;

import java.io.File;

import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.FileChooser.ExtensionFilter;

public class MainServiceImpl implements IMainService{

	@Override
	public String getFilePath(Stage s) {
		FileChooser fileChooser = new FileChooser();
		
		fileChooser.getExtensionFilters().addAll(
				new ExtensionFilter("Text Files", "*.txt"),
				new ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif"),
				new ExtensionFilter("Audio Files", "*.wav", "*.mp3"),
				new ExtensionFilter("All Files", "*.*"));
		
		File selectedFile =  fileChooser.showOpenDialog(s);
		return selectedFile.getPath();
	}

	@Override
	public String getDirPath() {
		DirectoryChooser dirChooser = new DirectoryChooser();
		File selectedFile = dirChooser.showDialog(null);
		return selectedFile.getPath();
	}

}
