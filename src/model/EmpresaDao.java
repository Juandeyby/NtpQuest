package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmpresaDao {
	
	private static EmpresaDao empdao = null;
	private Connection connection = null;
	
	
	protected EmpresaDao() throws ClassNotFoundException, SQLException {
		connection = MySQLConnecUtils.getMySQLConnection();	
	}
	
	public static EmpresaDao getInstance() throws ClassNotFoundException, SQLException {
		if(empdao == null)
			empdao = new EmpresaDao();
		return empdao;
	}
	
	public Empresa getById(int eMP_Id) throws SQLException {
		Empresa nEmpresa = null;
		Statement statement = connection.createStatement();
		String sql = "SELECT * FROM tblempresa where EMP_Id = " + eMP_Id;
		ResultSet rs = statement.executeQuery(sql);
		if(rs.next()) {
			nEmpresa = new Empresa(rs.getInt("EMP_Id"),
					rs.getString("EMP_Nom"),
					rs.getString("EMP_RutL"),
					rs.getString("EMP_User"),
					rs.getString("EMP_Pass"),
					rs.getString("EMP_NivMr").charAt(0)
					);
		}
		return nEmpresa;
	}
	
	public List<Empresa> getByNom(String eMP_Nom) throws SQLException{
		List<Empresa> lEmpresas = new ArrayList<Empresa>();
		Statement statement = connection.createStatement();
		String sql = "SELECT * FROM tblempresa where EMP_Nom like '" + eMP_Nom + "'";
		ResultSet rs = statement.executeQuery(sql);
		while(rs.next()) {
			lEmpresas.add(new Empresa(
					rs.getInt("EMP_Id"),
					rs.getString("EMP_Nom"),
					rs.getString("EMP_RutL"),
					rs.getString("EMP_User"),
					rs.getString("EMP_Pass"),
					rs.getString("EMP_NivMr").charAt(0)
					)
					);
		}
		return lEmpresas;
	}
	
	public Empresa getByUser(String user) throws SQLException{
		Empresa nEmpresa = null;
		Statement statement = connection.createStatement();
		String sql = "SELECT * FROM tblempresa where EMP_User like '" + user + "'";
		System.out.println(sql);
		ResultSet rs = statement.executeQuery(sql);
		if(rs.next()) {
			System.out.println("hay algo");
			nEmpresa = new Empresa(rs.getInt("EMP_Id"),
					rs.getString("EMP_Nom"),
					rs.getString("EMP_RutL"),
					rs.getString("EMP_User"),
					rs.getString("EMP_Pass"),
					rs.getString("EMP_NivMr").charAt(0)
					);
		}
		return nEmpresa;
	}
	
	public boolean insert(Empresa nEmpresa) throws SQLException {
		Statement statement = connection.createStatement();
		String sql =  "SELECT MAX(EMP_Id) FROM tblempresa";
		ResultSet rs = statement.executeQuery(sql);
		if(rs.next()) {
			nEmpresa.setEMP_Id(rs.getInt(1) + 1);
		}
		
		sql =  "SELECT EMP_User FROM tblempresa WHERE EMP_Nom LIKE '" + nEmpresa.getEMP_User() + "'";
		rs = statement.executeQuery(sql);
		if(rs.next()) {
			System.out.println("Nombre de usuario ya existe");
			return false;
		}
		
		sql = "INSERT INTO tblempresa (" +
				"EMP_Id, " + 
				"EMP_Nom, " + 
				"EMP_RutL, " + 
				"EMP_User, " +
				"EMP_Pass, " +
				"EMP_NivMr" +
				") VALUES (" +
				nEmpresa.getEMP_Id() + ", " +
				"'" + nEmpresa.getEMP_Nom() + "', " +
				"'" + nEmpresa.getEMP_RutL() + "', " +
				"'" + nEmpresa.getEMP_User() + "', " +
				"'" + nEmpresa.getEMP_Pass() + "', " +
				"'" + nEmpresa.getEMP_MivMr() + "'" +
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
	
	public boolean update(Empresa uEmpresa, int eMP_Id) throws SQLException {
		if(getById(eMP_Id) != null) {
			Statement statement = connection.createStatement();
			String sql =  "SELECT * FROM tblempresa WHERE EMP_User LIKE '" + uEmpresa.getEMP_User() + "'";
			ResultSet rs = statement.executeQuery(sql);
			if(rs.next()) {
				if(rs.getInt("EMP_Id") != eMP_Id) {
					System.out.println("Nombre de usuario ya existe");
					return false;
				}
			}
			
			sql = "UPDATE tblempresa SET " + 
				"EMP_Nom = '" + uEmpresa.getEMP_Nom() + "', " +
				"EMP_RutL = '" + uEmpresa.getEMP_RutL() + "', " +
				"EMP_User = '" + uEmpresa.getEMP_User() + "', " +
				"EMP_Pass = '" + uEmpresa.getEMP_Pass() + "', " +
				"EMP_NivMr = '" + uEmpresa.getEMP_MivMr() + "' " +
				"WHERE EMP_Id = " + eMP_Id;
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
	
	public boolean delete(int eMP_Id) throws SQLException {
		if(getById(eMP_Id) != null) {
			Statement statement = connection.createStatement();
			String sql = "DELETE FROM tblempresa  WHERE EMP_Id = "+ eMP_Id;
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

	public List<Empresa> login(String name, String pass) throws SQLException {
		List<Empresa> lEmpresas = new ArrayList<Empresa>();
		Statement statement = connection.createStatement();
		String sql = "SELECT * FROM tblempresa where EMP_User = '" + name + "' && EMP_Pass = '"+pass+"'";
		ResultSet rs = statement.executeQuery(sql);
		while(rs.next()) {
			lEmpresas.add(new Empresa(
					rs.getInt("EMP_Id"),
					rs.getString("EMP_Nom"),
					rs.getString("EMP_RutL"),
					rs.getString("EMP_User"),
					rs.getString("EMP_Pass"),
					rs.getString("EMP_NivMr").charAt(0)
					)
					);
		}
		return lEmpresas;
	}
}
