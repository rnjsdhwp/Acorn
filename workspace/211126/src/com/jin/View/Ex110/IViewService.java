package com.jin.View.Ex110;

import javafx.scene.Parent;
import javafx.scene.control.MultipleSelectionModel;

public interface IViewService {
//	����Ʈ�信�� �� �ϴ� ����� ����
	public MultipleSelectionModel<String> getModelFromListView(Parent form);
	public MultipleSelectionModel<Animal> getModelFromTableView(Parent form);
	public void setImageView(Parent form, String animalName);
	public void setListView(Parent form, int idx);
	public void setTableView(Parent form, int idx);
}
