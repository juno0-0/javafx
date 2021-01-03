package application;
 
import java.io.IOException;
 
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
 
public class MainController {
	int cnt = 0;
	
    @FXML
    private Label lblStatus;
    
    @FXML
    private TextField txtUserName;
    
    @FXML
    private TextField txtPassword;
    
    public void Login(ActionEvent event) throws Exception{
        if(txtUserName.getText().equals("user") && txtPassword.getText().equals("1234")){
            lblStatus.setText("Login Success");
            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
            Scene scene = new Scene(root);
//            //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.show();
        }else{
        	cnt++;
        	if(cnt==1) lblStatus.setText("Login Failed[1/3]");
        	else if(cnt==2) lblStatus.setText("Login Failed[2/3]");
        	else {
        		System.exit(0);
        	}
        }
    }
    
}