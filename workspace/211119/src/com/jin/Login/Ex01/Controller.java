package com.jin.Login.Ex01;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/* Initializable은 초기화 작업을 진행하기 위한 것으로
 * 여기서는 이벤트 처리를 위한 것이다.
 * 이벤트란 마우스 클릭, 키보드 클릭 등 전기적 신호 처리라고 생각하면 된다.
*/
public class Controller implements Initializable{
//	Scene builder를 통해 만든 fx:id와 같은 이름이어야 한다.
	@FXML private Button btn;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
//		setOnAction은 버튼이 클릭되었을 경우 동작되도록 코딩하기 위한 메소드
		
		btn.setOnAction(e->{
			System.out.println("버튼 클릭"+e);
		});
//		btn.setOnAction(
//				new EventHandler<ActionEvent>() {
//					
//					@Override
//					public void handle(ActionEvent e) {
//						// TODO Auto-generated method stub
//						System.out.println("버튼 클릭"+e);
//					}
//				}
//		);
	}

}
