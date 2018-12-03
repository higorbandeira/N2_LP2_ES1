package Model;

public class ProdutoVO {

	int ProdutoID ;
	String Descricao;
	double Preco;
	double ValorDeCompra;
	int Quantidade;

	public int getProdutoID() {
		// TODO Auto-generated method stub
		return ProdutoID;
	}
	public void setProdutoID(int valor) {
		// TODO Auto-generated method stub
		ProdutoID = valor;
	}
	public String getDescricao() {
		// TODO Auto-generated method stub
		return Descricao;
	}
	public void setDescricao(String valor) {
		Descricao = valor;
	}
	public double getPreco() {
		// TODO Auto-generated method stub
		return Preco;
	}
	public void setPreco(double valor) {
		Preco = valor;
	}

	public double getValorDeCompra() {
		// TODO Auto-generated method stub
		return ValorDeCompra;
	}
	public void setValorDeCompra(double valor) {
		ValorDeCompra = valor;
	}
	public int getQuantidade() {
		// TODO Auto-generated method stub
		return Quantidade;
	}
	public void setQuantidade(int valor) {
		Quantidade = valor;
	}

}