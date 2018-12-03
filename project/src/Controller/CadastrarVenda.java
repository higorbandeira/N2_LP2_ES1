package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.text.Text;

public class CadastrarVenda implements Initializable {

	@FXML
    private Button btnCancelar;

    @FXML
    private Text txtValor;

    @FXML
    private ListView<?> listProdutos;

    @FXML
    private Button btnFinalizarCompra;

    public void initialize(URL url, ResourceBundle rb){

    }
}
