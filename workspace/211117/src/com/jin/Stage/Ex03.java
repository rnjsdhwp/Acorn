package com.jin.Stage;

import javafx.application.Application;
import javafx.stage.Stage;

public class Ex03 extends Application{
	@Override
	public void start(Stage s) throws Exception {
		s.setTitle("first window");
		s.show();
//		윈도우 제목 얻어서 콘솔에 출력
		System.out.println(s.getTitle());
	}
	public static void main(String[] args) {
		launch(args);
	}
}
