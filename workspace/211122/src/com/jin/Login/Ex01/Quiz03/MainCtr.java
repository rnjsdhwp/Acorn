package com.jin.Login.Ex01.Quiz03;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class MainCtr implements Initializable{

	@FXML private Button btn;
	@FXML private TextField tf1;
	@FXML private TextField tf2;
//	DB 사용하기 위해 생성
	private MyDB db;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
//		MyDB 객체 생성
		db = new MyDB();
//		버튼 이벤트 추가
		btn.setOnAction(e->{
			LoginProc(e);
		});
	}
	private void LoginProc(ActionEvent e) {
		String id = tf1.getText();
		String pw = tf2.getText();
		
		boolean idLgn = db.isLogin(id, pw);
		if(idLgn==true) {
			System.out.println("성공");
		}else
			System.out.println("실패");
	}
	private void MsgBox(String msg) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("제목 추가");
		alert.setHeaderText("헤더 추가");
		alert.setContentText(msg);
		alert.show();
	}
}
