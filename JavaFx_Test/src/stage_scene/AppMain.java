package stage_scene;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;//java.awt�� ���þ��ϰ� ����
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AppMain extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox root = new VBox();//�������� ��Ʈ���� ��ġ�ϴ� �����̳�
		root.setPrefWidth(350);//���� ����
		root.setPrefHeight(150);//���� ����
		root.setAlignment(Pos.CENTER);//���ͷ� ��ġ ����(����)
		root.setSpacing(20);//�󺧰� ��ư�� ���� ����
		
		Label label = new Label();
		label.setText("Hello, JavaFX");
		label.setFont(new Font(50));//���� ũ�Ⱑ 50
		
		Button button = new Button();
		button.setText("Ȯ��");
		button.setOnAction(event->Platform.exit());//��ư���� �׼� �̺�Ʈ�� �߻��ϸ� ����
		//Platform.exit() : JavaFX���� �����ϴ� �����ڵ�
		
		root.getChildren().add(label);
		root.getChildren().add(button);
		
		Scene scene = new Scene(root);
		primaryStage.setTitle("AppMain");//������â ����
		primaryStage.setScene(scene);//Stage�� Scene ��ġ
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);	
	}
	
}
