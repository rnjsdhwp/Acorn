package com.jin.Login.Ex03;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.control.Alert.AlertType;

public class MainCtr implements Initializable{

	@FXML private Button okBtn;
	@FXML private TextField id_tf;
	@FXML private TextField pw_tf;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

//		버튼 이벤트 추가
		okBtn.setOnAction(e->{
			LoginProc(e);
		});
		
//		txtField의 변화를 확인하기 위한 것으로
//		listen이라는 상태는 어떠한 이벤트가 발생했을 때 바로 처리할 수 있도록
//		대기하는 상태를 의미함
//		obs : 객체의 현재 상태, oldTxt : 이전 문자열, newTxt : 현재 문자열
		id_tf.textProperty().addListener((obs, oldTxt, newTxt)->{
			addLitenerTest(obs, oldTxt, newTxt);
		});
		
//		키보드가 눌린 경우 발생하는 이벤트
		pw_tf.setOnKeyPressed(e->{
			setOnKeyPressed(e);
		});
	}
	private void setOnKeyPressed(KeyEvent e) {
//		키보드가 눌린 상태이므로 키값 하나씩 출력
		System.out.println(e.getText());
		
	}
	private void addLitenerTest(
			ObservableValue<? extends String> 
			obs, String oldTxt, String newTxt) {
		System.out.println("obs : " + obs);
		System.out.println("oldTxt : " + oldTxt);
		System.out.println("newTxt : " + newTxt);
	}
	private void LoginProc(ActionEvent e) {
//		txtfield 지우기
		id_tf.clear();
		pw_tf.clear();
		
//		txtfield 위치 변경
		id_tf.requestFocus();
	}

}
