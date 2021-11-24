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
//	DB ����ϱ� ���� ����
	private MyDB db;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
//		MyDB ��ü ����
		db = new MyDB();
		
//		����Ű �̵�
		idTxt.setOnAction(e->pwTxt.requestFocus());
		pwTxt.setOnAction(e->okBtn.requestFocus());
//		���ͷ� ȸ������
		okBtn.setOnKeyPressed(e->LoginProc());
//		���콺 Ŭ������ ȸ������
		okBtn.setOnAction(e->LoginProc());
		
		idTxt.textProperty().addListener(
				(obs, oldTxt, newTxt)->{
					CheckTextLength(obs, oldTxt, newTxt);
//					id�� ��� �ִ� ��� ��ư ��Ȱ��ȭ
					setEnable();
				});
//		pw�� ��� �ִ� ��� ��ư ��Ȱ��ȭ		
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

//		id�� ��� �ִٸ� ����
		if(isTxtFieldEmpty(idTxt)) return;
		if(isTxtFieldEmpty(pwTxt)) return;
		
		boolean idLgn = db.isLogin(id, pw);
		if(idLgn==true) {
			MsgBox("����");
		}else {
			MsgBox("����");
			clear();
		}
	}
	
	private void clear() {
//		id check box�� check�Ǿ� �ִ��� Ȯ��
		if(!idChk.isSelected())
			idTxt.clear();
		pwTxt.clear();
		okBtn.setDisable(true);
	}
	private boolean isTxtFieldEmpty(TextField txt) {
		if(txt.getText().isEmpty()) {
			txt.requestFocus();
			MsgBox(txt.getId() + "�� ��� �־��");
			pwTxt.clear();
//			�޼ҵ� ����
			return true;
		}
		return false;
	}
	private void MsgBox(String msg) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("���� �߰�");
		alert.setHeaderText("��� �߰�");
		alert.setContentText(msg);
		alert.show();		
	}
}
