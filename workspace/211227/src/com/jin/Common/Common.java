package com.jin.Common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.Alert.AlertType;

public class Common {
	public static void Notice(String content) {
		Alert alert = new Alert(AlertType.NONE);
		alert.setAlertType(AlertType.WARNING);
		alert.setContentText(content);
		
		alert.show();
	}
	public static void StoreMenu(TextArea txtArea, Menu recent, List<String> pathLst) {
//		MenuBar menuBar = (MenuBar) form.lookup("#menuBar");
//		Menu recent = menuBar.getMenus().get(1);
		
		recent.getItems().clear();
		
		for(String path : pathLst) {
			MenuItem item = new MenuItem(path);
			item.setOnAction(e->{
				ItemAction(txtArea, path);
			});
			recent.getItems().add(item);
			
		}
	}
	public static void ItemAction(TextArea txtArea, String path) {
		File file = new File(path);
		
		if(file.exists()) {
			String contents = getText(file);
//			setTextArea(form, contents);
			txtArea.setText(contents);
		}else {
			Common.Notice("파일이 존재하지 않아요");
		}
	}
	public static void StoreMenu(Parent form, List<String> pathLst) {
		MenuBar menuBar = (MenuBar) form.lookup("#menuBar");
		Menu recent = menuBar.getMenus().get(1);
		
		recent.getItems().clear();
		
		for(String path : pathLst) {
			MenuItem item = new MenuItem(path);
			item.setOnAction(e->{
				ItemAction(form, path);
			});
			recent.getItems().add(item);
			
		}
	}
	
	public static void ItemAction(Parent form, String path) {
		File file = new File(path);
		
		if(file.exists()) {
			String contents = getText(file);
			setTextArea(form, contents);
		}else {
			Common.Notice("파일이 존재하지 않아요");
		}
	}
	
	public static void setTextArea(Parent form, String contents) {
		TextArea txtArea = (TextArea) form.lookup("#txtArea");
		txtArea.setText(contents);		
	}
	public static String getText(File file) {
		String txt="";
		
		try {
			FileInputStream fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			
			String line;
			while( (line=br.readLine())!=null)
				txt += line + "\n";
		} catch (IOException e) {
			e.printStackTrace();
		}
		return txt;
	}
}
