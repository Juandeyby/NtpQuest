package model;

public class Subproceso {

	private int SPR_Id;
	private String SPR_Nom;
	private int PRO_Id;
	
	public Subproceso( String sPR_Nom, int pRO_Id) {
		super();
		SPR_Id = 0;
		SPR_Nom = sPR_Nom;
		PRO_Id = pRO_Id;
	}
	
	public Subproceso(int sPR_Id, String sPR_Nom, int pRO_Id) {
		super();
		SPR_Id = sPR_Id;
		SPR_Nom = sPR_Nom;
		PRO_Id = pRO_Id;
	}
	
	public int getSPR_Id() {
		return SPR_Id;
	}
	public void setSPR_Id(int sPR_Id) {
		SPR_Id = sPR_Id;
	}
	public String getSPR_Nom() {
		return SPR_Nom;
	}
	public void setSPR_Nom(String sPR_Nom) {
		SPR_Nom = sPR_Nom;
	}
	public int getPRO_Id() {
		return PRO_Id;
	}
	public void setPRO_Id(int pRO_Id) {
		PRO_Id = pRO_Id;
	}


}
