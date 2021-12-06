package com.jin.View.Ex03;

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
import javafx.scene.image.ImageView;

public class ViewController implements Initializable {
	private Parent form;
	private IViewService iViewServ;
	@FXML private ListView<String> lstView;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		lstView.getSelectionModel().selectedIndexProperty().addListener(
				new ChangeListener<Number>() {
					@Override
					public void changed(
							ObservableValue<? extends Number> obs, 
							Number oldNum, Number newNum) {
						System.out.println(oldNum + " : " + newNum);						
						System.out.println(newNum.intValue());
					}
				}
				);		
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
