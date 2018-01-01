package Model;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Subproceso {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key SPR_Id;
	@Persistent
	private String SPR_Nom;
	@Persistent
	private String PRO_Id;
	public Subproceso(Key sPR_Id, String sPR_Nom, String pRO_Id) {
		super();
		SPR_Id = sPR_Id;
		SPR_Nom = sPR_Nom;
		PRO_Id = pRO_Id;
	}
	public Key getSPR_Id() {
		return SPR_Id;
	}
	public void setSPR_Id(Key sPR_Id) {
		SPR_Id = sPR_Id;
	}
	public String getSPR_Nom() {
		return SPR_Nom;
	}
	public void setSPR_Nom(String sPR_Nom) {
		SPR_Nom = sPR_Nom;
	}
	public String getPRO_Id() {
		return PRO_Id;
	}
	public void setPRO_Id(String pRO_Id) {
		PRO_Id = pRO_Id;
	}


}
