package com.jin.Stage;

import javafx.application.Application;
import javafx.stage.Stage;

/*
 * Application�� ��� �޾� ������ �����
 */
public class Ex01 extends Application{

	public static void main(String[] args) {
//		Thread�� ���۽�Ű�� ���� �޼ҵ��
//		start��� �޼ҵ带 ã�� ���� ��Ŵ
//		�ڵ尡 ������� �ʾƼ� ���� ��.(�׻� ����)
		launch(args);
	}
//	Appliction Ŭ���� ���������� start �޼ҵ忡 Stage���� ����
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.show();
	}

	/* ��� ���� �޼ҵ� */
	/*
	 * ����� : 1 + 2
	 * �Է� ������ : ����, ����, ����
	 * ��� ������ : ���� ��� 3
	 */
//	public int calc(int n1, char op, int n2) {
//		switch(op) {
//		case '+':	return n1 + n2;
//		case '-':	return n1 - n2;
//		}
//		return -1;
//	}
}
