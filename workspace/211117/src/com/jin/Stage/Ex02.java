package com.jin.Stage;

import javafx.application.Application;
import javafx.stage.Stage;

/*
 * setTitle 메소드
 *  - 윈도우에 제목을 지정
 */
public class Ex02 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
//		윈도우 창의 제목 지정
		primaryStage.setTitle("첫 윈도우 생성");
//		윈도우 창 띄우기
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
