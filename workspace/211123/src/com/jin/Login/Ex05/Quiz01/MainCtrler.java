package com.jin.Login.Ex05.Quiz01;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainCtrler implements Initializable{

	@FXML private Button okBtn;
	@FXML private TextField idTxt;
	@FXML private TextField pwTxt;
	private int MAXLENGTH = 9;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		idTxt.setOnAction(e->pwTxt.requestFocus());
		pwTxt.setOnAction(e->okBtn.requestFocus());
		okBtn.setOnAction(e->System.out.println("·Î±×ÀÎ"));
		
		idTxt.textProperty().addListener(
				(obs, oldTxt, newTxt)->{
					checkTextField();
				});
		pwTxt.textProperty().addListener(
				(obs, oldTxt, newTxt)->{
					checkTextField();
				});
	}

	private void checkTextField() {
		String id = idTxt.getText();
		boolean idIsEmpty = idTxt.getText().isEmpty();
		boolean pwIsEmpty = pwTxt.getText().isEmpty();
		
		if(id.length() >= MAXLENGTH) {
			String subId = id.substring(0, MAXLENGTH);
			idTxt.setText(subId);
		}
		
		if(idIsEmpty || pwIsEmpty) {
			okBtn.setDisable(true);
		}else {
			okBtn.setDisable(false);
		}
		
		return;
	}
}
