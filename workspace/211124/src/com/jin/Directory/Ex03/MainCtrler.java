package com.jin.Directory.Ex03;

import javafx.stage.Stage;

public class MainCtrler{
	private Stage stage;
	private IMainService iMainServ;
//	Main���� load()�� ȣ��Ǹ� �������̽��� ����ü�� Ŭ���� ����
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
