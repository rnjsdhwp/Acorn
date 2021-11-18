package com.jin.Stage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/*
 * 
 */
public class Ex05 extends Application{

	@Override
	public void start(Stage s) throws Exception {
		BorderPane root = new BorderPane();
		Scene sc = new Scene(root, 300, 200);
		s.setScene(sc);
		
		s.setTitle("연습");
		s.show();
		
//		1/1000초로 시간을 지연시킴, 2000이므로 2초
		Thread.sleep(2000);
//		창을 최소화 시킴
		s.setIconified(true);
	}
	public static void main(String[] args) {
		launch(args);
	}
}
