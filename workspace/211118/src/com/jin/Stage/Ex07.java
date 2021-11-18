package com.jin.Stage;

import java.awt.Toolkit;
import java.awt.Dimension;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/*
 * 1. 화면 해상도 구하기
 * 2. (x-rx)/2
 */
public class Ex07 extends Application{

	@Override
	public void start(Stage s) throws Exception {
		BorderPane root = new BorderPane();
		Scene sc = new Scene(root, 300, 200);
		
		
		s.setScene(sc);
		s.setTitle("연습");
		s.show();
		
		Thread.sleep(2000);
//		1. 해상도 구하기
		Toolkit tk = Toolkit.getDefaultToolkit();
//		Dimension은 x, y 좌표 저장
		Dimension screenSize = tk.getScreenSize();
		
		System.out.println("width : "+screenSize.width);
		System.out.println("height : "+screenSize.height);
		
//		window 크기
		int rectX = 300;
		int rectY = 200;
//		window를 화면의 중앙에 위치시키기 위해 좌표 설정
		s.setX( (screenSize.width-rectX)/2 );
		s.setY( (screenSize.height-rectY)/2 );
		
		s.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
