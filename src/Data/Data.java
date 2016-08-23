package Data;

import java.sql.SQLException;

import Users.User;

public class Data {
	
	private ConnectDataBase db;
	
	public void createDataBase(){
		try {
			db = new ConnectDataBase("jdbc:mysql://localhost/", "",
					"root", "5813");
			db.update("CREATE DATABASE IF NOT EXISTS discountsystem;");
			db.update("USE discountsystem;");
			System.out.println("Connect - Check!");
			
			createTableClients();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void createTableClients(){
		
		try {
			db = new ConnectDataBase("jdbc:mysql://localhost/", "",
					"root", "5813");
			db.update("USE discountsystem;");
			db.update("CREATE TABLE IF NOT EXISTS clients ( "
					+ "id MEDIUMINT NOT NULL AUTO_INCREMENT, "
					+ "FirstName VARCHAR(30) NOT NULL, "
					+ "LastName VARCHAR(40), "
					+ "phone VARCHAR(30), "
					+ "Summ int(30) , "
					+ "PRIMARY KEY(id));");
			System.out.println("Table 'clients' was created!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	};
	
	
	
/*


	public String[] colums() {
		String[] col = {
				"id",
				"Name",
				"LastName",
				"Phone Number",
				"Summ",
				"Data"
		};
		return col;
	}
	
	public String[][] data() {
		String[][] data = {

		};
		return data;
		
	}
	*/
}
