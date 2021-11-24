package com.jin.Directory.Ex01;

import java.net.URL;

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
//		System.out.println(getClass());
//		System.out.println(getClass().getResource(""));
//		System.out.println(getClass().getResource("DirectoryForm.fxml"));
		
		URL fxml = getClass().getResource("DirectoryForm.fxml");
		FXMLLoader loader = new FXMLLoader(fxml);
		Parent dialogForm = loader.load();
		
		s.setScene(new Scene(dialogForm));
		s.show();
		
		
//		Parent root = FXMLLoader.load(
//				getClass().getResource("DirectoryForm.fxml"));
//		s.setScene(new Scene(root));
//		s.show();
	}

}
