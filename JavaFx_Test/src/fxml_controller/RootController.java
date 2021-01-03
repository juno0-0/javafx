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
	public void initialize(URL location, ResourceBundle resources) {//AppMain에서 root.fxml을 로딩할 때 객체가 생성되고 
																	//위에 btn1,2,3이 root.fxml의 btn들을 참조하고 호출
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("조");
			}
		});
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				handleBtn2Action(event);
			}
		});
		//btn3.setOnAction(event->System.out.println("희"));
		
		
	}
	public void handleBtn2Action(ActionEvent event) {
		System.out.println("성");
	}
	public void handleBtn3Action(ActionEvent event) {
		System.out.println("희");
	}
	
}
