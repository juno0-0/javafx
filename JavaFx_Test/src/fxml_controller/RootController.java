package fxml_controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class RootController implements Initializable{
	@FXML private Button btn1;
	@FXML private Button btn2;
	//@FXML private Button btn3;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {//AppMain���� root.fxml�� �ε��� �� ��ü�� �����ǰ� 
																	//���� btn1,2,3�� root.fxml�� btn���� �����ϰ� ȣ��
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("��");
			}
		});
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				handleBtn2Action(event);
			}
		});
		//btn3.setOnAction(event->System.out.println("��"));
		
		
	}
	public void handleBtn2Action(ActionEvent event) {
		System.out.println("��");
	}
	public void handleBtn3Action(ActionEvent event) {
		System.out.println("��");
	}
	
}
