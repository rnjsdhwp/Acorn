package com.jin.Stage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/*
 * 1. ȭ�� �ػ� ���ϱ�
 * 2. (x-rx)/2
 */
public class Ex07 extends Application{

	@Override
	public void start(Stage s) throws Exception {
		BorderPane root = new BorderPane();
		Scene sc = new Scene(root, 300, 200);
		
		
		s.setScene(sc);
		s.setTitle("����");
		s.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
