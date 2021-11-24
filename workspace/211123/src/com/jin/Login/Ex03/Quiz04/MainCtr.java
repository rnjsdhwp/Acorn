package com.jin.Login.Ex03.Quiz04;

import java.net.URL;
import java.util.ResourceBundle;

import com.jin.Login.Ex03.Quiz04.MyDB;

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

	private int MAXLENGTH = 10;
	@FXML private Button okBtn;
	@FXML private TextField id_tf;
	@FXML private TextField pw_tf;
	private MyDB db;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		db = new MyDB();
		
		okBtn.setOnAction(e->{
			LoginProc(e);
		});
		
//		id_tf.setOnKeyPressed(e->{
//			setOnKeyPressed(e);
//		});
		id_tf.textProperty().addListener(
				(obs, oldTxt, newTxt)->{
					CheckTextLength(obs, oldTxt, newTxt);
				}
				);
		
		
	}
	
	
	private void setOnKeyPressed(KeyEvent e) {
		String id = id_tf.getText();
		if(id.length() >= 10) {
			id_tf.clear();
		}
	}


	private void CheckTextLength(ObservableValue<? extends String> obs, String oldTxt, String newTxt) {
		String id = id_tf.getText();
		
		if(id.length() > MAXLENGTH) {
			id_tf.setText(oldTxt);
			
//			System.out.println(oldTxt);
//			System.out.println(newTxt);
		}
		/*
		if(id.length() >= MAXLENGTH) {
//			id가 0부터 10보다 작을때까지 문자열 추출
			String subId = id.substring(0, MAXLENGTH);
//			추출한 문자열 등록
			id_tf.setText(subId);
		}
		*/
	}


	private void LoginProc(ActionEvent e) {
		String id = id_tf.getText();
		String pw = pw_tf.getText();
		
//		id가 비어 있다면 종료
		if(isTxtFieldEmpty(id_tf)) return;
		if(isTxtFieldEmpty(pw_tf)) return;
		
		boolean idLgn = db.isLogin(id, pw);
		if(idLgn) {
			MsgBox("성공");
		}else {
			MsgBox("실패");
		}
	}
	private boolean isTxtFieldEmpty(TextField txt) {
		if(txt.getText().isEmpty()) {
			txt.requestFocus();
			pw_tf.clear();
			MsgBox(txt.getId() + "가 비어 있어요.");
//			메소드 종료
			return true;
		}
		return false;
	}
	private void MsgBox(String msg) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("메시지");
		alert.setHeaderText("메시지");
		alert.setContentText(msg);
		alert.show();
	}

}
