package com.jin.Directory.Ex03;

import java.io.File;

import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class MainServiceImpl implements IMainService{

	@Override
	public String getFilePath(Stage s) {
		FileChooser fileChooser = new FileChooser();
		
//		읽어들일 파일 확장자 설정
		fileChooser.getExtensionFilters().addAll(
				new ExtensionFilter("Text Files", "*.txt"),
				new ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif"),
				new ExtensionFilter("Audio Files", "*.wav", "*.mp3"),
				new ExtensionFilter("All Files", "*.*"));
		
//		읽기 창 열기
		File selectedFile =  fileChooser.showOpenDialog(s);
//		파일 경로 반환
		return selectedFile.getPath();
	}

}
