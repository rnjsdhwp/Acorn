package test;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller implements Initializable{
//	Scene builder�� ���� ���� fx:id�� ���� �̸��̾�� �Ѵ�.
	@FXML private Button btn;
	@FXML private TextField tf;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		btn.setOnAction(e->{
			System.out.println(tf.getText());
		});
	}

}
