package com.jin.View.Ex11;

import javafx.scene.Parent;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ViewTestImpl implements IViewService{
	@Override
	public void ChangeImageView(Parent form) {
		ListView<String> lstView = (ListView<String>) form.lookup("#lstView");
		String animalName = lstView.getSelectionModel().getSelectedItem();
		
//		listview의 위치 정보 얻기
		int idx = lstView.getSelectionModel().getSelectedIndex();
		TableView<Animal> tblView = 
				(TableView<Animal>) form.lookup("#tblView");
//		tableview의 위치 정보 변경
		tblView.getSelectionModel().select(idx);
		
		ShowImageView(form, animalName);
	}
	private void ShowImageView(Parent form, String animalName) {
		ImageView iv = (ImageView) form.lookup("#imgView");
		String imgPath = getClass().
				getResource("../Img/"+animalName+".png").toString();
		iv.setImage(new Image(imgPath));
	}
	@Override
	public void ViewTest(Parent form) {
		ShowImageView(form, "사자");
	}
	@Override
	public void ChangeTableView(Parent form) {
		TableView<Animal> tblView = 
				(TableView<Animal>) form.lookup("#tblView");
		Animal animal = tblView.getSelectionModel().getSelectedItem();
		
		
//		listview의 위치 정보 얻기
		int idx = tblView.getSelectionModel().getSelectedIndex();
		ListView<String> lstView = (ListView<String>) form.lookup("#lstView");
//		tableview의 위치 정보 변경
		lstView.getSelectionModel().select(idx);
		
		ShowImageView(form, animal.getAnimalName());		
	}

	
}
