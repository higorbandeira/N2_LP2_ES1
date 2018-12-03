package project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CadastrarVenda extends Application{
	private static Stage stage;

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("/View/CadastrarVenda.fxml"));
		Scene scene = new Scene(root);
		stage.setTitle("CadastrarVenda");
		stage.setScene(scene);
		stage.show();
		setStage(stage);
	}

	public static Stage getStage(){
		return stage;
	}

	public static void setStage(Stage stage){
		CadastrarVenda.stage = stage;
	}


}
