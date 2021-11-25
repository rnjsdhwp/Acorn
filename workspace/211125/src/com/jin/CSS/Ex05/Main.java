package com.jin.CSS.Ex05;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

public class Main extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage s) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene sc = new Scene(root);
//		css ������ ��Ÿ�� ����
		sc.getStylesheets().add(getClass().getResource("App.css").toString());
		
		s.setScene(sc);
		s.show();
	}

}
