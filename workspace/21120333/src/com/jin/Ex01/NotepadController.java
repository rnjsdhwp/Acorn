package com.jin.Ex01;

import javafx.application.Platform;
import javafx.scene.Parent;

public class NotepadController {
	private Parent form;
	private IFile iFileServ;
	public NotepadController() {
		iFileServ = new FileImpl();
	}
	public void OnSave() {
		iFileServ.Save();
	}
	public void OnCancel() {	}
	public void OnExit() {Platform.exit();	}
	public void setForm(Parent root) {
		form = root;		
	}
}
