package com.jin.CSS.Ex07;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage s) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(root);
//		css 파일의 스타일 적용
		scene.getStylesheets().add(
				getClass().getResource("App.css").toString()
			);
		
		s.setScene(scene);
		s.show();
	}

}
