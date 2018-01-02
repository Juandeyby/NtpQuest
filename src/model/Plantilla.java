package model;

public class Plantilla {

	private int PLA_Id;
	private String PLA_Nom;
	private String PLA_Rut;
	private int PR_Id;
	
	public Plantilla(String pLA_Nom, String pLA_Rut, int pR_Id) {
		super();
		PLA_Id = 0;
		PLA_Nom = pLA_Nom;
		PLA_Rut = pLA_Rut;
		PR_Id = pR_Id;
	}
	
	public Plantilla(int pLA_Id, String pLA_Nom, String pLA_Rut, int pR_Id) {
		super();
		PLA_Id = pLA_Id;
		PLA_Nom = pLA_Nom;
		PLA_Rut = pLA_Rut;
		PR_Id = pR_Id;
	}
	
	public int getPLA_Id() {
		return PLA_Id;
	}
	public void setPLA_Id(int pLA_Id) {
		PLA_Id = pLA_Id;
	}
	public String getPLA_Nom() {
		return PLA_Nom;
	}
	public void setPLA_Nom(String pLA_Nom) {
		PLA_Nom = pLA_Nom;
	}
	public String getPLA_Rut() {
		return PLA_Rut;
	}
	public void setPLA_Rut(String pLA_Rut) {
		PLA_Rut = pLA_Rut;
	}
	public int getPR_Id() {
		return PR_Id;
	}
	public void setPR_Id(int pR_Id) {
		PR_Id = pR_Id;
	}
	

}
