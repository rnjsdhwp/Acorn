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

//		��ư �̺�Ʈ �߰�
		okBtn.setOnAction(e->{
			LoginProc(e);
		});
		
//		txtField�� ��ȭ�� Ȯ���ϱ� ���� ������
//		listen�̶�� ���´� ��� �̺�Ʈ�� �߻����� �� �ٷ� ó���� �� �ֵ���
//		����ϴ� ���¸� �ǹ���
//		obs : ��ü�� ���� ����, oldTxt : ���� ���ڿ�, newTxt : ���� ���ڿ�
		id_tf.textProperty().addListener((obs, oldTxt, newTxt)->{
			addLitenerTest(obs, oldTxt, newTxt);
		});
		
//		Ű���尡 ���� ��� �߻��ϴ� �̺�Ʈ
		pw_tf.setOnKeyPressed(e->{
			setOnKeyPressed(e);
		});
	}
	private void setOnKeyPressed(KeyEvent e) {
//		Ű���尡 ���� �����̹Ƿ� Ű�� �ϳ��� ���
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
//		txtfield �����
		id_tf.clear();
		pw_tf.clear();
		
//		txtfield ��ġ ����
		id_tf.requestFocus();
	}

}
