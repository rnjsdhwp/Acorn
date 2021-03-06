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
		
//		showOpenDialog에서 인자를 전달하면 전달된 인자에 종속된다.
//		즉, fileOpen은 Stage에 묶여 fileopen이 종료될 때까지 Stage를 사용할 수 없게 된다.
		File selectedFile =  fileChooser.showOpenDialog(s);
		return selectedFile.getPath();
	}

	@Override
	public String getDirPath() {
		DirectoryChooser dirChooser = new DirectoryChooser();
//		여기서는 전달된 인자가 null이므로 독립적으로 움직인다.
//		즉, dirOpen과 stage는 별도의 프로그램으로 인식된다.
		File selectedFile = dirChooser.showDialog(null);
		return selectedFile.getPath();
	}

}
