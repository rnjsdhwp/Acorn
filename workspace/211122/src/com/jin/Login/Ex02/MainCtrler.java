package com.jin.Login.Ex02;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class MainCtrler implements Initializable{
	
	@FXML private Button okBtn;
	@FXML private TextField txtInput;
	@FXML private TextField tf2;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		okBtn.setOnAction(e->{
//			isEmptyTest(e);
//			lengthTest(e);
//			EqualsTest(e);
			subStringTest(e);
		});
		
	}
	private void subStringTest(ActionEvent e) {
		String txt = txtInput.getText();
		
//		0위치부터 값을 추출할 수 있으며
//		시작값(2) 부터 끝까지 추출
		MsgBox("substring(2) : " + txt.substring(2));
//		시작값(2) 부터 4번째 값까지 추출
		MsgBox("substring(2, 4) : " + txt.substring(2, 4));
	}
	private void EqualsTest(ActionEvent e) {
		String str = "hello";
		String txt = txtInput.getText();
		
//		내부 내용이 같다.
		boolean result = str.contentEquals(txt);
		MsgBox("contentEquals : " + String.valueOf(result));
//		내용과 자료형이 같다.
		result = str.equals(txt);
		MsgBox("equals : " + String.valueOf(result));
//		대소문자 무시
		result = str.equalsIgnoreCase(txt);
		MsgBox("equalsIgnoreCases : " + String.valueOf(result));
	}
	/*
	 * length는 문자열의 길이를 얻어온다
	 */
	private void lengthTest(ActionEvent e) {
		String txt = txtInput.getText();
		int len = txt.length();
		MsgBox("length : " + String.valueOf(len));
	}
	/*
	 * isEmpty를 이용하여 현재 txtInput에 문자가 존재하는지 확인
	 * String.valueOf는 입력된 자료형을 문자열로 변환
	 */
	private void isEmptyTest(ActionEvent e) {
		String txt = txtInput.getText();
		boolean isTxt = txt.isEmpty();
		MsgBox("isEmpty : " + String.valueOf(isTxt));
	}
	private void MsgBox(String msg) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("제목 추가");
		alert.setHeaderText("헤더 추가");
		alert.setContentText(msg);
		alert.show();
	}

}
