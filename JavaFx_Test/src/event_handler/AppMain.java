package event_handler;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMain extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox root = new HBox();
		root.setPrefSize(200, 50);//사이즈 주기
		root.setAlignment(Pos.CENTER);//위치 조절
		root.setSpacing(20);//컨트롤간의 간격
		
		Button btn1 = new Button("버튼1");//생성자의 매개값으로 바로 Title 주기
		//btn1.setText("버튼1");
		btn1.setOnAction(event->System.out.println("뀨잉"));//이벤트핸들러의 handle()이 호출되서 이벤트 처리 방법1
		
		
		Button btn2 = new Button("버튼2");
		btn2.setOnAction(new EventHandler<ActionEvent>() {//이벤트핸들러의 handle()이 호출되서 이벤트 처리 방법2
			@Override
			public void handle(ActionEvent event) {//handle() 호출
				System.out.println("쀼잉");
			}
		});
		
		root.getChildren().addAll(btn1, btn2);//한번에 컨트롤 추가하기
		//root.getChildren().add(btn1);
		//root.getChildren().add(btn2);
		Scene scene = new Scene(root);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("AppMain");
		primaryStage.setOnCloseRequest(event->System.out.println("빠잉"));//x버튼 이벤트처리
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
