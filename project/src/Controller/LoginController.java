package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import project.Login;
import project.Principal;

public class LoginController implements Initializable {


	    @FXML
	    private TextField txtLogin;

	    @FXML
	    private PasswordField txtSenha;

	    @FXML
	    private Button btnSair;

	    @FXML
	    private Button btnEntrar;

	    @Override
	    public void initialize(URL url, ResourceBundle rb){
	    	//TODO
	    	btnEntrar.setOnMouseClicked((MouseEvent e) ->{
	    		logar();
	    	});

	    	btnEntrar.setOnKeyPressed((KeyEvent e) ->{
	    		if(e.getCode() == KeyCode.ENTER){
	    			logar();
	    		}

	    	});

	    	btnSair.setOnMouseClicked((MouseEvent e) ->{
	    		fecha();
	    	});

	    	btnSair.setOnKeyPressed((KeyEvent e)->{
	    		if(e.getCode() == KeyCode.ENTER){
	    			fecha();
	    		}
	    	});
	    }

	    public void fecha(){
	    	Login.getStage().close();
	    }

	    public void logar(){
	    	if(txtLogin.getText().equals("root") && txtSenha.getText().equals("123")){
    			Principal p = new Principal();
    			fecha();
    			try {
					p.start(new Stage());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
    		}else{
    			Alert alert = new Alert(AlertType.ERROR);
    			alert.setHeaderText("Erro");
    			alert.setTitle("Erro");
    			alert.setContentText("Usuario e ou senha incorreto !!");
    			alert.show();
    		}
	    }

	@FXML protected void AbrirTelaMenu(ActionEvent event) {

		try {

		Pane root = FXMLLoader.load(getClass().getResource("Main_screen.fxml"));
		Stage stage = new Stage();
		Scene scene = new Scene(root, 600, 400);
		stage.setScene(scene);
		stage.show();

		} catch (IOException e) {
		e.printStackTrace();
		}
	}
}