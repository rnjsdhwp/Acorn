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


public class Quiz02 extends Application{

	@Override
	public void start(Stage s) throws Exception {
//		1. 좌표 100, 100, 글자 infiscap world
		Text text = new Text(100,100,"Infiscap World!");
//		2. 글자 크기 20 지정
		text.setFont(new Font(20));
//		3. scene 설정
		Scene sc = new Scene(new Group(text));
		
//		4. stage 설정
		s.setScene(sc);
		s.setTitle("Quiz02");
		s.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
