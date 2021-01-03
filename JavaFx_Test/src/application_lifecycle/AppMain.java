package application_lifecycle;

import java.util.Map;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppMain extends Application{
	String ip;
	String port;
	
	public AppMain() {//JavaFX Application Thread가 호출
		System.out.println(Thread.currentThread().getName()+":AppMain() 호출");
	}
	
	@Override
	public void init() throws Exception {//JavaFX launch()가 실행
		System.out.println(Thread.currentThread().getName()+":init() 호출");	
		//UI 생성, 변경코드를 작성하면 예외발생(JavaFX Application Thread에서만 작성)
		//주로 실행 매개값을 JavaFX Application Thread에 전달할 목적으로 사용
		Parameters p = this.getParameters();
		Map<String, String> map = p.getNamed();
		ip = map.get("ip");
		port = map.get("port");
		System.out.println("ip: "+ip);
		System.out.println("port: "+port);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {//JavaFX Application Thread가 호출
		primaryStage.show();
		System.out.println(Thread.currentThread().getName()+":start() 호출");
	}
	
	@Override
	public void stop() throws Exception {//JavaFX Application Thread가 호출
		System.out.println(Thread.currentThread().getName()+":stop() 호출");
		//종료되기 전에 마무리할 코드를 작성하는 부분
	}
	
	public static void main(String[] args) {
		launch(args);//main()에서 호출되면 Main Thread가 launch()를 실행
					 //launch() 내부에선 2개의 Thread가 생성
					 //JavaFX Application Thread가 기본 생성자를 호출
	}
	
}
