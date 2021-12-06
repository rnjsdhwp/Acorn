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
//	ActionEvent ��ư�� Ŭ���Ǿ��� ��� ��ȣ�� �ް� ��.
	public void OnCancel(ActionEvent e) {
//		�߻��� �̺�Ʈ���� getSource �޼ҵ带 ȣ���ϸ� ��ü ������ ���� �� ����.
		Button btn = (Button) e.getSource();
//		System.out.println(btn.getLayoutX());
		btn.setText("clicked button");
	}
	public void OnExit() {Platform.exit();	}
	public void setForm(Parent root) {
		form = root;		
	}
}
