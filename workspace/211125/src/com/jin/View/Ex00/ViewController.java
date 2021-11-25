package com.jin.View.Ex00;

import javafx.scene.Parent;
import javafx.stage.Stage;

public class ViewController {
	private Parent form;
	private IViewService iViewServ;
	
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
