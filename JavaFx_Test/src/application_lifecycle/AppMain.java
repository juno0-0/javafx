package application_lifecycle;

import java.util.Map;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppMain extends Application{
	String ip;
	String port;
	
	public AppMain() {//JavaFX Application Thread�� ȣ��
		System.out.println(Thread.currentThread().getName()+":AppMain() ȣ��");
	}
	
	@Override
	public void init() throws Exception {//JavaFX launch()�� ����
		System.out.println(Thread.currentThread().getName()+":init() ȣ��");	
		//UI ����, �����ڵ带 �ۼ��ϸ� ���ܹ߻�(JavaFX Application Thread������ �ۼ�)
		//�ַ� ���� �Ű����� JavaFX Application Thread�� ������ �������� ���
		Parameters p = this.getParameters();
		Map<String, String> map = p.getNamed();
		ip = map.get("ip");
		port = map.get("port");
		System.out.println("ip: "+ip);
		System.out.println("port: "+port);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {//JavaFX Application Thread�� ȣ��
		primaryStage.show();
		System.out.println(Thread.currentThread().getName()+":start() ȣ��");
	}
	
	@Override
	public void stop() throws Exception {//JavaFX Application Thread�� ȣ��
		System.out.println(Thread.currentThread().getName()+":stop() ȣ��");
		//����Ǳ� ���� �������� �ڵ带 �ۼ��ϴ� �κ�
	}
	
	public static void main(String[] args) {
		launch(args);//main()���� ȣ��Ǹ� Main Thread�� launch()�� ����
					 //launch() ���ο��� 2���� Thread�� ����
					 //JavaFX Application Thread�� �⺻ �����ڸ� ȣ��
	}
	
}
