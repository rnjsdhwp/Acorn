package com.jin.Directory.Ex06;

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
		URL fxml = getClass().getResource("DirectoryForm.fxml");
		FXMLLoader loader = new FXMLLoader(fxml);
		Parent dialogForm = loader.load();
		
		s.setScene(new Scene(dialogForm));
		s.show();
		
		MainCtrler ctrler = loader.getController();
		ctrler.setStage(s);
	}

}
