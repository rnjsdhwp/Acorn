package com.jin.View.Ex10;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
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
		FXMLLoader loader = new FXMLLoader(
				getClass().getResource("viewForm.fxml"));
//		FXML을 메모리에 올리고(실행) fxml에 있는 controller를 생성
		Parent form = loader.load();
		Scene scene = new Scene(form);		
		
		s.setScene(scene);
		s.show();
		
		ViewController ctrler = loader.getController();
		ctrler.setForm(form);
	}

}

























