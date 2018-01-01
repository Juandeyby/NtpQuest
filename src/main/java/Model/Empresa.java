package Model;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Empresa {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key EMP_Id;
	@Persistent
	private String EMP_Nom;
	@Persistent
	private String EMP_RutL;
	@Persistent
	private String EMP_User;
	@Persistent
	private String EMP_Pass;
	@Persistent
	private String EMP_MivMr;
	
	public Empresa(String eMP_Nom, String eMP_RutL, String eMP_User, String eMP_Pass, String eMP_MivMr) {
		super();
		EMP_Nom = eMP_Nom;
		EMP_RutL = eMP_RutL;
		EMP_User = eMP_User;
		EMP_Pass = eMP_Pass;
		EMP_MivMr = eMP_MivMr;
	}

	public Key getEMP_Id() {
		return EMP_Id;
	}

	public void setEMP_Id(Key eMP_Id) {
		EMP_Id = eMP_Id;
	}

	public String getEMP_Nom() {
		return EMP_Nom;
	}

	public void setEMP_Nom(String eMP_Nom) {
		EMP_Nom = eMP_Nom;
	}

	public String getEMP_RutL() {
		return EMP_RutL;
	}

	public void setEMP_RutL(String eMP_RutL) {
		EMP_RutL = eMP_RutL;
	}

	public String getEMP_User() {
		return EMP_User;
	}

	public void setEMP_User(String eMP_User) {
		EMP_User = eMP_User;
	}

	public String getEMP_Pass() {
		return EMP_Pass;
	}

	public void setEMP_Pass(String eMP_Pass) {
		EMP_Pass = eMP_Pass;
	}

	public String getEMP_MivMr() {
		return EMP_MivMr;
	}

	public void setEMP_MivMr(String eMP_MivMr) {
		EMP_MivMr = eMP_MivMr;
	}
	
	public String getEMP_Id_String() {
		return KeyFactory.keyToString(EMP_Id);
	}

	public void setEMP_Id_String(String eMP_Id) {
		Key keyEmpresa = KeyFactory.stringToKey(eMP_Id);
		this.EMP_Id = KeyFactory.createKey(keyEmpresa,
		Empresa.class.getSimpleName(), java.util.UUID.randomUUID().toString());
	}
	
}
