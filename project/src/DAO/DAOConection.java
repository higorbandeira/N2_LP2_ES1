package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

 public  class DAOConection {
		public static void main(String[] args) {
			DAOConection obj_DB_Connection=new DAOConection();
			System.out.println(obj_DB_Connection.get_connection());
		}

		public Connection get_connection(){
		 Connection connection=null;
		try {
		  Class.forName("com.sqlServer.jdbc.Driver");
		  connection = DriverManager.getConnection("jdbc:sqlServer://localhost:3306/LojaDeBrinquedos","sa", "123456");
		} catch (Exception e) {
		  System.out.println(e);
		}
		  return connection;
		}

}