package com.jin.Stage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Quiz01 extends Application{

	@Override
	public void start(Stage s) throws Exception {
		BorderPane root = new BorderPane();
		Scene sc = new Scene(root, 500, 200);
		s.setScene(sc);
		
		s.setTitle("Quiz01");
		s.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
