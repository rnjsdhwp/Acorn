package com.jin.Login.Ex05;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainCtrler implements Initializable{

	@FXML private TextField idTxt;
	@FXML private TextField pwTxt;
	@FXML private TextField emailTxt;
	@FXML private Button okBtn;
//	엔터를 칠 경우 이동됨
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		idTxt.setOnAction(e->pwTxt.requestFocus());
		pwTxt.setOnAction(e->emailTxt.requestFocus());
		emailTxt.setOnAction(e->okBtn.requestFocus());
		
		okBtn.setOnKeyPressed(e->System.out.println("회원가입"));
	}
}
