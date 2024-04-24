package actividadJavaDoc;

public class MainPruebaJugador {

	public static void main(String[] args) {
		
		System.out.println("------------------Luis--------------------");

		//Vamos a probar la clase jugador, definiendo su 
		//bateria de pruebas y ejecutando sus métodos
		
		//Método ponerDorsal()
		//Vamos a hacer tres pruebas para este método
		
		//Prueba 1
		//dorsal = 0
		//Resultado esperado = -1
		
		//Ejecutamos la prueba 1
		Jugador j1 = new Jugador();
		int resultadoEsperado = -1;
		int dorsal = j1.getDorsal();
		j1.ponerDorsal(dorsal);
		int resultadoObtenido = j1.getDorsal();
		
		if(resultadoEsperado == resultadoObtenido) {
			System.out.println("ponerDorsal() Prueba 1 -> OK");
		}else {
			System.out.println("ponerDorsal() Prueba 1 -> KO");
		}
		
		//Prueba 2
		//dorsal = 10
		//Resultado esperado = 10
		
		//Ejecutamos la prueba 2
		Jugador j2 = new Jugador();
		resultadoEsperado = 10;
		dorsal = 10;
		j2.ponerDorsal(dorsal);
		resultadoObtenido = j2.getDorsal();
		
		if(resultadoEsperado == resultadoObtenido) {
			System.out.println("ponerDorsal() Prueba 2 -> OK");
		}else {
			System.out.println("ponerDorsal() Prueba 2 -> KO");
		}
				

		//Prueba 3
		//dorsal = 31
		//Resultado esperado = -1
		
		//Ejecutamos la prueba 3
		Jugador j3 = new Jugador();
		resultadoEsperado = -1;
		dorsal = 31;
		j3.ponerDorsal(dorsal);
		resultadoObtenido = j3.getDorsal();
		
		if(resultadoEsperado == resultadoObtenido) {
			System.out.println("ponerDorsal() Prueba 3 -> OK");
		}else {
			System.out.println("ponerDorsal() Prueba 3 -> KO");
		}
		
		//Método estaExpulsado()
		//Vamos a hacer tres pruebas para este método
		
		//Prueba 1 
		//numeroTarjetasAmarillas = 0
		//numeroTarjetasRojas = 1
		//Resultado esperado = true
		j1 = new Jugador();
		j1.setNumeroTarjetasAmarillas(0);
		j1.setNumeroTarjetasRojas(1);
		boolean resultadoEsperado2 = true;
		boolean resultadoObtenido2 = j1.estaExpulsado();
		
		if(resultadoEsperado2 == resultadoObtenido2 ) {
			System.out.println("estaExpulsado() Prueba 1 -> OK");
		}else {
			System.out.println("estaExpulsado() Prueba 1 -> OK");
		}
		
		//Prueba 2 
		//numeroTarjetasAmarillas = 2
		//numeroTarjetasRojas = 0
		//Resultado Esperado = true
		
		j2 = new Jugador();
		j2.setNumeroTarjetasAmarillas(2);
		j2.setNumeroTarjetasRojas(0);
		resultadoEsperado2 = true;
		resultadoObtenido2 = j2.estaExpulsado();
		
		if(resultadoEsperado2 == resultadoObtenido2 ) {
			System.out.println("estaExpulsado() Prueba 2 -> OK");
		}else {
			System.out.println("estaExpulsado() Prueba 2 -> OK");
		}
		
		//Prueba 3 
		//numeroTarjetasAmarillas = 40
		//numeroTarjetasRojas = 20
		//Resultado esperado = false
		
		j3 = new Jugador();
		j3.setNumeroTarjetasAmarillas(40);
		j3.setNumeroTarjetasRojas(20);
		resultadoEsperado2 = false;
		resultadoObtenido2 = j3.estaExpulsado();
		
		if(resultadoEsperado2 == resultadoObtenido2 ) {
			System.out.println("estaExpulsado() Prueba 1 -> OK");
		}else {
			System.out.println("estaExpulsado() Prueba 1 -> OK");
		}
		
		System.out.println("------------------Fin Luis--------------------");

		
		
	}

}
