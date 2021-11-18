package com.jin.Stage;

import java.awt.Toolkit;
import java.awt.Dimension;
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
		
		Thread.sleep(2000);
//		1. �ػ� ���ϱ�
		Toolkit tk = Toolkit.getDefaultToolkit();
//		Dimension�� x, y ��ǥ ����
		Dimension screenSize = tk.getScreenSize();
		
		System.out.println("width : "+screenSize.width);
		System.out.println("height : "+screenSize.height);
		
//		window ũ��
		int rectX = 300;
		int rectY = 200;
//		window�� ȭ���� �߾ӿ� ��ġ��Ű�� ���� ��ǥ ����
		s.setX( (screenSize.width-rectX)/2 );
		s.setY( (screenSize.height-rectY)/2 );
		
		s.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
