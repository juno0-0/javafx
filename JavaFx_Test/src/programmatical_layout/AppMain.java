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
		hbox.setPadding(new Insets(10,10,10,10));//���� ���� ����
		hbox.setSpacing(10);//��Ʈ�Ѱ��� ���� ���� ����
		
		TextField textField = new TextField();//TextField ��Ʈ�� ����
		textField.setPrefWidth(200);//���� ����
		
		Button button = new Button();//Button ��Ʈ�� ����
		button.setText("Ȯ��");
		button.setOnAction(event -> Platform.exit());
		
		ObservableList list = hbox.getChildren();
		list.add(textField);//��Ʈ�� ��ġ
		list.add(button);//��Ʈ�� ��ġ
		
		
		Scene scene = new Scene(hbox);//ȭ���� ��Ʈ �����̳ʷ� HBox ����
		
		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
