package Model;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Proceso {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key PRO_Id;
	@Persistent
	private String PRO_Nom;
	@Persistent
	private String EMP_Id;
	public Proceso(Key pRO_Id, String pRO_Nom, String eMP_Id) {
		super();
		PRO_Id = pRO_Id;
		PRO_Nom = pRO_Nom;
		EMP_Id = eMP_Id;
	}
	public Key getPRO_Id() {
		return PRO_Id;
	}
	public void setPRO_Id(Key pRO_Id) {
		PRO_Id = pRO_Id;
	}
	public String getPRO_Nom() {
		return PRO_Nom;
	}
	public void setPRO_Nom(String pRO_Nom) {
		PRO_Nom = pRO_Nom;
	}
	public String getEMP_Id() {
		return EMP_Id;
	}
	public void setEMP_Id(String eMP_Id) {
		EMP_Id = eMP_Id;
	}


}
