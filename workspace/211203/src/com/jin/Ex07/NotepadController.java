package com.jin.Ex07;

import java.io.File;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class NotepadController {
	private Parent form;
	private IFile iFileServ;
	public NotepadController() {
		iFileServ = new FileImpl();
	}
	public void OnSave() {
		String filePath = iFileServ.SaveWindow();
		iFileServ.CreateFile(form, filePath);
	}
//	ActionEvent 버튼이 클릭되었을 경우 신호를 받게 됨.
	public void OnCancel(ActionEvent e) {
//		발생된 이벤트에서 getSource 메소드를 호출하면 객체 정보를 얻을 수 있음.
		Button btn = (Button) e.getSource();
		Scene scene = btn.getScene();
		Parent root = scene.getRoot();
		
		Button btnExit = (Button) root.lookup("#btnExit");
		btnExit.setText("Exit");

	}
	public void OnExit() {Platform.exit();	}
	public void setForm(Parent root) {
		form = root;		
	}
	public void OnOpen() {
		File file = null;
		try {
			file =iFileServ.OpenWindow();
			file.getAbsoluteFile();
		}catch (NullPointerException e) {
			System.out.println("catch");
			return;
		}
		System.out.println("null");
		
//		while(true) {
//			file = iFileServ.OpenWindow();
//			if(file!=null)	break;
//		}
	}
}
