package com.jin.Login.Ex01;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/* Initializable�� �ʱ�ȭ �۾��� �����ϱ� ���� ������
 * ���⼭�� �̺�Ʈ ó���� ���� ���̴�.
 * �̺�Ʈ�� ���콺 Ŭ��, Ű���� Ŭ�� �� ������ ��ȣ ó����� �����ϸ� �ȴ�.
*/
public class Controller implements Initializable{
//	Scene builder�� ���� ���� fx:id�� ���� �̸��̾�� �Ѵ�.
	@FXML private Button btn;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
//		setOnAction�� ��ư�� Ŭ���Ǿ��� ��� ���۵ǵ��� �ڵ��ϱ� ���� �޼ҵ�
		
		btn.setOnAction(e->{
			System.out.println("��ư Ŭ��"+e);
		});
//		btn.setOnAction(
//				new EventHandler<ActionEvent>() {
//					
//					@Override
//					public void handle(ActionEvent e) {
//						// TODO Auto-generated method stub
//						System.out.println("��ư Ŭ��"+e);
//					}
//				}
//		);
	}

}
