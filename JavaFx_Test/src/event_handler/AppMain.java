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
		root.setPrefSize(200, 50);//������ �ֱ�
		root.setAlignment(Pos.CENTER);//��ġ ����
		root.setSpacing(20);//��Ʈ�Ѱ��� ����
		
		Button btn1 = new Button("��ư1");//�������� �Ű������� �ٷ� Title �ֱ�
		//btn1.setText("��ư1");
		btn1.setOnAction(event->System.out.println("����"));//�̺�Ʈ�ڵ鷯�� handle()�� ȣ��Ǽ� �̺�Ʈ ó�� ���1
		
		
		Button btn2 = new Button("��ư2");
		btn2.setOnAction(new EventHandler<ActionEvent>() {//�̺�Ʈ�ڵ鷯�� handle()�� ȣ��Ǽ� �̺�Ʈ ó�� ���2
			@Override
			public void handle(ActionEvent event) {//handle() ȣ��
				System.out.println("����");
			}
		});
		
		root.getChildren().addAll(btn1, btn2);//�ѹ��� ��Ʈ�� �߰��ϱ�
		//root.getChildren().add(btn1);
		//root.getChildren().add(btn2);
		Scene scene = new Scene(root);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("AppMain");
		primaryStage.setOnCloseRequest(event->System.out.println("����"));//x��ư �̺�Ʈó��
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
