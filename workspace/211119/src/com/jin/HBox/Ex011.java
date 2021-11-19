package com.jin.HBox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Ex011 extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage s) throws Exception {
//		Spacing=10;
		HBox hbox = new HBox(10);
//		padding은 테두리를 의미함. insets은 상하좌우 모든 값을 통일
		hbox.setPadding(new Insets(20));
		
		Pane p1 = new Pane();
		Pane p2 = new Pane();
		
		p1.setStyle("-fx-background-color:blue");
		p1.setPrefSize(200, 150);
		
		p2.setStyle("-fx-background-color:red");
		p2.setPrefSize(200, 150);
		
		hbox.getChildren().addAll(p1, p2);
		
		Scene sc = new Scene(hbox, 300, 200);
		s.setScene(sc);
		s.show();
	}
}
