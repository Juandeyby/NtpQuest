package model;

public class Proceso {

	private int PRO_Id;
	private String PRO_Nom;
	private int EMP_Id;
	
	public Proceso(String pRO_Nom, int eMP_Id) {
		super();
		PRO_Id = 0;
		PRO_Nom = pRO_Nom;
		EMP_Id = eMP_Id;
	}
	
	public Proceso(int pRO_Id, String pRO_Nom, int eMP_Id) {
		super();
		PRO_Id = pRO_Id;
		PRO_Nom = pRO_Nom;
		EMP_Id = eMP_Id;
	}
	
	public int getPRO_Id() {
		return PRO_Id;
	}
	public void setPRO_Id(int pRO_Id) {
		PRO_Id = pRO_Id;
	}
	public String getPRO_Nom() {
		return PRO_Nom;
	}
	public void setPRO_Nom(String pRO_Nom) {
		PRO_Nom = pRO_Nom;
	}
	public int getEMP_Id() {
		return EMP_Id;
	}
	public void setEMP_Id(int eMP_Id) {
		EMP_Id = eMP_Id;
	}


}
