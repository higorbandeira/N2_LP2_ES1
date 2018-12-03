package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Model.ItemDeVendaVO;

public class ItemDeVendaDAO {


	DAOConection obj_DB_Connection= new DAOConection();
	private  Connection connection = obj_DB_Connection.get_connection();

	public void InsereItemDeVenda(ItemDeVendaVO ItemDeVenda){

		try {

		PreparedStatement ps=connection.prepareStatement("insert into ItemDeVendas(VendaID,ProdutoID,Valor) values (?,?,?)");
			ps.setInt(1, ItemDeVenda.getVendaID());
			ps.setInt(2, ItemDeVenda.getProdutoID());
			ps.setInt(3, ItemDeVenda.getQuantidade());


			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void UpdateItemDeVenda(ItemDeVendaVO ItemDeVenda){

		try {

		PreparedStatement ps=connection.prepareStatement("update ItemDeVendas set Quantidade = ? where VendaID = ? and  ProdutoID = ?");

		ps.setInt(2, ItemDeVenda.getVendaID());
		ps.setInt(3, ItemDeVenda.getProdutoID());
		ps.setInt(1, ItemDeVenda.getQuantidade());
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
  public void DeleteItemDeVenda(ItemDeVendaVO ItemDeVenda){

		   try {

		   PreparedStatement ps=connection.prepareStatement("delete from ItemDeVendas where VendaID = ? and  ProdutoID = ?");

			   ps.setInt(1, ItemDeVenda.getVendaID());
			   ps.setInt(2, ItemDeVenda.getProdutoID());
			   ps.executeUpdate();
		    } catch (Exception e) {
		    	System.out.println(e);
	    	}
	}
  public List<ItemDeVendaVO> SelectItensDeVenda() {
  	String sql= "select VendaID, ProdutoID, Quantidade from ItemDeVendas ";
  	List<ItemDeVendaVO> ItensDeVenda = new ArrayList<ItemDeVendaVO>();
  	try {
			Statement st=connection.createStatement();
			ResultSet rs = st.executeQuery(sql);

			if (rs!=null) {
				while(rs.next()) {
					ItemDeVendaVO Ivend = new ItemDeVendaVO();
					Ivend.setVendaID(rs.getInt("VendaID")) ;
					Ivend.setProdutoID(rs.getInt("ProdutoID"));
					Ivend.setQuantidade(rs.getInt("Quantidade"));

					ItensDeVenda.add(Ivend);
				}
			}


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  ItensDeVenda;
  }
}
