package com.jin.Stage;

import java.awt.Toolkit;
import java.awt.Dimension;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Quiz03 extends Application{

	@Override
	public void start(Stage s) throws Exception {
		Text text = new Text(120,140,"Infiscap World!");
		text.setFont(new Font(35));
		Scene sc = new Scene(new Group(text),400,350);
		
		s.setScene(sc);
		s.setTitle("Quiz03");
		s.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
