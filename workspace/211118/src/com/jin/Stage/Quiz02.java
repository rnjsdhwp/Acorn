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
//		1. ��ǥ 100, 100, ���� infiscap world
		Text text = new Text(100,100,"Infiscap World!");
//		2. ���� ũ�� 20 ����
		text.setFont(new Font(20));
//		3. scene ����
		Scene sc = new Scene(new Group(text));
		
//		4. stage ����
		s.setScene(sc);
		s.setTitle("Quiz02");
		s.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
