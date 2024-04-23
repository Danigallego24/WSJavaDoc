package actividadJavaDoc;

public class MainPruebaSoldado {

	public static void main(String[] args) {
		
		System.out.println("Pruebas para el método puedeDisparar():");

		// Prueba 1: Soldado con balas puede disparar
		// numBalas = 5
		// resultadoEsperado = true
		Soldado numBalas = new Soldado();
		numBalas.setNumeroBalas(5);
		if (numBalas.puedeDisparar()) {
			System.out.println("1. El soldado con balas puede disparar -> OK");
		} else {
			System.out.println("1. El soldado con balas no puede disparar -> KO");
		}

		// Prueba 2: Soldado sin balas no puede disparar
		// numBalas = 0
		// resultadoEsperado = false
		Soldado soldadoSinBalas = new Soldado();
		soldadoSinBalas.setNumeroBalas(0);
		if (!soldadoSinBalas.puedeDisparar()) {
			System.out.println("2. El soldado sin balas no puede disparar -> OK");
		} else {
			System.out.println("2. El soldado sin balas puede disparar -> KO");
		}

		// Prueba 3: Soldado con balas negativas no puede disparar
		// numBalas = -3
		// resultadoEsperado = false
		Soldado soldadoBalasNegativas = new Soldado();
		soldadoBalasNegativas.setNumeroBalas(-3);
		if (!soldadoBalasNegativas.puedeDisparar()) {
			System.out.println("3. El soldado con balas negativas no puede disparar -> OK");
		} else {
			System.out.println("3. El soldado con balas negativas puede disparar -> KO");
		}

		// *****************************************************************

		
		System.out.println("\nPruebas para el método disparar():");

		// Prueba 4: Soldado con balas dispara a soldado sin balas
		// numBalas = 3
		// resultadoEsperado = true
		Soldado soldadoConBalas1 = new Soldado();
		soldadoConBalas1.setNumeroBalas(3);
		Soldado soldadoSinBalas1 = new Soldado();
		soldadoConBalas1.disparar(soldadoSinBalas1);
		if (soldadoConBalas1.getNumeroBalas() == 2 && soldadoSinBalas1.isEstaMuerto()) {
			System.out.println("4. El soldado con balas ha disparado correctamente -> OK");
		} else {
			System.out.println("4. Error al disparar -> KO");
		}

		// Prueba 5: Soldado con balas dispara a otro soldado con balas
		//soldado2 = 2
		//soldado3 = 3
        //resultadoEsperado = true
		Soldado soldadoConBalas2 = new Soldado();
		soldadoConBalas2.setNumeroBalas(2);
		Soldado soldadoConBalas3 = new Soldado();
		soldadoConBalas3.setNumeroBalas(1);
		soldadoConBalas2.disparar(soldadoConBalas3);
		if (soldadoConBalas2.getNumeroBalas() == 1 && soldadoConBalas3.isEstaMuerto()) {
			System.out.println("5. El soldado con balas ha disparado correctamente -> OK");
		} else {
			System.out.println("5. Error al disparar -> KO");
		}

		// Prueba 6: Soldado sin balas no puede disparar
		//numBalas = 0
        //resultadoEsperado = false
		Soldado soldadoSinBalas2 = new Soldado();
		Soldado soldadoConBalas4 = new Soldado();
		soldadoConBalas4.setNumeroBalas(0);
		soldadoSinBalas2.disparar(soldadoConBalas4);
		
		if (soldadoConBalas4.getNumeroBalas() == 0 && soldadoConBalas4.isEstaMuerto()) {
			System.out.println("6. El soldado sin balas no ha disparado -> OK");
		} else {
			System.out.println("6. Error al intentar disparar sin balas -> KO");
		}

	}
}
