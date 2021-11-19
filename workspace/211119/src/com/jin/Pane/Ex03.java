package com.jin.Pane;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Ex03 extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage s) throws Exception {
		Pane p = new Pane();
		Group g = new Group();
		MyShape shape = new MyShape();
		
		for(int i=0; i<5; i++) {
			Rectangle r = shape.getRect(i*20, i*20, 100, 10, Color.RED);
			p.getChildren().add(r);
		}
		
//		css ����
		p.setStyle("-fx-background-color:black");
//		pane�� ũ�� ����, ����� ���۵��� ����
		p.setPrefSize(100, 100);
//		group�� pane�� �߰��ϸ� ũ�⸦ ������ �� �ִ�.
		g.getChildren().add(p);
		
		Scene sc = new Scene(g, 300, 200);
		s.setScene(sc);
		s.show();
	}
}
