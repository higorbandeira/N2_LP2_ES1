package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class CadastrarFuncionarioController implements Initializable {

	@FXML
    private PasswordField txtSenha;

    @FXML
    private Button btnCadastrar;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtTelefone;

    @FXML
    private Button btnCancelar;

    @FXML
    private TextField txtCPF;

    public void initialize(URL url, ResourceBundle rb){

    }
}
