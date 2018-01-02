package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PlantillaDao {
	
	private static PlantillaDao pladao = null;
	private Connection connection = null;
	
	
	protected PlantillaDao() throws ClassNotFoundException, SQLException {
		connection = MySQLConnecUtils.getMySQLConnection();
	}
	
	public PlantillaDao getInstance() throws ClassNotFoundException, SQLException {
		if(pladao == null)
			pladao = new PlantillaDao();
		return pladao;
	}
	
	public Plantilla getById(int pLA_Id) throws SQLException {
		Plantilla nPlantilla = null;
		Statement statement = connection.createStatement();
		String sql = "SELECT * FROM tblplantilla where PLA_Id = " + pLA_Id;
		ResultSet rs = statement.executeQuery(sql);
		if(rs.next()) {
			nPlantilla = new Plantilla(rs.getInt("PLA_Id"),
					rs.getString("PLA_Nom"),
					rs.getString("PLA_Rut"),
					rs.getInt("PR_Id")
					);
		}
		return nPlantilla;
	}
	
	public List<Plantilla> getByNom(String pLA_Nom) throws SQLException{
		List<Plantilla> lPlantilla = new ArrayList<Plantilla>();
		Statement statement = connection.createStatement();
		String sql = "SELECT * FROM tblplantilla where PLA_Nom like '" + pLA_Nom + "'";
		ResultSet rs = statement.executeQuery(sql);
		while(rs.next()) {
			lPlantilla.add(new Plantilla(
					rs.getInt("PLA_Id"),
					rs.getString("PLA_Nom"),
					rs.getString("PLA_Rut"),
					rs.getInt("PR_Id")
					)
					);
		}
		return lPlantilla;
	}
	
	public boolean insert(Plantilla nPlantilla) throws SQLException {
		Statement statement = connection.createStatement();
		String sql =  "SELECT MAX(PLA_Id) FROM tblplantilla";
		ResultSet rs = statement.executeQuery(sql);
		if(rs.next()) {
			nPlantilla.setPLA_Id(rs.getInt(1) + 1);
		}
		
		sql = "INSERT INTO tblplantilla (" +
				"PLA_Id, " + 
				"PLA_Nom, " + 
				"PLA_RUT, " +
				"PR_Id " + 
				") VALUES (" +
				nPlantilla.getPLA_Id() + ", " +
				"'" + nPlantilla.getPLA_Nom() + "', " +
				"'" + nPlantilla.getPLA_Rut() + "', " +
				nPlantilla.getPR_Id() +
				")";
		try {
			int rowCount = statement.executeUpdate(sql);
			System.out.println("Row Count affected = " + rowCount);
			return true;
		}catch(Exception e) {
			System.err.println(e.getMessage());
			return false;
		}
	}
	
	public boolean update(Plantilla uPlantilla, int pLA_Id) throws SQLException {
		if(getById(pLA_Id) != null) {
			Statement statement = connection.createStatement();
			String sql = "UPDATE tblplantilla SET " + 
				"PLA_Nom = '" + uPlantilla.getPLA_Nom() + "', " +
				"PLA_Rut = '" + uPlantilla.getPLA_Rut() + "', " +
				"PR_Id = " + uPlantilla.getPR_Id() +
				" WHERE PLA_Id = " + pLA_Id;
			try {
				int rowCount = statement.executeUpdate(sql);
				System.out.println("Row Count affected = " + rowCount);
				return true;
			}catch(Exception e) {
				System.err.println(e.getMessage());
				return false;
			}
		}
		return false;
	}
	
	public boolean delete(int pLA_Id) throws SQLException {
		if(getById(pLA_Id) != null) {
			Statement statement = connection.createStatement();
			String sql = "DELETE FROM tblplantilla  WHERE PR_Id = "+ pLA_Id;
			try {
				int rowCount = statement.executeUpdate(sql);
				System.out.println("Row Count affected = " + rowCount);
				return true;
			}catch(Exception e) {
				System.err.println(e.getMessage());
				return false;
			}
		}
		return false;
	}

}
