package Model;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Procedimiento {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key PR_Id;
	@Persistent
	private String PR_Nom;
	@Persistent
	private String SPR_Id;
	public Procedimiento(Key pR_Id, String pR_Nom, String sPR_Id) {
		super();
		PR_Id = pR_Id;
		PR_Nom = pR_Nom;
		SPR_Id = sPR_Id;
	}
	public Key getPR_Id() {
		return PR_Id;
	}
	public void setPR_Id(Key pR_Id) {
		PR_Id = pR_Id;
	}
	public String getPR_Nom() {
		return PR_Nom;
	}
	public void setPR_Nom(String pR_Nom) {
		PR_Nom = pR_Nom;
	}
	public String getSPR_Id() {
		return SPR_Id;
	}
	public void setSPR_Id(String sPR_Id) {
		SPR_Id = sPR_Id;
	}
	
	

}
