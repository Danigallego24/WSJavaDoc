package actividadJavaDoc;

/**
 *Clase que representa dos atributos estaMuerto y numeroBalas
 *@author Felix
 *@version 1.0
 */
public class Soldado {
	
	private boolean estaMuerto;
	private int numeroBalas;

	// Crear los métodos “get” y “set” de los atributos cuando se vayan a hacer las
	// pruebas y la documentación. Aquí no se han creado porque no aportan nada

	
	public boolean isEstaMuerto() {
		return estaMuerto;
	}

	
	public void setEstaMuerto(boolean estaMuerto) {
		this.estaMuerto = estaMuerto;
	}

	
	public int getNumeroBalas() {
		return numeroBalas;
	}

	public void setNumeroBalas(int numeroBalas) {
		this.numeroBalas = numeroBalas;
	}
	

	//Crea una variable llamada puedeDisparar, la cual
	//te dice que si el numero de balas es mayor que 
	// 0 puede disparar, en cambio si tiene menos no
	
	/**
	 * Metodo que hace la funcion de disparar
	 * Verifica el numero de balas y lo disminuye y a continuacion 
	 * el soldado esta muerto
	 * @param sol Representa el otro soldado dado de alta
	 */

	/**
	 * Método que hace disparar al soldado contra otro soldado introducido por parametro. Al 
	 * disparar pierde una bala del atributo "numeroBalas" y el atributo "estaMuerto" del soldado introducido 
	 * parametro es "True".
	 * 
	 * @param sol Soldado que es disparado 
	 */
	public void disparar(Soldado sol) {

		this.numeroBalas--;

		sol.estaMuerto = true;

	}
	/**
	 * Metodo que verifica si puede disparar
	 * Puede disparar si el "numeroBlas" es mayor a 0, si es asi, devuelve true
	 * caso contrario devuelve false
 	 * @return devuelve true o false, dependiendo si tiene balas o no
	/**
	 * Método que devuelve si un soldado puedo disparar. El soldado puede disparar si su 
	 * número de balas es mayor a 0, de caso contrario no podrá disparar.
	 * 
	 * @return "True" si puede disparar, "False" si no puede disparar
	 */
	public boolean puedeDisparar() {

		if (this.numeroBalas > 0) {
			return true;
		}
		return false;
	}
	

}