package com.jin.Directory.Ex03;

import javafx.stage.Stage;

public class MainCtrler{
	private Stage stage;
	private IMainService iMainServ;
//	Main에서 load()가 호출되면 인터페이스에 구현체인 클래스 연결
	public MainCtrler() {
		iMainServ = new MainServiceImpl();
	}
	public void OpenFileWindow() {
		String filePath = iMainServ.getFilePath(stage);
		System.out.println(filePath);
	}

	public void setStage(Stage s) {
		stage = s;
	}
}
