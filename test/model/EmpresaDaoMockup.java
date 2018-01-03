package model;
import java.util.ArrayList;
import java.util.List;



public class EmpresaDaoMockup extends IEmpresaDao {
	
	private ArrayList<Empresa> arrEmpresa = new ArrayList<Empresa>();
	
	public EmpresaDaoMockup() {
		arrEmpresa.add(new Empresa(1, "Empresa1", "RutEmpresa1", "UserEmp1", "Pass1", 'a'));
		arrEmpresa.add(new Empresa(2, "Empresa2", "RutEmpresa2", "UserEmp2", "Pass2", 'a'));
		arrEmpresa.add(new Empresa(3, "Empresa3", "RutEmpresa3", "UserEmp3", "Pass3", 'a'));
		arrEmpresa.add(new Empresa(4, "Empresa4", "RutEmpresa4", "UserEmp4", "Pass4", 'a'));
		arrEmpresa.add(new Empresa(5, "Empresa5", "RutEmpresa5", "UserEmp5", "Pass5", 'a'));
		
	}
	
	@Override
	public Empresa getById(int eMP_Id) {
		for(Empresa t: arrEmpresa) {
			if (t.getEMP_Id() == eMP_Id)
				return t;
		}
		return null;
	}

	@Override
	public List<Empresa> getByNom(String eMP_Nom) {
		List<Empresa> t = new ArrayList <Empresa>();
		for(Empresa te : arrEmpresa) {
			if(te.getEMP_Nom().contains(eMP_Nom)) {
				t.add(te);
			}
		}
		return t;
	}

	@Override
	public boolean insert(Empresa nEmpresa) {
		int max_Id = 0;
		for(Empresa t: arrEmpresa) {
			if (t.getEMP_User().compareTo(nEmpresa.getEMP_User()) == 0)
				return false;
			if(t.getEMP_Id() > max_Id)
				max_Id = t.getEMP_Id();
		}
		nEmpresa.setEMP_Id(max_Id + 1);
		arrEmpresa.add(nEmpresa);
		return true;
	}

	@Override
	public boolean update(Empresa uEmpresa, int eMP_Id) {
		for(Empresa t : arrEmpresa) {
			if(t.getEMP_Id() == eMP_Id) {
				t.setEMP_Nom(uEmpresa.getEMP_Nom());
				t.setEMP_RutL(uEmpresa.getEMP_RutL());
				t.setEMP_User(uEmpresa.getEMP_User());
				t.setEMP_Pass(uEmpresa.getEMP_Pass());
				t.setEMP_MivMr(uEmpresa.getEMP_MivMr());
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean delete(int eMP_Id) {
		for(int i = 0; i < arrEmpresa.size(); i++) {
			if(arrEmpresa.get(i).getEMP_Id() == eMP_Id) {
				arrEmpresa.remove(i);
				return true;
			}
		}
		return false;
	}
	
}
