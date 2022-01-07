package com.jin.Notepad;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Notepad extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Notepad.fxml"));
		Parent root = (Parent)loader.load();
		Scene scene = new Scene(root);

		primaryStage.setTitle("notepad");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		NotepadController ctrler = loader.getController();
		ctrler.setForm(root);	
	}
}
