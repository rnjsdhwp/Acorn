package com.jin.Stage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/*
 * �������� ũ�� ����
 * ������ ���� Pane�� Scene�� �ʿ���
 */

public class Ex04 extends Application{

	@Override
	public void start(Stage s) throws Exception {
		BorderPane root = new BorderPane();
//		pane�� Stage�� �����ϱ� ���� Scene�� �߰�
		Scene sc = new Scene(root, 300, 200);
//		������ scene �߰�
		s.setScene(sc);
		
		s.setTitle("����");
		s.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
