package com.jin.Stage;

import javafx.application.Application;
import javafx.stage.Stage;

/*
 * Application을 상속 받아 윈도우 만들기
 */
public class Ex01 extends Application{

	public static void main(String[] args) {
//		Thread를 동작시키기 위한 메소드로
//		start라는 메소드를 찾아 실행 시킴
//		코드가 변경되지 않아서 몰라도 됨.(항상 고정)
		launch(args);
	}
//	Appliction 클래스 내부적으로 start 메소드에 Stage값을 전달
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.show();
	}

	/* 산술 연산 메소드 */
	/*
	 * 연산식 : 1 + 2
	 * 입력 데이터 : 숫자, 문자, 숫자
	 * 출력 데이터 : 연산 결과 3
	 */
//	public int calc(int n1, char op, int n2) {
//		switch(op) {
//		case '+':	return n1 + n2;
//		case '-':	return n1 - n2;
//		}
//		return -1;
//	}
}
