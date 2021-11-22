package com.jin.Login.Ex01.Quiz02;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainCtr implements Initializable{

	@FXML private Button btn;
	@FXML private TextField tf1;
	@FXML private TextField tf2;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		btn.setOnAction(e->{
			getInputText(e);
		});
	}
	private void getInputText(ActionEvent e) {
		String text = tf1.getText();
		tf2.setText(text);
	}
}
