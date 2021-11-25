package com.jin.Directory.Ex05;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.FileChooser.ExtensionFilter;
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
//		�˾� ����
		Popup pu = new Popup();
//		fxml ����
		URL fxmlFile = getClass().getResource("Popup.fxml");
		Node obj = null;
		
		try {
			obj = FXMLLoader.load(fxmlFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		pu.getContent().add(obj);
//		�˾� �����ֱ�
		pu.show(s);
		return;
	}

}
