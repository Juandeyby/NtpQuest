package model;



public class Empresa {
	

	private int EMP_Id;
	private String EMP_Nom;
	private String EMP_RutL;
	private String EMP_User;
	private String EMP_Pass;
	private char EMP_MivMr;
	
	public Empresa() {}
	public Empresa(String eMP_Nom, String eMP_RutL, String eMP_User, String eMP_Pass, char eMP_MivMr) {
		super();
		EMP_Id = 0;
		EMP_Nom = eMP_Nom;
		EMP_RutL = eMP_RutL;
		EMP_User = eMP_User;
		EMP_Pass = eMP_Pass;
		EMP_MivMr = eMP_MivMr;
	}

	public Empresa(int eMP_Id, String eMP_Nom, String eMP_RutL, String eMP_User, String eMP_Pass, char eMP_MivMr) {
		super();
		EMP_Id = eMP_Id;
		EMP_Nom = eMP_Nom;
		EMP_RutL = eMP_RutL;
		EMP_User = eMP_User;
		EMP_Pass = eMP_Pass;
		EMP_MivMr = eMP_MivMr;
	}

	public int getEMP_Id() {
		return EMP_Id;
	}

	public void setEMP_Id(int eMP_Id) {
		EMP_Id = eMP_Id;
	}

	public String getEMP_Nom() {
		return EMP_Nom;
	}

	public void setEMP_Nom(String eMP_Nom) {
		EMP_Nom = eMP_Nom;
	}

	public String getEMP_RutL() {
		return EMP_RutL;
	}

	public void setEMP_RutL(String eMP_RutL) {
		EMP_RutL = eMP_RutL;
	}

	public String getEMP_User() {
		return EMP_User;
	}

	public void setEMP_User(String eMP_User) {
		EMP_User = eMP_User;
	}

	public String getEMP_Pass() {
		return EMP_Pass;
	}

	public void setEMP_Pass(String eMP_Pass) {
		EMP_Pass = eMP_Pass;
	}

	public char getEMP_MivMr() {
		return EMP_MivMr;
	}

	public void setEMP_MivMr(char eMP_MivMr) {
		EMP_MivMr = eMP_MivMr;
	}

}
