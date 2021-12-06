package com.jin.View.Ex07;

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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
// ÁÖ¼® ´ÜÃàÅ° : ctrl + /, ctrl+shift + /
public class ViewController implements Initializable {
	private Parent form;
	private IViewService iViewServ;
	@FXML private TableView<Animal> tblView;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		String[] animals = {"»çÀÚ", "¾ó·è¸»", "¿ø¼þÀÌ","ÄÚ³¢¸®", 
				"ÆÒ´õ", "Æë±Ï", "Ç¥¹ü", "È£¶ûÀÌ"};
		ObservableList<Animal> tblViewItems = 
				FXCollections.observableArrayList();
		
		for(String animal : animals) {
			Animal ani = new Animal(animal, animal+".png");
			tblViewItems.add(ani);
		}
		
		setTableColumn(0, "animalName");
		setTableColumn(1, "pictureName");
		
		tblView.setItems(tblViewItems);
	}
	private void setTableColumn(int idx, String name) {
		TableColumn<Animal, String> tblCol = 
				(TableColumn<Animal, String>) tblView.getColumns().get(idx);
		
		tblCol.setCellValueFactory(
				new PropertyValueFactory<Animal, String>(name)
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
