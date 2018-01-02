package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DiagramaProcedimientoDao {
	private static DiagramaProcedimientoDao dpdao = null;
	private Connection connection = null;
	
	
	protected DiagramaProcedimientoDao() throws ClassNotFoundException, SQLException {
		connection = MySQLConnecUtils.getMySQLConnection();
	}
	
	public DiagramaProcedimientoDao getInstance() throws ClassNotFoundException, SQLException {
		if(dpdao == null)
			dpdao = new DiagramaProcedimientoDao();
		return dpdao;
	}
	
	public DiagramaProcedimiento getById(int dP_Id) throws SQLException {
		DiagramaProcedimiento nDiagramaProcedimiento = null;
		Statement statement = connection.createStatement();
		String sql = "SELECT * FROM tbldiagramaprocedimiento where DOC_Id = " + dP_Id;
		ResultSet rs = statement.executeQuery(sql);
		if(rs.next()) {
			nDiagramaProcedimiento = new DiagramaProcedimiento(rs.getInt("DP_Id"),
					rs.getString("DP_Nom"),
					rs.getString("DP_Rut"),
					rs.getInt("PR_Id")
					);
		}
		return nDiagramaProcedimiento;
	}
	
	public List<DiagramaProcedimiento> getByNom(String dP_Nom) throws SQLException{
		List<DiagramaProcedimiento> lDiagramaProcedimiento = new ArrayList<DiagramaProcedimiento>();
		Statement statement = connection.createStatement();
		String sql = "SELECT * FROM tbldiagramaprocedimiento where DP_Nom LIKE '" + dP_Nom + "'"; 
		ResultSet rs = statement.executeQuery(sql);
		while(rs.next()) {
			lDiagramaProcedimiento.add(new DiagramaProcedimiento(
					rs.getInt("DP_Id"),
					rs.getString("DP_Nom"),
					rs.getString("DP_Rut"),
					rs.getInt("PR_Id")
					)
					);
		}
		return lDiagramaProcedimiento;
	}
	
	public boolean insert(DiagramaProcedimiento nDiagramaProcedimiento) throws SQLException {
		Statement statement = connection.createStatement();
		String sql =  "SELECT MAX(DOC_Id) FROM tbldiagramaprocedimiento";
		ResultSet rs = statement.executeQuery(sql);
		if(rs.next()) {
			nDiagramaProcedimiento.setDP_Id(rs.getInt(1) + 1);
		}
		
		sql = "INSERT INTO tbldiagramaprocedimiento (" +
				"DP_Id, " + 
				"DP_Nom, " + 
				"DP_Rut, " +
				"PR_Id " + 
				") VALUES (" +
				nDiagramaProcedimiento.getDP_Id() + ", " +
				"'" + nDiagramaProcedimiento.getDP_Nom() + "', " +
				"'" + nDiagramaProcedimiento.getDP_Rut() + "', " +
				nDiagramaProcedimiento.getPR_Id() +
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
	
	public boolean update(DiagramaProcedimiento uDiagramaProcedimiento, int dP_Id) throws SQLException {
		if(getById(dP_Id) != null) {
			Statement statement = connection.createStatement();
			String sql = "UPDATE tbldiagramaprocedimiento SET " + 
				"DP_Nom = '" + uDiagramaProcedimiento.getDP_Nom() + "', " +
				"DP_Rut = '" + uDiagramaProcedimiento.getDP_Rut() + "', " +
				"PR_Id = " + uDiagramaProcedimiento.getPR_Id() +
				" WHERE DOC_Id = " + dP_Id;
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
	
	public boolean delete(int dP_Id) throws SQLException {
		if(getById(dP_Id) != null) {
			Statement statement = connection.createStatement();
			String sql = "DELETE FROM tbldiagramaprocedimiento  WHERE DP_Id = "+ dP_Id;
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
