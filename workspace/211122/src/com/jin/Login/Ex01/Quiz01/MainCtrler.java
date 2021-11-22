package com.jin.Login.Ex01.Quiz01;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainCtrler implements Initializable{
	@FXML private Button btn;
	@FXML private TextField txtField;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		btn.setOnAction(e->{
			getTxtField(e);
		});
	}
	private /*Object*/ void getTxtField(ActionEvent e) {
		System.out.println(txtField.getText());
		//return null;
	}
	
}
