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

		
		
		System.out.println("-------------------Mauricio-------------------");

		// Pruebas para el método ponerDorsal()
		System.out.println("Pruebas para el método ponerDorsal():");

		// Prueba 1: Dorsal válido (entre 1 y 30)
		// dorsal = 10
		// resultadoEsperado = true
		Jugador jugador1 = new Jugador();
		jugador1.ponerDorsal(10);
		if (jugador1.getDorsal() == 10) {
			System.out.println("1. Se ha asignado correctamente el dorsal -> OK");
		} else {
			System.out.println("1. Error al asignar el dorsal -> KO");
		}

		// Prueba 2: Dorsal inválido (menor que 1)
		// dorsal = -5
		// resultadoEsperado = true
		Jugador jugador2 = new Jugador();
		jugador2.ponerDorsal(-5);
		if (jugador2.getDorsal() == -1) {
			System.out.println("2. Se ha asignado correctamente -1 al dorsal -> OK");
		} else {
			System.out.println("2. Error al asignar -1 al dorsal inválido -> KO");
		}

		// Prueba 3: Dorsal inválido (mayor que 30)
		// dorsal = 35
		// resultadoEsperado = true
		Jugador jugador3 = new Jugador();
		jugador3.ponerDorsal(35);
		if (jugador3.getDorsal() == -1) {
			System.out.println("3. Se ha asignado correctamente -1 al dorsal -> OK");
		} else {
			System.out.println("3. Error al asignar -1 al dorsal inválido -> KO");
		}
		
		//*********************************************************
		System.out.println();
		System.out.println("Pruebas para el método estaExpulsado():");

		// Prueba 4: Jugador no está expulsado (sin tarjetas)
		// tarjetasAmarillas = 0
		// tarjetasRojas = 0
		// ResultadoEsperado = false
		Jugador jugador4 = new Jugador();
		jugador4.setNumeroTarjetasAmarillas(0);
		jugador4.setNumeroTarjetasRojas(0);
		if (!jugador4.estaExpulsado()) {
			System.out.println("4. El jugador no está expulsado -> OK");
		} else {
			System.out.println("4. Error al verificar si el jugador está expulsado -> KO");
		}

		// Prueba 5: Jugador expulsado por dos tarjetas amarillas
		// tarjetasAmarillas = 2
		// tarjetasRojas = 0
		// ResultadoEsperado = true
		Jugador jugador5 = new Jugador();
		jugador5.setNumeroTarjetasAmarillas(2);
		jugador5.setNumeroTarjetasRojas(0);
		if (jugador5.estaExpulsado()) {
			System.out.println("5. El jugador está expulsado por dos tarjetas amarillas -> OK");
		} else {
			System.out.println("5. Error al verificar si el jugador está expulsado -> KO");
		}

		// Prueba 6: Jugador expulsado por una tarjeta roja
		// tarjetasAmarillas = 0
		// tarjetasRojas = 1
		// ResultadoEsperado = true
		Jugador jugador6 = new Jugador();
		jugador6.setNumeroTarjetasAmarillas(0);
		jugador6.setNumeroTarjetasRojas(1);
		if (jugador6.estaExpulsado()) {
			System.out.println("6. El jugador está expulsado por una tarjeta roja -> OK");
		} else {
			System.out.println("6. Error al verificar si el jugador está expulsado -> KO");
		}
		System.out.println("-------------------Fin Mauricio-------------------");

	}
}
