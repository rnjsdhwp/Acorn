package com.jin.View.Ex110;

import javafx.scene.Parent;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ViewTestImpl implements IViewService {

	@Override
	public MultipleSelectionModel<String> getModelFromListView(Parent form) {
		ListView<String> lstView = (ListView<String>) form.lookup("#lstView");
		return lstView.getSelectionModel();
	}

	@Override
	public MultipleSelectionModel<Animal> getModelFromTableView(Parent form) {
		TableView<Animal> tblView = (TableView<Animal>) form.lookup("#tblView");
		return tblView.getSelectionModel();
	}

	@Override
	public void setImageView(Parent form, String animalName) {
		ImageView iv = (ImageView) form.lookup("#imgView");
		String imgPath = getClass().getResource("../Img/" + animalName + ".png").toString();
		iv.setImage(new Image(imgPath));

	}

	@Override
	public void setListView(Parent form, int idx) {
		TableView<Animal> tblView = (TableView<Animal>) form.lookup("#tblView");
//		tableview�� ��ġ ���� ����
		tblView.getSelectionModel().select(idx);

	}

	@Override
	public void setTableView(Parent form, int idx) {
		ListView<String> lstView = (ListView<String>) form.lookup("#lstView");
//		tableview�� ��ġ ���� ����
		lstView.getSelectionModel().select(idx);
	}
}
