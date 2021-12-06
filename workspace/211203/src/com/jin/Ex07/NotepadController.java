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
//	ActionEvent ��ư�� Ŭ���Ǿ��� ��� ��ȣ�� �ް� ��.
	public void OnCancel(ActionEvent e) {
//		�߻��� �̺�Ʈ���� getSource �޼ҵ带 ȣ���ϸ� ��ü ������ ���� �� ����.
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
