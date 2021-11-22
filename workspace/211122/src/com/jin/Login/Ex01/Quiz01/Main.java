package com.jin.Login.Ex01.Quiz01;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage s) throws Exception {
		Parent root = FXMLLoader.load(
				getClass().getResource("LoginForm.fxml"));
		s.setScene(new Scene(root));
		s.show();
	}

}
