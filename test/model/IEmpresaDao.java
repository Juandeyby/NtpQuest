package model;

import java.util.List;

abstract class IEmpresaDao {
	protected IEmpresaDao() {}
	static IEmpresaDao edao;
	public static IEmpresaDao getInstance(){
		if(edao == null) edao = new EmpresaDaoMockup();
		return edao;
	}
	
	public abstract Empresa getById(int eMP_Id);
	public abstract List<Empresa> getByNom(String eMP_Nom);
	public abstract boolean insert(Empresa nEmpresa);
	public abstract boolean update(Empresa uEmpresa, int eMP_Id);
	public abstract boolean delete(int eMP_Id);

}
