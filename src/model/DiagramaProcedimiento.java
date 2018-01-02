package model;

public class DiagramaProcedimiento {

	private int DP_Id;
	private String DP_Nom;
	private String DP_Rut;
	private int PR_Id;
	
	public DiagramaProcedimiento(String dP_Nom, String dP_Rut, int pR_Id) {
		super();
		DP_Id = 0;
		DP_Nom = dP_Nom;
		DP_Rut = dP_Rut;
		PR_Id = pR_Id;
	}
	
	public DiagramaProcedimiento(int dP_Id, String dP_Nom, String dP_Rut, int pR_Id) {
		super();
		DP_Id = dP_Id;
		DP_Nom = dP_Nom;
		DP_Rut = dP_Rut;
		PR_Id = pR_Id;
	}

	public int getDP_Id() {
		return DP_Id;
	}

	public void setDP_Id(int dP_Id) {
		DP_Id = dP_Id;
	}

	public String getDP_Nom() {
		return DP_Nom;
	}

	public void setDP_Nom(String dP_Nom) {
		DP_Nom = dP_Nom;
	}

	public String getDP_Rut() {
		return DP_Rut;
	}

	public void setDP_Rut(String dP_Rut) {
		DP_Rut = dP_Rut;
	}

	public int getPR_Id() {
		return PR_Id;
	}

	public void setPR_Id(int pR_Id) {
		PR_Id = pR_Id;
	}
	
	

}
