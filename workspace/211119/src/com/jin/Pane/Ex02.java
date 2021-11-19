package com.jin.Pane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Ex02 extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage s) throws Exception {
		Pane p = new Pane();
		MyShape shape = new MyShape();
		
		for(int i=0; i<5; i++) {
			Rectangle r = shape.getRect(i*20, i*20, 100, 10, Color.RED);
			p.getChildren().add(r);
		}
//		css 적용
		p.setStyle("-fx-background-color:black");
//		pane의 크기 지정, 현재는 동작되지 않음
		p.setPrefSize(100, 100);
		
		Scene sc = new Scene(p, 300, 200);
		s.setScene(sc);
		s.show();
	}
}
