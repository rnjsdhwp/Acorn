package com.jin.Login.Ex03.Quiz01;

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

		okBtn.setOnAction(e->{
			LoginProc(e);
		});
	}
	
	
	private void LoginProc(ActionEvent e) {
//		1. id_tf�� ����ִ��� Ȯ��
		String id = id_tf.getText();
		if(id.isEmpty())	
//			1.1 ��� ������ focus ����
			id_tf.requestFocus();
//		2. pw_tf�� ����ִ��� Ȯ��
		else if(pw_tf.getText().isEmpty())
//			2.1 ��� ������ focus ����
			pw_tf.requestFocus();
		
	}

}
