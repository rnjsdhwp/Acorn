package com.jin.Ex05;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.control.Button;

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
//		System.out.println(btn.getLayoutX());
		btn.setText("clicked button");
	}
	public void OnExit() {Platform.exit();	}
	public void setForm(Parent root) {
		form = root;		
	}
}
