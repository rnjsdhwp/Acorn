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
		
//		0��ġ���� ���� ������ �� ������
//		���۰�(2) ���� ������ ����
		MsgBox("substring(2) : " + txt.substring(2));
//		���۰�(2) ���� 4��° ������ ����
		MsgBox("substring(2, 4) : " + txt.substring(2, 4));
	}
	private void EqualsTest(ActionEvent e) {
		String str = "hello";
		String txt = txtInput.getText();
		
//		���� ������ ����.
		boolean result = str.contentEquals(txt);
		MsgBox("contentEquals : " + String.valueOf(result));
//		����� �ڷ����� ����.
		result = str.equals(txt);
		MsgBox("equals : " + String.valueOf(result));
//		��ҹ��� ����
		result = str.equalsIgnoreCase(txt);
		MsgBox("equalsIgnoreCases : " + String.valueOf(result));
	}
	/*
	 * length�� ���ڿ��� ���̸� ���´�
	 */
	private void lengthTest(ActionEvent e) {
		String txt = txtInput.getText();
		int len = txt.length();
		MsgBox("length : " + String.valueOf(len));
	}
	/*
	 * isEmpty�� �̿��Ͽ� ���� txtInput�� ���ڰ� �����ϴ��� Ȯ��
	 * String.valueOf�� �Էµ� �ڷ����� ���ڿ��� ��ȯ
	 */
	private void isEmptyTest(ActionEvent e) {
		String txt = txtInput.getText();
		boolean isTxt = txt.isEmpty();
		MsgBox("isEmpty : " + String.valueOf(isTxt));
	}
	private void MsgBox(String msg) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("���� �߰�");
		alert.setHeaderText("��� �߰�");
		alert.setContentText(msg);
		alert.show();
	}

}
