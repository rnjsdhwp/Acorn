package com.jin.Stage;

import java.awt.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/*
 * 	줄맞춤 단축키 : ctrl + shift + F
 */
public class Quiz04 extends Application {
	@Override
	public void start(Stage s) throws Exception {
		AnchorPane root = new AnchorPane();
		Scene sc = new Scene(root, 300, 200);
		
		s.setTitle("Quiz04");
		s.setScene(sc);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		
		int x = 10;
		int y = 10;
		int n = 10;
		int delay = 150;
		
		int gabX = ((screenSize.width - 300)/2 -x)/n;
		int gabY = ((screenSize.height - 200)/2 -y)/n;
		
		for(int i=0; i<n; i++) {
			s.setX(10+gabX*i);
			s.setY(10+gabY*i);
			
			Thread.sleep(delay);
			s.hide();
			Thread.sleep(delay);
			
//			시간 간격을 줄이는데 음수가 되면 sleep에서 에러가 발생하므로
//			음수일 경우 1로 통일
			delay -= i*i;
			if(delay < 0) {
				delay = 1;
			}
			
			s.show();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

}
