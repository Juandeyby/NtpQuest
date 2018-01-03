package model;

import org.junit.Test;
import org.junit.Assert;

public class MockupTest {
	
	@Test
	public void getEmpresaById(){
		IEmpresaDao iempdao = IEmpresaDao.getInstance();
		Assert.assertNotNull(iempdao.getById(1));
		Assert.assertNull(iempdao.getById(6));
	}
	
	@Test
	public void getEmpresaByNom(){
		IEmpresaDao iempdao = IEmpresaDao.getInstance();
		Assert.assertEquals(5, iempdao.getByNom("Empresa").size());
		Assert.assertEquals(0, iempdao.getByNom("abcde").size());
	}
	
	@Test
	public void insertEmpresa(){
		IEmpresaDao iempdao = IEmpresaDao.getInstance();
		Assert.assertTrue(iempdao.insert(new Empresa("prueba", "prueba", "prueba", "prueba", 'a')));
		Assert.assertFalse(iempdao.insert(new Empresa("prueba", "prueba", "prueba", "prueba", 'a')));
	}
	
	@Test
	public void updateEmpresa(){
		IEmpresaDao iempdao = IEmpresaDao.getInstance();
		Assert.assertTrue(iempdao.update(new Empresa("prueba", "prueba", "prueba", "prueba", 'a'), 1));
		Assert.assertFalse(iempdao.update(new Empresa("prueba", "prueba", "prueba", "prueba", 'a'), 7));
	}
	
	@Test
	public void deleteEmpresa(){
		IEmpresaDao iempdao = IEmpresaDao.getInstance();
		Assert.assertTrue(iempdao.delete(6));
		Assert.assertFalse(iempdao.delete(7));
	}
	
	@Test
	public void getProcesoById(){
		IProcesoDao iprodao = IProcesoDao.getInstance();
		Assert.assertNotNull(iprodao.getById(1));
		Assert.assertNull(iprodao.getById(6));
	}
	
	@Test
	public void getProcesoByNom(){
		IProcesoDao iprodao = IProcesoDao.getInstance();
		Assert.assertEquals(4, iprodao.getByNom("Proceso").size());
		Assert.assertEquals(0, iprodao.getByNom("abcde").size());
	}
	
	@Test
	public void insertProceso(){
		IProcesoDao iprodao = IProcesoDao.getInstance();
		Assert.assertTrue(iprodao.insert(new Proceso("prueba", 1)));
	}
	
	@Test
	public void updateProceso(){
		IProcesoDao iprodao = IProcesoDao.getInstance();
		Assert.assertTrue(iprodao.update(new Proceso("prueba", 1), 1));
		Assert.assertFalse(iprodao.update(new Proceso("prueba", 1), 7));
	}
	
	@Test
	public void deleteProceso(){
		IProcesoDao iprodao = IProcesoDao.getInstance();
		Assert.assertTrue(iprodao.delete(5));
		Assert.assertFalse(iprodao.delete(7));
	}
	

}
