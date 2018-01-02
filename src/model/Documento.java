package model;


public class Documento {
	
	private int DOC_Id;
	private String DOC_Nom;
	private String DOC_Rut;
	private char DOC_NivM;
	private int PR_Id;
	
	public Documento(String dOC_Nom, String dOC_Rut, char dOC_NivM, int pR_Id) {
		super();
		DOC_Id = 0;
		DOC_Nom = dOC_Nom;
		DOC_Rut = dOC_Rut;
		DOC_NivM = dOC_NivM;
		PR_Id = pR_Id;
	}
	
	public Documento(int dOC_Id, String dOC_Nom, String dOC_Rut, char dOC_NivM, int pR_Id) {
		super();
		DOC_Id = dOC_Id;
		DOC_Nom = dOC_Nom;
		DOC_Rut = dOC_Rut;
		DOC_NivM = dOC_NivM;
		PR_Id = pR_Id;
	}
	
	public int getDOC_Id() {
		return DOC_Id;
	}
	public void setDOC_Id(int dOC_Id) {
		DOC_Id = dOC_Id;
	}
	public String getDOC_Nom() {
		return DOC_Nom;
	}
	public void setDOC_Nom(String dOC_Nom) {
		DOC_Nom = dOC_Nom;
	}
	public String getDOC_Rut() {
		return DOC_Rut;
	}
	public void setDOC_Rut(String dOC_Rut) {
		DOC_Rut = dOC_Rut;
	}
	public char getDOC_NivM() {
		return DOC_NivM;
	}
	public void setDOC_NivM(char dOC_NivM) {
		DOC_NivM = dOC_NivM;
	}
	public int getPR_Id() {
		return PR_Id;
	}
	public void setPR_Id(int pR_Id) {
		PR_Id = pR_Id;
	}
	
	

}
