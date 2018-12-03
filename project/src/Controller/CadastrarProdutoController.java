package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CadastrarProdutoController implements Initializable {

	@FXML
    private TextField txtNomeProduto;

    @FXML
    private Button btnCadastrar;

    @FXML
    private Button btnCancelar;

    @FXML
    private TextField txtDescricao;

    @FXML
    private TextField txtValorVenda;

    @FXML
    private TextField txtValorCompra;

    public void initialize(URL url, ResourceBundle rb){

    }
}
