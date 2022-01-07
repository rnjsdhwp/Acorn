package com.jin.Notepad;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import com.jin.Common.Common;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Menu;
import javafx.scene.control.TextArea;

public class NotepadController implements Initializable{
	private Parent form;
	private IFileService iFileServ;
	private String filePath;
	
	@FXML private Menu recent;
	@FXML private TextArea txtArea;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		List<String> pathLst = iFileServ.Select();
		Common.StoreMenu(txtArea, recent, pathLst);
	}
	
	public NotepadController() {
		iFileServ = new FileServiceImpl();
	}

	public void OnSave() {
		if( filePath == null)
			filePath = iFileServ.SaveWindow();
		
		iFileServ.SaveFile(form, filePath);
		iFileServ.Insert(form, filePath);
		iFileServ.LoadRecent(form);
	}
	public void setForm(Parent form) {
		this.form = form;
	}

	
}
