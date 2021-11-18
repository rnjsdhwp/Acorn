package com.jin.Stage.Quiz;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage s) throws Exception {
		BorderPane root = new BorderPane();

		Scene scene = new Scene(root, 300, 200);
		
		s.setTitle("Quiz04");
		s.setScene(scene);
		
		Quiz04 q = new Quiz04(s, 300, 200);
		q.showFrame(30);
	}

}
