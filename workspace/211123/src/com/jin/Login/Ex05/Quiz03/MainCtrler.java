package com.jin.Login.Ex05.Quiz03;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class MainCtrler implements Initializable{
	final private int MAXLENGTH = 9;
	@FXML private Button okBtn;
	@FXML private TextField idTxt;
	@FXML private TextField pwTxt;
	@FXML private CheckBox idChk;
//	DB 사용하기 위해 생성
	private MyDB db;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
//		MyDB 객체 생성
		db = new MyDB();
		
//		엔터키 이동
		idTxt.setOnAction(e->pwTxt.requestFocus());
		pwTxt.setOnAction(e->okBtn.requestFocus());
//		엔터로 회원가입
		okBtn.setOnKeyPressed(e->LoginProc());
//		마우스 클릭으로 회원가입
		okBtn.setOnAction(e->LoginProc());
		
		idTxt.textProperty().addListener(
				(obs, oldTxt, newTxt)->{
					CheckTextLength(obs, oldTxt, newTxt);
//					id가 비어 있는 경우 버튼 비활성화
					setEnable();
				});
//		pw가 비어 있는 경우 버튼 비활성화		
		pwTxt.setOnKeyReleased(e->setEnable());
		
		idChk.setOnAction(e->IsIdChk());
	}
	private void IsIdChk() {
		System.out.println(idChk.isSelected());
	}
	private void setEnable() {
		if(idTxt.getText().isEmpty() || pwTxt.getText().isEmpty())
			okBtn.setDisable(true);
		else
			okBtn.setDisable(false);
	}

	private void CheckTextLength(ObservableValue<? extends String> obs, String oldTxt, String newTxt) {
		String id = idTxt.getText();
		
		if(id.length() > MAXLENGTH) {
			idTxt.setText(oldTxt);
		}
	}
	private void LoginProc() {
		String id = idTxt.getText();
		String pw = pwTxt.getText();

//		id가 비어 있다면 종료
		if(isTxtFieldEmpty(idTxt)) return;
		if(isTxtFieldEmpty(pwTxt)) return;
		
		boolean idLgn = db.isLogin(id, pw);
		if(idLgn==true) {
			MsgBox("성공");
		}else {
			MsgBox("실패");
			clear();
		}
	}
	
	private void clear() {
//		id check box가 check되어 있는지 확인
		if(!idChk.isSelected())
			idTxt.clear();
		pwTxt.clear();
		okBtn.setDisable(true);
	}
	private boolean isTxtFieldEmpty(TextField txt) {
		if(txt.getText().isEmpty()) {
			txt.requestFocus();
			MsgBox(txt.getId() + "가 비어 있어요");
			pwTxt.clear();
//			메소드 종료
			return true;
		}
		return false;
	}
	private void MsgBox(String msg) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("제목 추가");
		alert.setHeaderText("헤더 추가");
		alert.setContentText(msg);
		alert.show();		
	}
}
