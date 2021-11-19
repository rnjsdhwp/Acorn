package com.jin.Stage.Quiz;

import java.awt.*;

import javafx.stage.Stage;

public class Quiz05Impl implements IQuiz05 {
//	final : 수정 불가를 위해 사용
//	가독성을 높이기 위해 사용, 코드의 해석이 용이함.
	private final int LEFTTOP = 0;
	private final int CENTERTOP = 1;
	private final int RIGHTTOP = 2;
	private final int LEFTMIDDLE = 3;
	private final int CENTERMIDDLE = 4;
	private final int RIGHTMIDDLE = 5;
	private final int LEFTBOTTOM = 6;
	private final int CENTERBOTTOM = 7;
	private final int RIGHTBOTTOM = 8;
	
	private Stage s;
	private Dimension frameSize;
//	생성자를 통해 Stage와 Frame의 가로, 세로 크기를 저장
//	default 생성자가 없음으로 Quiz05Impl 클래스 생성 시 
//	Stage와 Frame의 크기는 필수 사항으로 데이터를 전달 받아야 함. 
	public Quiz05Impl(Stage s, int frameWidth, int frameHeight) {
		frameSize = new Dimension(frameWidth, frameHeight);
		this.s = s;
	}
	@Override
	public Dimension getScreenSize() {
		Toolkit tk = Toolkit.getDefaultToolkit();
		return tk.getScreenSize();
	}

	@Override
	public void ShowFrame() {
//		for(int i=0;i<=8;i++) {
		for(int i=LEFTTOP;i<=RIGHTBOTTOM;i++) {
			setLocation(i);
			ShowFrame(300);
		}
		s.show();		
	}
	private void ShowFrame(int delay) {
		s.show();
		try {
			Thread.sleep(delay);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s.hide();
	}
	private void setLocation(int pos) {
		int x=0, y=0;
		Dimension screenSize = getScreenSize();
		switch(pos) {
		case LEFTTOP:
			x=0;
			y=0;
			break;
		case CENTERTOP:
			x=(screenSize.width - frameSize.width)/2;
			y=0;
			break;
		case RIGHTTOP:
			x=(screenSize.width - frameSize.width);
			y=0;
			break;
		case LEFTMIDDLE:
			x=0;
			y=(screenSize.height - frameSize.height)/2;
			break;
		case CENTERMIDDLE:
			x=(screenSize.width - frameSize.width)/2;
			y=(screenSize.height - frameSize.height)/2;
			break;
		case RIGHTMIDDLE:
			x=(screenSize.width - frameSize.width);
			y=(screenSize.height - frameSize.height)/2;
			break;
		case LEFTBOTTOM:
			x=0;
			y=(screenSize.height - frameSize.height);
			break;
		case CENTERBOTTOM:
			x=(screenSize.width - frameSize.width)/2;
			y=(screenSize.height - frameSize.height);
			break;
		case RIGHTBOTTOM:
			x=(screenSize.width - frameSize.width);
			y=(screenSize.height - frameSize.height);
			break;
		}
		s.setX(x);
		s.setY(y);
	}

}
