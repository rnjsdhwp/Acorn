package com.jin.View.Ex10;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TableView;
// 주석 단축키 : ctrl + /, ctrl+shift + /
public class ViewController{
	private Parent form;
	private IViewService iViewServ;
	
	public void OnChangeListView() {
		iViewServ.ChangeImageView(form);
	}
	public void OnChangeTableView() {
		iViewServ.ChangeTableView(form);
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
