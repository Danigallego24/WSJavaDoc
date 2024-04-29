package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import actividadJavaDoc.Soldado;

class PruebaSoldado {

	@Test
	public void testDisparar1() {
		Soldado soldadoQueDispara = new Soldado();
		Soldado soldadoDisparado = new Soldado();
		soldadoQueDispara.setNumeroBalas(1);
		int resultadoEsperado = 0;
		soldadoDisparado.setEstaMuerto(false);
		boolean resultadoEsperadoMuerto = true;
		soldadoQueDispara.disparar(soldadoDisparado);
		
		assertEquals(resultadoEsperadoMuerto, soldadoDisparado.isEstaMuerto() && resultadoEsperado ==soldadoQueDispara.getNumeroBalas());
	}
	@Test
	public void testDisparar2() {
		Soldado soldadoQueDispara = new Soldado();
		Soldado soldadoDisparado = new Soldado();
		soldadoQueDispara.setNumeroBalas(-7);
		int resultadoEsperado = -8;
		soldadoDisparado.setEstaMuerto(true);
		boolean resultadoEsperadoMuerto = true;
		soldadoQueDispara.disparar(soldadoDisparado);
		
		assertEquals(resultadoEsperadoMuerto, soldadoDisparado.isEstaMuerto() && resultadoEsperado ==soldadoQueDispara.getNumeroBalas());
	}
	
	@Test
	public void testPuedeDispararPositivo() {
		Soldado s1 = new Soldado();
		s1.setNumeroBalas(5);
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = s1.puedeDisparar();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test 
	public void testPuedeDispararNegativo() {
		Soldado s2 = new Soldado();
		s2.setNumeroBalas(-1);
		boolean resultadoEsperado = false;
		boolean resultadoObtenido = s2.puedeDisparar();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
}
