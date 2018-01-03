package model;

import java.util.ArrayList;
import java.util.List;

public class ProcesoDaoMockup extends IProcesoDao{
private ArrayList<Proceso> arrProceso = new ArrayList<Proceso>();
	
	public ProcesoDaoMockup() {
		arrProceso.add(new Proceso(1, "Proceso1", 1));
		arrProceso.add(new Proceso(2, "Proceso2", 1));
		arrProceso.add(new Proceso(3, "Proceso3", 1));
		arrProceso.add(new Proceso(4, "Proceso4", 1));
		arrProceso.add(new Proceso(5, "Proceso5", 1));
		
	}
	
	@Override
	public Proceso getById(int pRO_Id) {
		for(Proceso t: arrProceso) {
			if (t.getPRO_Id() == pRO_Id)
				return t;
		}
		return null;
	}

	@Override
	public List<Proceso> getByNom(String pRO_Nom) {
		List<Proceso> t = new ArrayList <Proceso>();
		for(Proceso te : arrProceso) {
			if(te.getPRO_Nom().contains(pRO_Nom)) {
				t.add(te);
			}
		}
		return t;
	}

	@Override
	public boolean insert(Proceso nProceso) {
		int max_Id = 0;
		for(Proceso t: arrProceso) {
			if(t.getEMP_Id() > max_Id)
				max_Id = t.getEMP_Id();
		}
		nProceso.setPRO_Id(max_Id + 1);
		arrProceso.add(nProceso);
		return true;
	}

	@Override
	public boolean update(Proceso uProceso, int pRO_Id) {
		for(Proceso t : arrProceso) {
			if(t.getPRO_Id() == pRO_Id) {
				t.setPRO_Nom(uProceso.getPRO_Nom());
				t.setEMP_Id(uProceso.getEMP_Id());
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean delete(int pRO_Id) {
		for(int i = 0; i < arrProceso.size(); i++) {
			if(arrProceso.get(i).getPRO_Id() == pRO_Id) {
				arrProceso.remove(i);
				return true;
			}
		}
		return false;
	}
	
	
	
	

}
