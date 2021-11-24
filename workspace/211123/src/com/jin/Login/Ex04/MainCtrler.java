package com.jin.Login.Ex04;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainCtrler implements Initializable{

	@FXML private Button btn1;
	@FXML private Button btn2;
	@FXML private Label lb1;
	private int btnName;
	private boolean isDisable;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		btnName = 1;
		isDisable = false;
		btn1.setOnAction(e->ButtonDisalbe());
		btn2.setOnAction(e->ButtonDisalbe());
	}
	private void ButtonDisalbe() {
		lb1.setText("Button" + (btnName+1) +  " Disable");
		btn1.setDisable(isDisable);
		btn2.setDisable(!isDisable);
		
		isDisable = !isDisable;
		
		btnName = (btnName+1) % 2;
	}
//	private void Button1Disalbe() {
//	lb1.setText("Button1 Disable");
//	btn1.setDisable(true);
//	btn2.setDisable(false);
//}
//private void Button2Disalbe() {
//	lb1.setText("Button2 Disable");
//	btn1.setDisable(false);
//	btn2.setDisable(true);
//}
}
