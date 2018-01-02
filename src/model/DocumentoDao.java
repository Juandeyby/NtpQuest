package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DocumentoDao {
	private static DocumentoDao docdao = null;
	private Connection connection = null;
	
	
	protected DocumentoDao() throws ClassNotFoundException, SQLException {
		connection = MySQLConnecUtils.getMySQLConnection();
	}
	
	public DocumentoDao getInstance() throws ClassNotFoundException, SQLException {
		if(docdao == null)
			docdao = new DocumentoDao();
		return docdao;
	}
	
	public Documento getById(int dOC_Id) throws SQLException {
		Documento nDocumento = null;
		Statement statement = connection.createStatement();
		String sql = "SELECT * FROM tbldocumento where DOC_Id = " + dOC_Id;
		ResultSet rs = statement.executeQuery(sql);
		if(rs.next()) {
			nDocumento = new Documento(rs.getInt("DOC_Id"),
					rs.getString("DOC_Nom"),
					rs.getString("DOC_Rut"),
					rs.getString("DOC_NivM").charAt(0),
					rs.getInt("PR_Id")
					);
		}
		return nDocumento;
	}
	
	public List<Documento> getByNom(String dOC_Nom) throws SQLException{
		List<Documento> lDocumento = new ArrayList<Documento>();
		Statement statement = connection.createStatement();
		String sql = "SELECT * FROM tbldocumento where DOC_Nom like '" + dOC_Nom + "'";
		ResultSet rs = statement.executeQuery(sql);
		while(rs.next()) {
			lDocumento.add(new Documento(
					rs.getInt("DOC_Id"),
					rs.getString("DOC_Nom"),
					rs.getString("DOC_Rut"),
					rs.getString("DOC_NivM").charAt(0),
					rs.getInt("PR_Id")
					)
					);
		}
		return lDocumento;
	}
	
	public boolean insert(Documento nDocumento) throws SQLException {
		Statement statement = connection.createStatement();
		String sql =  "SELECT MAX(DOC_Id) FROM tbldocumento";
		ResultSet rs = statement.executeQuery(sql);
		if(rs.next()) {
			nDocumento.setDOC_Id(rs.getInt(1) + 1);
		}
		
		sql = "INSERT INTO tbldocumento (" +
				"DOC_Id, " + 
				"DOC_Nom, " + 
				"DOC_Rut, " +
				"DOC_NivM, " +
				"PR_Id " + 
				") VALUES (" +
				nDocumento.getDOC_Id() + ", " +
				"'" + nDocumento.getDOC_Nom() + "', " +
				"'" + nDocumento.getDOC_Rut() + "', " +
				"'" + nDocumento.getDOC_NivM() + "', " +
				"'" + nDocumento.getPR_Id() +
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
	
	public boolean update(Documento uDocumento, int dOC_Id) throws SQLException {
		if(getById(dOC_Id) != null) {
			Statement statement = connection.createStatement();
			String sql = "UPDATE tbldocumento SET " + 
				"DOC_Nom = '" + uDocumento.getDOC_Nom() + "', " +
				"DOC_Rut = '" + uDocumento.getDOC_Rut() + "', " +
				"DOC_NivM = '" + uDocumento.getDOC_NivM() + "', " +
				"PR_Id = " + uDocumento.getPR_Id() +
				" WHERE DOC_Id = " + dOC_Id;
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
	
	public boolean delete(int dOC_Id) throws SQLException {
		if(getById(dOC_Id) != null) {
			Statement statement = connection.createStatement();
			String sql = "DELETE FROM tbldocumento  WHERE DOC_Id = "+ dOC_Id;
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
