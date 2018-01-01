package Model;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Plantilla {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key PLA_Id;
	@Persistent
	private String PLA_Nom;
	@Persistent
	private String PLA_Rut;
	@Persistent
	private String PR_Id;
	public Plantilla(Key pLA_Id, String pLA_Nom, String pLA_Rut, String pR_Id) {
		super();
		PLA_Id = pLA_Id;
		PLA_Nom = pLA_Nom;
		PLA_Rut = pLA_Rut;
		PR_Id = pR_Id;
	}
	public Key getPLA_Id() {
		return PLA_Id;
	}
	public void setPLA_Id(Key pLA_Id) {
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
	public String getPR_Id() {
		return PR_Id;
	}
	public void setPR_Id(String pR_Id) {
		PR_Id = pR_Id;
	}
	

}
