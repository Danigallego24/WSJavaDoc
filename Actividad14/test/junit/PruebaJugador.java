package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import actividadJavaDoc.Jugador;

class PruebaJugador {

	@Test
	public void testPonerDorsal1() {
		Jugador j1 = new Jugador();
		int resultadoEsperado = -1;
		int dorsal = j1.getDorsal();
		j1.ponerDorsal(dorsal);
		int resultadoObtenido = j1.getDorsal();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	public void testPonerDorsal2() {
		Jugador j1 = new Jugador();
		int resultadoEsperado = 10;
		int dorsal = 10;
		j1.ponerDorsal(dorsal);
		int resultadoObtenido = j1.getDorsal();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	public void testPonerDorsal3() {
		Jugador j1 = new Jugador();
		int resultadoEsperado = -1;
		int dorsal = 31;
		j1.ponerDorsal(dorsal);
		int resultadoObtenido = j1.getDorsal();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test 
	public void testEstaExpulsado1() {
		Jugador j1 = new Jugador();
		j1.setNumeroTarjetasAmarillas(0);
		j1.setNumeroTarjetasRojas(1);
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = j1.estaExpulsado();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	public void testEstaExpulsado2() {
		Jugador j1 = new Jugador();
		j1.setNumeroTarjetasAmarillas(2);
		j1.setNumeroTarjetasRojas(0);
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = j1.estaExpulsado();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	public void testEstaExpulsado3() {
		Jugador j1 = new Jugador();
		j1.setNumeroTarjetasAmarillas(40);
		j1.setNumeroTarjetasRojas(20);
		boolean resultadoEsperado = false;
		boolean resultadoObtenido = j1.estaExpulsado();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
}
