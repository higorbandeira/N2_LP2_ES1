package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Model.VendasVO;

public class VendasDAO {



	DAOConection obj_DB_Connection=new DAOConection();
	private  Connection connection = obj_DB_Connection.get_connection();

	public void InsereUuário(VendasVO Vendas){

		try {

		PreparedStatement ps=connection.prepareStatement("insert into Vendas(VendaID,Valor) values (?,?)");
			ps.setInt(1, Vendas.getVendaID());
			ps.setDouble(2, Vendas.getValor());


			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void UpdateVendas(VendasVO Vendas){

		try {

		PreparedStatement ps=connection.prepareStatement("update Vendas set Valor = ? where VendaID = ?");

		    ps.setDouble(1, Vendas.getValor());
		    ps.setInt(2, Vendas.getVendaID());
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
  public void DeleteVendas(VendasVO Vendas){

		   try {

		   PreparedStatement ps=connection.prepareStatement("delete from Vendas where VendaID = ?");

			   ps.setInt(1, Vendas.getVendaID());
			   ps.executeUpdate();
		    } catch (Exception e) {
		    	System.out.println(e);
	    	}
	}
  public List<VendasVO> SelectVendas() {
  	String sql= "select VendaID, Valor from Vendas ";
  	List<VendasVO> Vendas = new ArrayList<VendasVO>();
  	try {
			Statement st=connection.createStatement();
			ResultSet rs = st.executeQuery(sql);

			if (rs!=null) {
				while(rs.next()) {
					VendasVO vend = new VendasVO();
					vend.setVendaID(rs.getInt("VendaID")) ;
					vend.setValor(rs.getDouble("Valor"));


					Vendas.add(vend);
				}
			}


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  Vendas;
  }

}
