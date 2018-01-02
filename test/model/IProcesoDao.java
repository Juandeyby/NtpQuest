package model;

import java.util.List;

abstract class IProcesoDao {
	protected IProcesoDao() {}
	static IProcesoDao edao;
	public static IProcesoDao getInstance(){
		if(edao == null) edao = new ProcesoDaoMockup();
		return edao;
	}
	
	public abstract Proceso getById(int pRO_Id);
	public abstract List<Proceso> getByNom(String pRO_Nom);
	public abstract boolean insert(Proceso nProceso);
	public abstract boolean update(Proceso uProceso, int pRO_Id);
	public abstract boolean delete(int pRO_Id);

}