package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SubprocesoDao {
	private static SubprocesoDao sprodao = null;
	private Connection connection = null;
	
	
	protected SubprocesoDao() throws ClassNotFoundException, SQLException {
		connection = MySQLConnecUtils.getMySQLConnection();
	}
	
	public SubprocesoDao getInstance() throws ClassNotFoundException, SQLException {
		if(sprodao == null)
			sprodao = new SubprocesoDao();
		return sprodao;
	}
	
	public Subproceso getById(int sRP_Id) throws SQLException {
		Subproceso nSproceso = null;
		Statement statement = connection.createStatement();
		String sql = "SELECT * FROM tblsubprocesos where SRP_Id = " + sRP_Id;
		ResultSet rs = statement.executeQuery(sql);
		if(rs.next()) {
			nSproceso = new Subproceso(rs.getInt("SPR_Id"),
					rs.getString("SPR_Nom"),
					rs.getInt("PRO_Id")
					);
		}
		return nSproceso;
	}
	
	public List<Subproceso> getByNom(String sPR_Nom) throws SQLException{
		List<Subproceso> lSproceso = new ArrayList<Subproceso>();
		Statement statement = connection.createStatement();
		String sql = "SELECT * FROM tblsubprocesos where SPR_Nom LIKE '" + sPR_Nom + "'";
		ResultSet rs = statement.executeQuery(sql);
		while(rs.next()) {
			lSproceso.add(new Subproceso(
					rs.getInt("SPR_Id"),
					rs.getString("SPR_Nom"),
					rs.getInt("PRO_Id")
					)
					);
		}
		return lSproceso;
	}
	
	public boolean insert(Subproceso nSproceso) throws SQLException {
		Statement statement = connection.createStatement();
		String sql =  "SELECT MAX(SPR_Id) FROM tblsubprocesos";
		ResultSet rs = statement.executeQuery(sql);
		if(rs.next()) {
			nSproceso.setSPR_Id(rs.getInt("SPR_Id") + 1);
		}
		
		sql = "INSERT INTO tblsubprocesos (" +
				"SPR_Id, " + 
				"SPR_Nom, " + 
				"PRO_Id " + 
				") VALUES (" +
				nSproceso.getSPR_Id() + ", " +
				"'" + nSproceso.getSPR_Nom() + "', " +
				nSproceso.getPRO_Id() +
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
	
	public boolean update(Subproceso uSproceso, int sPR_Id) throws SQLException {
		if(getById(sPR_Id) != null) {
			Statement statement = connection.createStatement();
			String sql = "UPDATE tblsubprocesos SET " + 
				"SPR_Nom = '" + uSproceso.getSPR_Nom() + "', " +
				"PRO_Id = " + uSproceso.getPRO_Id() +
				" WHERE SPR_Id = " + sPR_Id;
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
	
	public boolean delete(int sPR_Id) throws SQLException {
		if(getById(sPR_Id) != null) {
			Statement statement = connection.createStatement();
			String sql = "DELETE FROM tblsubprocesos  WHERE SPR_Id = "+ sPR_Id;
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
