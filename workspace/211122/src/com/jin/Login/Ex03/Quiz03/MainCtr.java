package com.jin.Login.Ex03.Quiz03;

import java.net.URL;
import java.util.ResourceBundle;

import com.jin.Login.Ex01.Quiz03.MyDB;

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
	private MyDB db;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		db = new MyDB();
		
		okBtn.setOnAction(e->{
			LoginProc(e);
		});
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
