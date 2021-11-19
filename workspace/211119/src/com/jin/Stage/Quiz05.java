package com.jin.Stage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.awt.*;
public class Quiz05 extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage s) throws Exception {
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root, 300, 200);
		
		s.setTitle("Quiz05");
		s.setScene(scene);
		
//		1.  화면 해상도 구하기
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		int x=0;
		int y=0;
//		2. 상황에 따른 화면 출력
		for(int i=0;i<3;i++) {
			switch(i) {
//			  2.1 0번일 경우 : x=0, y=0
			case 0:
				x=0;
				y=0;
				break;
//			  2.2 1번일 경우 : x=(screenWidth - frameWidth )/2, y=0
			case 1:
				x=(screenSize.width - 300 )/2;
				y=0;
				break;
//			  2.3 2번일 경우 : x=(screenWidth - frameWidth ), y=0
			case 2:
				x=(screenSize.width - 300 );
				y=0;
				break;
			}
			s.setX(x);
			s.setY(y);
			s.show();
			Thread.sleep(300);
			s.hide();
		}
		
		s.show();
	}

}
