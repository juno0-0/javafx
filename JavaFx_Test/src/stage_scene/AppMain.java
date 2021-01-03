package stage_scene;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;//java.awt로 선택안하게 주의
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AppMain extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox root = new VBox();//수직으로 컨트롤을 배치하는 컨테이너
		root.setPrefWidth(350);//가로 길이
		root.setPrefHeight(150);//세로 길이
		root.setAlignment(Pos.CENTER);//센터로 위치 조정(정렬)
		root.setSpacing(20);//라벨과 버튼의 수직 간격
		
		Label label = new Label();
		label.setText("Hello, JavaFX");
		label.setFont(new Font(50));//글자 크기가 50
		
		Button button = new Button();
		button.setText("확인");
		button.setOnAction(event->Platform.exit());//버튼에서 액션 이벤트가 발생하면 실행
		//Platform.exit() : JavaFX에서 제공하는 종료코드
		
		root.getChildren().add(label);
		root.getChildren().add(button);
		
		Scene scene = new Scene(root);
		primaryStage.setTitle("AppMain");//윈도우창 제목
		primaryStage.setScene(scene);//Stage에 Scene 배치
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);	
	}
	
}
