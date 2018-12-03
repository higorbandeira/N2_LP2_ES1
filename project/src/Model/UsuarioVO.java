package Model;

public class UsuarioVO {

	private String CPF;
	private String Nome;
	private int Senha;
	private String Telefone;

	public String getCPF() {
		return CPF;
	}
	public void setCPF(String valor) {
		CPF = valor;
	}

	public String getNome() {
		return Nome;
	}
	public void setNome(String valor) {
		Nome = valor;
	}

	public int getSenha() {
		return Senha;
	}
	public void setSenha(int valor) {
		Senha = valor;
	}

	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String valor) {
		Telefone = valor;
	}
}
