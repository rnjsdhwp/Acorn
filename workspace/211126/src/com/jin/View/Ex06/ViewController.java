package com.jin.View.Ex06;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
// 주석 단축키 : ctrl + /, ctrl+shift + /
public class ViewController/* implements Initializable */{
	private Parent form;
	private IViewService iViewServ;
//	@FXML private ListView<String> lstView;
//	@FXML private ImageView imgView;
//	@Override
//	public void initialize(URL arg0, ResourceBundle arg1) {
//		lstView.getSelectionModel().selectedItemProperty().addListener(
//				new ChangeListener<String>() {
//					@Override
//					public void changed(
//							ObservableValue<? extends String> obs, 
//							String oldName, String newName) {
//						String imgPath = 
//								getClass().
//								getResource("../Img/"+newName+".png").
//								toString();
//						imgView.setImage(new Image(imgPath));					}
//				}
//				);		
//	}
	public void OnChangeListView() {
		iViewServ.ChangeImageView(form);
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
