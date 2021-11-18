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
//		1. ȭ�� �ػ� ���ϱ�
		setScreenSize();
		
//		2. �ػ󵵿� frame�� �̿��� �߾� ��ġ ���ϱ�
		int centerX = (screenWidth - frameWidth)/2;
		int centerY = (screenHeight - frameHeight)/2;
		
//		3. ó�� ������ġ���� ���߾� ��ġ���� n���
		int gabX = centerX/n;
		int gabY = centerY/n;
		
//		4. ȭ�� ���
		showFrame(n, gabX, gabY);
		
	}

//	������ ǥ��
	private void showFrame(int n, int gabX, int gabY){
		int delay = 300;
		for(int i=0; i<n; i++) {
//			4.1 ��ġ ����
			s.setX(gabX*i);
			s.setY(gabY*i);
			
//			4.2 �����
			s.hide();
			
//			4.3 ����
			delay -= i*i;
			if(delay < 0) {
				delay = 1;
			}
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
//			4.4 ���̱�
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

