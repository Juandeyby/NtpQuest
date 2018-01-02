package model;

public class Procedimiento {

	private int PR_Id;
	private String PR_Nom;
	private int SPR_Id;
	
	public Procedimiento(String pR_Nom, int sPR_Id) {
		super();
		PR_Id = 0;
		PR_Nom = pR_Nom;
		SPR_Id = sPR_Id;
	}
	
	public Procedimiento(int pR_Id, String pR_Nom, int sPR_Id) {
		super();
		PR_Id = pR_Id;
		PR_Nom = pR_Nom;
		SPR_Id = sPR_Id;
	}
	
	public int getPR_Id() {
		return PR_Id;
	}
	public void setPR_Id(int pR_Id) {
		PR_Id = pR_Id;
	}
	public String getPR_Nom() {
		return PR_Nom;
	}
	public void setPR_Nom(String pR_Nom) {
		PR_Nom = pR_Nom;
	}
	public int getSPR_Id() {
		return SPR_Id;
	}
	public void setSPR_Id(int sPR_Id) {
		SPR_Id = sPR_Id;
	}
	
	

}
