package com.jin.Ex03;

import javafx.application.Platform;
import javafx.scene.Parent;

public class NotepadController {
	private Parent form;
	private IFile iFileServ;
	public NotepadController() {
		iFileServ = new FileImpl();
	}
	public void OnSave() {
//		iFileServ.Save(form);
		String filePath = iFileServ.SaveWindow();
		iFileServ.CreateFile(form);
	}
	public void OnCancel() {	}
	public void OnExit() {Platform.exit();	}
	public void setForm(Parent root) {
		form = root;		
	}
}
