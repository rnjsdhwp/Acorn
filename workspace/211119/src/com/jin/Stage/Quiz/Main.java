package com.jin.Stage.Quiz;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage s) throws Exception {
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root, 300, 200);
		
		s.setTitle("Quiz05");
		s.setScene(scene);
//		�������̽��� ��� ������ �Ʒ��� ���� ������ �ڵ�
//		�̰��� �����̴�. ����, �� ����
		IQuiz05 iQuze = new Quiz05Impl(s, 300, 200);
		iQuze.ShowFrame();
	}

}
