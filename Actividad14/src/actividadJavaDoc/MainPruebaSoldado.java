package actividadJavaDoc;

public class MainPruebaSoldado {

	public static void main(String[] args) {
		

		System.out.println("------------------Luis--------------------");
		//Vamos a probar la clase soldado, definiendo su 
		//bateria de pruebas y ejecutando sus métodos
		
		//Método disparar()
		//Vamos a hacer dos pruebas para este método
		
		//Prueba 1
		//this.numeroBalas = 1
		//Resultado esperado = 0
		//sol.estaMuerto() = false
		//Resultado esperado = true
		
		//Ejecutamos la prueba 1
		Soldado soldadoQueDispara1 = new Soldado();
		Soldado soldadoDisparado1 = new Soldado();
		soldadoQueDispara1.setNumeroBalas(1);
		int resultadoEsperadoBalas = 0;
		soldadoDisparado1.setEstaMuerto(false);
		boolean resultadoEsperadoMuerto = true;
		soldadoQueDispara1.disparar(soldadoDisparado1);
		
		if(resultadoEsperadoMuerto == soldadoDisparado1.isEstaMuerto() && resultadoEsperadoBalas == soldadoQueDispara1.getNumeroBalas()) {
			System.out.println("disparar() Prueba 1 -> OK");
		}else {
			System.out.println("disparar() Prueba 1  -> KO");
		}
		
		
		//Prueba 2
		//this.numeroBalas = -7
		//Resultado esperado = -8
		//sol.estaMuerto() = true
		//Resultado esperado = true
	
		//Ejecutamos la prueba 2
		Soldado soldadoQueDispara2 = new Soldado();
		Soldado soldadoDisparado2 = new Soldado();
		soldadoQueDispara2.setNumeroBalas(-7);
		resultadoEsperadoBalas = -8;
		soldadoDisparado2.setEstaMuerto(true);
		resultadoEsperadoMuerto = true;
		soldadoQueDispara2.disparar(soldadoDisparado2);
		
		if(resultadoEsperadoMuerto == soldadoDisparado2.isEstaMuerto() && resultadoEsperadoBalas == soldadoQueDispara2.getNumeroBalas()) {
			System.out.println("disparar() Prueba 2 -> OK");
		}else {
			System.out.println("disparar() Prueba 2  -> KO");
		}
		
		//Metodo puedeDisparar()
		//Vamos a hacer 2 pruebas 
		
		//Prueba 1 
		//numeroBalas = 5
		//Resultado esperado = true
		
		//Ejecutamos la prueba 1
		Soldado s1 = new Soldado();
		s1.setNumeroBalas(5);
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = s1.puedeDisparar();
		
		if(resultadoObtenido == resultadoEsperado) {
			System.out.println("puedeDisparar() Prueba 1 -> OK");
		}else {
			System.out.println("puedeDisparar() Prueba 1  -> KO");
		}
		
		//Prueba 2
		//numeroBalas = 0
		//Resultado esperado = false
		
		//Ejecutamos la prueba 2
		Soldado s2 = new Soldado();
		s2.setNumeroBalas(0);
		resultadoEsperado = false;
		resultadoObtenido = s2.puedeDisparar();
		
		if(resultadoObtenido == resultadoEsperado) {
			System.out.println("puedeDisparar() Prueba 1 -> OK");
		}else {
			System.out.println("puedeDisparar() Prueba 1  -> KO");
		}
		
		System.out.println("------------------Fin Luis--------------------");

		System.out.println("-------------------Mauricio-------------------");
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
		System.out.println("-------------------Fin Mauricio-------------------");


	}
}
