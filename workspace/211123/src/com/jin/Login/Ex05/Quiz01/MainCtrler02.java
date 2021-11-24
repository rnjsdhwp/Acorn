package com.jin.Login.Ex05.Quiz01;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainCtrler02 implements Initializable{

	@FXML private Button okBtn;
	@FXML private TextField idTxt;
	@FXML private TextField pwTxt;
	private int MAXLENGTH = 9;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		idTxt.setOnAction(e->pwTxt.requestFocus());
		pwTxt.setOnAction(e->okBtn.requestFocus());
		okBtn.setOnAction(e->System.out.println("로그인"));
		
//		키가 눌린경우
//		idTxt.setOnKeyPressed(e->setEnable());
//		키가 눌린 상태에서 해제된 경우
		idTxt.setOnKeyReleased(e->{
			setEnable();
			checkFieldLength();
		});
		pwTxt.setOnKeyReleased(e->setEnable());
	}

	private void checkFieldLength() {
		String id = idTxt.getText();
		
		if(id.length() >= MAXLENGTH) {
			String subId = id.substring(0, MAXLENGTH);
			idTxt.setText(subId);
		}
	}

	private void setEnable() {
		if(idTxt.getText().isEmpty() || pwTxt.getText().isEmpty()) {
			okBtn.setDisable(true);
		}else {
			okBtn.setDisable(false);
		}
	}

	
}
