package com.jin.Stage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/*
 * 윈도우의 크기 설정
 * 설정을 위해 Pane과 Scene이 필요함
 */

public class Ex04 extends Application{

	@Override
	public void start(Stage s) throws Exception {
		BorderPane root = new BorderPane();
//		pane을 Stage에 적용하기 위해 Scene에 추가
		Scene sc = new Scene(root, 300, 200);
//		설정한 scene 추가
		s.setScene(sc);
		
		s.setTitle("연습");
		s.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
