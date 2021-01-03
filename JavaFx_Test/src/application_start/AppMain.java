package application_start;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppMain extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);//Application의 static 메소드
					 //내부적으로 JavaFX Application Thread를 만들고 Thread가 start()를 호출
		
	}
	
}
