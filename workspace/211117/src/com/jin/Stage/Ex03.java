package com.jin.Stage;

import javafx.application.Application;
import javafx.stage.Stage;

public class Ex03 extends Application{
	@Override
	public void start(Stage s) throws Exception {
		s.setTitle("first window");
		s.show();
//		������ ���� �� �ֿܼ� ���
		System.out.println(s.getTitle());
	}
	public static void main(String[] args) {
		launch(args);
	}
}
