package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Model.UsuarioVO;

public class UsuarioDAO {

	DAOConection obj_DB_Connection=new DAOConection();
	private  Connection connection = obj_DB_Connection.get_connection();

	public void InsereUsuario(UsuarioVO usuario){

		try {

		PreparedStatement ps=connection.prepareStatement("insert into Usuarios(CPF,Nome,Senha,Telefone) values (?,?,?,?)");
			ps.setString(1, usuario.getCPF());
			ps.setString(2, usuario.getNome());
			ps.setInt(3, usuario.getSenha());
			ps.setString(4, usuario.getTelefone());

			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void UpdateUsuario(UsuarioVO usuario){

		try {

		PreparedStatement ps=connection.prepareStatement("update Usuarios set Nome = ?,Senha = ?,Telefone = ? where CPF = ?");

			ps.setString(1, usuario.getNome());
			ps.setInt(2, usuario.getSenha());
			ps.setString(3, usuario.getTelefone());
			ps.setString(4, usuario.getCPF());
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
   public void DeleteUsuario(UsuarioVO usuario){

		   try {

		   PreparedStatement ps=connection.prepareStatement("delete from Usuarios where CPF = ?");

			   ps.setString(1, usuario.getCPF());
			   ps.executeUpdate();
		    } catch (Exception e) {
		    	System.out.println(e);
	    	}
	}

   public List<UsuarioVO> SelectUsuarios() {
   	String sql= "select CPF, Nome, Senha, Telefone from Usuarios";
   	List<UsuarioVO> Usuarios = new ArrayList<UsuarioVO>();
   	try {
			Statement st=connection.createStatement();
			ResultSet rs = st.executeQuery(sql);

			if (rs!=null) {
				while(rs.next()) {
					UsuarioVO usur = new UsuarioVO();
					usur.setCPF(rs.getString("CPF")) ;
					usur.setNome(rs.getString("Nome"));
					usur.setSenha(rs.getInt("Senha"));
					usur.setTelefone(rs.getString("Telefone"));

					Usuarios.add(usur);
				}
			}


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  Usuarios;
   }

}
