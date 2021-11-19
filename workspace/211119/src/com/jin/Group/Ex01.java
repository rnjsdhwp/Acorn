package com.jin.Group;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Ex01 extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage s) throws Exception {
		Group g = new Group();
		Rectangle r = new Rectangle();
		
		r.setX(20);
		r.setY(20);
		r.setWidth(100);
		r.setHeight(10);
		r.setFill(Color.RED);
		
		g.getChildren().add(r);
		
		Scene sc = new Scene(g, 300, 200);
		s.setScene(sc);
		s.show();
	}
}
