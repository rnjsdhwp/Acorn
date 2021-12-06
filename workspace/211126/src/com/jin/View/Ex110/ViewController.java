package com.jin.View.Ex110;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.control.TableView;
// 주석 단축키 : ctrl + /, ctrl+shift + /
public class ViewController{
	private Parent form;
	private IViewService iViewServ;
	
	public void OnChangeListView() {
		MultipleSelectionModel<String> model = iViewServ.getModelFromListView(form);
		iViewServ.setImageView(form, model.getSelectedItem());
		iViewServ.setTableView(form, model.getSelectedIndex());
	}
	public void OnChangeTableView() {
//		iViewServ.ChangeTableView(form);
	}
	public ViewController() {
		iViewServ = new ViewTestImpl();
	}
	public void setForm(Parent form) {
		this.form = form;
	}	
}
