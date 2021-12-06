package com.jin.View.Ex09;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TableView;
// 주석 단축키 : ctrl + /, ctrl+shift + /
public class ViewController implements Initializable{
	private Parent form;
	private IViewService iViewServ;
	@FXML private TableView<Animal> tblView;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		tblView.getSelectionModel().selectedItemProperty().addListener(
				new ChangeListener<Animal>() {

					@Override
					public void changed(
							ObservableValue<? extends Animal> obs, 
							Animal oldani, Animal newani) {
						System.out.println(newani.getAnimalName());						
					}
				}
				);		
	}
	
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
