package com.jin.Stage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/*
 * 
 */
public class Ex05 extends Application{

	@Override
	public void start(Stage s) throws Exception {
		BorderPane root = new BorderPane();
		Scene sc = new Scene(root, 300, 200);
		s.setScene(sc);
		
		s.setTitle("����");
		s.show();
		
//		1/1000�ʷ� �ð��� ������Ŵ, 2000�̹Ƿ� 2��
		Thread.sleep(2000);
//		â�� �ּ�ȭ ��Ŵ
		s.setIconified(true);
	}
	public static void main(String[] args) {
		launch(args);
	}
}
