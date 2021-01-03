package programmatical_layout;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMain extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(10,10,10,10));//안쪽 여백 설정
		hbox.setSpacing(10);//컨트롤간의 수평 간격 설정
		
		TextField textField = new TextField();//TextField 컨트롤 생성
		textField.setPrefWidth(200);//가로 길이
		
		Button button = new Button();//Button 컨트롤 생성
		button.setText("확인");
		button.setOnAction(event -> Platform.exit());
		
		ObservableList list = hbox.getChildren();
		list.add(textField);//컨트롤 배치
		list.add(button);//컨트롤 배치
		
		
		Scene scene = new Scene(hbox);//화면의 루트 컨테이너로 HBox 제공
		
		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
