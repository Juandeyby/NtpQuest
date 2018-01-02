package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProcesoDao {
	private static ProcesoDao prodao = null;
	private Connection connection = null;
	
	
	protected ProcesoDao() throws ClassNotFoundException, SQLException {
		connection = MySQLConnecUtils.getMySQLConnection();
	}
	
	public ProcesoDao getInstance() throws ClassNotFoundException, SQLException {
		if(prodao == null)
			prodao = new ProcesoDao();
		return prodao;
	}
	
	public Proceso getById(int pRO_Id) throws SQLException {
		Proceso nProceso = null;
		Statement statement = connection.createStatement();
		String sql = "SELECT * FROM tblprocesos where PRO_Id = " + pRO_Id;
		ResultSet rs = statement.executeQuery(sql);
		if(rs.next()) {
			nProceso = new Proceso(rs.getInt("PRO_Id"),
					rs.getString("PRO_Nom"),
					rs.getInt("EMP_Id")
					);
		}
		return nProceso;
	}
	
	public List<Proceso> getByNom(String pRO_Nom) throws SQLException{
		List<Proceso> lProceso = new ArrayList<Proceso>();
		Statement statement = connection.createStatement();
		String sql = "SELECT * FROM tblprocesos where EMP_Nom LIKE '" + pRO_Nom + "'";
		ResultSet rs = statement.executeQuery(sql);
		while(rs.next()) {
			lProceso.add(new Proceso(
					rs.getInt("PRO_Id"),
					rs.getString("PRO_Nom"),
					rs.getInt("EMP_Id")
					)
					);
		}
		return lProceso;
	}
	
	public boolean insert(Proceso nProceso) throws SQLException {
		Statement statement = connection.createStatement();
		String sql =  "SELECT MAX(PRO_Id) FROM tblprocesos";
		ResultSet rs = statement.executeQuery(sql);
		if(rs.next()) {
			nProceso.setPRO_Id(rs.getInt(1) + 1);
		}
		
		sql = "INSERT INTO tblprocesos (" +
				"PRO_Id, " + 
				"PRO_Nom, " + 
				"EMP_Id " + 
				") VALUES (" +
				nProceso.getPRO_Id() + ", " +
				"'" + nProceso.getPRO_Nom() + "', " +
				nProceso.getEMP_Id() +
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
	
	public boolean update(Proceso uProceso, int pRO_Id) throws SQLException {
		if(getById(pRO_Id) != null) {
			Statement statement = connection.createStatement();
			String sql = "UPDATE tblprocesos SET " + 
				"PRO_Nom = '" + uProceso.getPRO_Nom() + "', " +
				"EMP_Id = " + uProceso.getEMP_Id() +
				" WHERE PRO_Id = " + pRO_Id;
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
	
	public boolean delete(int pRO_Id) throws SQLException {
		if(getById(pRO_Id) != null) {
			Statement statement = connection.createStatement();
			String sql = "DELETE FROM tblprocesos  WHERE PRO_Id = "+ pRO_Id;
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
