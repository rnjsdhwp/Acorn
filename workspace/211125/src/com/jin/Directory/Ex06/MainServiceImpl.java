package com.jin.Directory.Ex06;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Modality;
import javafx.stage.Popup;

public class MainServiceImpl implements IMainService{

	@Override
	public String getFilePath(Stage s) {
		FileChooser fileChooser = new FileChooser();
		
		fileChooser.getExtensionFilters().addAll(
				new ExtensionFilter("Text Files", "*.txt"),
				new ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif"),
				new ExtensionFilter("Audio Files", "*.wav", "*.mp3"),
				new ExtensionFilter("All Files", "*.*"));
		
		File selectedFile =  fileChooser.showOpenDialog(s);
		return selectedFile.getPath();
	}

	@Override
	public String getDirPath() {
		DirectoryChooser dirChooser = new DirectoryChooser();
		File selectedFile = dirChooser.showDialog(null);
		return selectedFile.getPath();
	}

	@Override
	public void PopWindow(Stage s) {
//		팝업 생성
		Popup pu = new Popup();
//		fxml 연결
		URL fxmlFile = getClass().getResource("Popup.fxml");
		Node obj = null;
		
		try {
			obj = FXMLLoader.load(fxmlFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		pu.getContent().add(obj);
//		팝업 보여주기
		pu.show(s);
		return;
	}

	@Override
	public void customWindow(Stage s) {
		Stage customWnd = new Stage(StageStyle.DECORATED);
		customWnd.initModality(Modality.APPLICATION_MODAL);
		customWnd.initOwner(s);
		customWnd.setTitle("확인");
		
		Pane canvas = null;
		try {
			canvas = (Pane)FXMLLoader.load(getClass().getResource("popup.fxml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		customWnd.setScene(new Scene(canvas));
		customWnd.setResizable(false);
		customWnd.show();
	}

}
