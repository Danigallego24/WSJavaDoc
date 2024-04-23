package actividadJavaDoc;

public class MainPruebaJugador {

	public static void main(String[] args) {
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
	}
}
