package com.jin.Stage.Quiz;

import java.awt.Dimension;
import java.awt.Toolkit;

import javafx.stage.Stage;

public class Quiz04 {
	private Stage s;
	private int frameWidth;
	private int frameHeight;
	private int screenWidth;
	private int screenHeight;
	
	public Quiz04(Stage s, int frameWidth, int frameHeight) {
		this.s = s;
		this.frameWidth = frameWidth;
		this.frameHeight = frameHeight;
	}

	public void showFrame(int n){
//		1. 화면 해상도 구하기
		setScreenSize();
		
//		2. 해상도와 frame을 이용해 중앙 위치 구하기
		int centerX = (screenWidth - frameWidth)/2;
		int centerY = (screenHeight - frameHeight)/2;
		
//		3. 처음 시작위치부터 정중앙 위치까지 n등분
		int gabX = centerX/n;
		int gabY = centerY/n;
		
//		4. 화면 출력
		showFrame(n, gabX, gabY);
		
	}

//	다형성 표현
	private void showFrame(int n, int gabX, int gabY){
		int delay = 300;
		for(int i=0; i<n; i++) {
//			4.1 위치 지정
			s.setX(gabX*i);
			s.setY(gabY*i);
			
//			4.2 숨기기
			s.hide();
			
//			4.3 지연
			delay -= i*i;
			if(delay < 0) {
				delay = 1;
			}
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
//			4.4 보이기
			s.show();
//			try {
//				Thread.sleep(delay);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
	}

	private void setScreenSize() {
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		
		this.screenWidth = screenSize.width;
		this.screenHeight = screenSize.height;
	}
}

