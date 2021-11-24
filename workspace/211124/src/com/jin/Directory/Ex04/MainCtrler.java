package com.jin.Directory.Ex04;

import javafx.stage.Stage;

public class MainCtrler {
	private Stage stage;
	private IMainService iMainServ;
	
	public MainCtrler() {
		iMainServ = new MainServiceImpl();
	}
	public void OpenFileWindow() {
		String filePath = iMainServ.getFilePath(stage);
		System.out.println(filePath);
	}
	public void OpenDirWindow() {
		String filePath = iMainServ.getDirPath();
		System.out.println(filePath);
	}
	public void setStage(Stage s) {
		stage = s;
	}
}
