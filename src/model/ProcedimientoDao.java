package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProcedimientoDao {
	private static ProcedimientoDao prodao = null;
	private Connection connection = null;
	
	
	protected ProcedimientoDao() throws ClassNotFoundException, SQLException {
		connection = MySQLConnecUtils.getMySQLConnection();
	}
	
	public ProcedimientoDao getInstance() throws ClassNotFoundException, SQLException {
		if(prodao == null)
			prodao = new ProcedimientoDao();
		return prodao;
	}
	
	public Procedimiento getById(int pR_Id) throws SQLException {
		Procedimiento nProcedimiento = null;
		Statement statement = connection.createStatement();
		String sql = "SELECT * FROM tblprocedimeintos where PR_Id = " + pR_Id;
		ResultSet rs = statement.executeQuery(sql);
		if(rs.next()) {
			nProcedimiento = new Procedimiento(rs.getInt("PR_Id"),
					rs.getString("PR_Nom"),
					rs.getInt("PR_Id")
					);
		}
		return nProcedimiento;
	}
	
	public List<Procedimiento> getByNom(String pR_Nom) throws SQLException{
		List<Procedimiento> lProcedimiento = new ArrayList<Procedimiento>();
		Statement statement = connection.createStatement();
		String sql = "SELECT * FROM tblprocedimeintos where PR_Nom LIKE '" + pR_Nom + "'";
		ResultSet rs = statement.executeQuery(sql);
		while(rs.next()) {
			lProcedimiento.add(new Procedimiento(
					rs.getInt("PR_Id"),
					rs.getString("PR_Nom"),
					rs.getInt("SPR_Id")
					)
					);
		}
		return lProcedimiento;
	}
	
	public boolean insert(Procedimiento nProcedimiento) throws SQLException {
		Statement statement = connection.createStatement();
		String sql =  "SELECT MAX(PR_Id) FROM tblprocedimiento";
		ResultSet rs = statement.executeQuery(sql);
		if(rs.next()) {
			nProcedimiento.setPR_Id(rs.getInt(1) + 1);
		}
		
		sql = "INSERT INTO tblprocedimeintos (" +
				"PR_Id, " + 
				"PR_Nom, " + 
				"SPR_Id " + 
				") VALUES (" +
				nProcedimiento.getPR_Id() + ", " +
				"'" + nProcedimiento.getPR_Nom() + "', " +
				nProcedimiento.getSPR_Id() +
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
	
	public boolean update(Procedimiento uProcedimiento, int pR_Id) throws SQLException {
		if(getById(pR_Id) != null) {
			Statement statement = connection.createStatement();
			String sql = "UPDATE tblprocedimeintos SET " + 
				"PRO_Nom = '" + uProcedimiento.getPR_Nom() + "', " +
				"EMP_Id = " + uProcedimiento.getSPR_Id() +
				" WHERE PRO_Id = " + pR_Id;
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
	
	public boolean delete(int pR_Id) throws SQLException {
		if(getById(pR_Id) != null) {
			Statement statement = connection.createStatement();
			String sql = "DELETE FROM tblprocedimeintos  WHERE PR_Id = "+ pR_Id;
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
