package com.jin.Stage;

import javafx.application.Application;
import javafx.stage.Stage;

/*
 * setTitle �޼ҵ�
 *  - �����쿡 ������ ����
 */
public class Ex02 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
//		������ â�� ���� ����
		primaryStage.setTitle("ù ������ ����");
//		������ â ����
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
