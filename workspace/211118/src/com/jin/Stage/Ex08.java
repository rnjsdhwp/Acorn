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


public class Ex08 extends Application{

	@Override
	public void start(Stage s) throws Exception {
//		Text(x좌표, y좌표, 출력데이터)
		Text text = new Text(10,40,"Hello World");
//		글자 크기 지정
		Font fnt = new Font(40);
		text.setFont(fnt);
//		Group은 pane의 종류 중 하나 
		Group root = new Group(text);
		Scene sc = new Scene(root, 300, 200);
		
		
		s.setScene(sc);
		s.setTitle("연습");
		s.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
