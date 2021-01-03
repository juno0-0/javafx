package borderpane;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent parent = FXMLLoader.load(getClass().getResource("root.fxml"));//���� �ִ� ������ ������ �о 
		Scene scene = new Scene(parent);									 //�� �ȿ� �ִ� ��ġ ������ ������.
		
		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);
		primaryStage.setWidth(200);
		primaryStage.setHeight(300);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
