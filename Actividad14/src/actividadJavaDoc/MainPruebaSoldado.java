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

	}
}
