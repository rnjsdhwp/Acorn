package com.jin.Stage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/*
 * 
 */
public class Ex06 extends Application{

	@Override
	public void start(Stage s) throws Exception {
		BorderPane root = new BorderPane();
		Scene sc = new Scene(root, 300, 200);
		s.setScene(sc);
		
		s.setTitle("����");
		s.show();
		
		Thread.sleep(2000);
//		â �����
		s.hide();
		
		Thread.sleep(2000);
//		��ǥ�� 10, 10 ��ġ�� ������ ��Ÿ����
		s.setX(10);
		s.setY(10);
		s.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
