package Model;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Documento {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key DOC_Id;
	@Persistent
	private String DOC_Nom;
	@Persistent
	private String DOC_Rut;
	@Persistent
	private String NIvM;
	@Persistent
	private String Pr_Id;
	public Documento(Key dOC_Id, String dOC_Nom, String dOC_Rut, String nIvM, String pr_Id) {
		super();
		DOC_Id = dOC_Id;
		DOC_Nom = dOC_Nom;
		DOC_Rut = dOC_Rut;
		NIvM = nIvM;
		Pr_Id = pr_Id;
	}
	public Key getDOC_Id() {
		return DOC_Id;
	}
	public void setDOC_Id(Key dOC_Id) {
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
	public String getNIvM() {
		return NIvM;
	}
	public void setNIvM(String nIvM) {
		NIvM = nIvM;
	}
	public String getPr_Id() {
		return Pr_Id;
	}
	public void setPr_Id(String pr_Id) {
		Pr_Id = pr_Id;
	}
	
	

}
