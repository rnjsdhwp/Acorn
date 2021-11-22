package com.jin.Login.Ex03.Quiz02;

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
		
//		id�� ��� �ִٸ� ����
		if(id.isEmpty()) {	
			id_tf.requestFocus();
			pw_tf.clear();
			MsgBox("id�� ��� �־��.");
//			�޼ҵ� ����
			return;
		}else if(pw.isEmpty()) {
			pw_tf.requestFocus();
			MsgBox("pw�� ��� �־��.");
			return;
		}
		
		boolean idLgn = db.isLogin(id, pw);
		if(idLgn) {
			MsgBox("����");
		}else {
			MsgBox("����");
		}
	}
	
	private void MsgBox(String msg) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("�޽���");
		alert.setHeaderText("�޽���");
		alert.setContentText(msg);
		alert.show();
	}

}
