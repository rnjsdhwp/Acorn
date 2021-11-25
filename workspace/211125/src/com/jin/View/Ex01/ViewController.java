package com.jin.View.Ex01;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;

public class ViewController implements Initializable {
	private Parent form;
	private IViewService iViewServ;
	@FXML private ListView<String> lstView;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ObservableList<String> items = FXCollections.observableArrayList(
				"»çÀÚ", "¾ó·è¸»", "¿ø¼þÀÌ", "ÄÚ³¢¸®", "ÆÒ´õ", "Æë±Ï", "Ç¥¹ü", "È£¶ûÀÌ"
				);
		lstView.setItems(items);
	}
	
	public ViewController() {
		iViewServ = new ViewTestImpl();
	}
	public void setForm(Parent form) {
		this.form = form;
	}
	
	public void OnTest() {
		iViewServ.ViewTest(form);
	}
}
