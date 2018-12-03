package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Model.ProdutoVO;


public class ProdutoDao {



	DAOConection obj_DB_Connection=new DAOConection();
	private  Connection connection = obj_DB_Connection.get_connection();

	public void InsereProduto(ProdutoVO produto){

		try {

		PreparedStatement ps=connection.prepareStatement("insert into Produtos(ProdutoID,Descricao,Preco,ValorDeCompra,Quantidade) values (?,?,?,?,?)");
			ps.setInt(1, produto.getProdutoID());
			ps.setString(2, produto.getDescricao());
			ps.setDouble(3, produto.getPreco());
			ps.setDouble(4, produto.getValorDeCompra());
			ps.setInt(5, produto.getQuantidade());
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void UpdateProduto(ProdutoVO produto){

		try {

		PreparedStatement ps=connection.prepareStatement("update Produtos set Descricao = ?,Preco = ?,ValorDeCompra = ?,Quantidade = ? where ProdutoID = ?");
			ps.setString(1, produto.getDescricao());
			ps.setDouble(2, produto.getPreco());
			ps.setDouble(3, produto.getValorDeCompra());
			ps.setInt(4, produto.getQuantidade());
			ps.setInt(5, produto.getProdutoID());
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
    public void DeleteProduto(ProdutoVO produto){

		   try {

		   PreparedStatement ps=connection.prepareStatement("delete from Produto where ProdutoID = ?");

			   ps.setInt(1, produto.getProdutoID());
			   ps.executeUpdate();
		    } catch (Exception e) {
		    	System.out.println(e);
	    	}
	}
    public List<ProdutoVO> SelectProduto() {
    	String sql= "select ProdutoID, Descricao, Preco, ValorDeCompra, Quantidade from Produtos ";
    	List<ProdutoVO> produtos = new ArrayList<ProdutoVO>();
    	try {
			Statement st=connection.createStatement();
			ResultSet rs = st.executeQuery(sql);

			if (rs!=null) {
				while(rs.next()) {
					ProdutoVO prod = new ProdutoVO();
					prod.setProdutoID(rs.getInt("ProdutoID")) ;
					prod.setDescricao(rs.getString("Descricao"));
					prod.setPreco(rs.getDouble("Preco"));
					prod.setValorDeCompra(rs.getDouble("ValorDeCompra"));
					prod.setQuantidade(rs.getInt("Quantidade"));
					produtos.add(prod);
				}
			}


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  produtos;
    }
}
