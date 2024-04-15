package actividadJavaDoc;

/**
 * Clase que representa dos atributos estaMuerto y numeroBalas
 * 
 * @author Felix
 * @version 1.0
 */
public class Soldado {

	/**
	 * Atributo booleano que determina si el soldado esta muerto o no.
	 */
	private boolean estaMuerto;

	/**
	 * Atributo de valor entero que determina el numero de balas
	 */

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


	/**
	 * Método que hace disparar al soldado contra otro soldado introducido por
	 * parametro. Al disparar pierde una bala del atributo "numeroBalas" y el
	 * atributo "estaMuerto" del soldado introducido parametro es "True".
	 * 
	 * @param sol Soldado que es disparado
	 */
	public void disparar(Soldado sol) {

		this.numeroBalas--;

		sol.estaMuerto = true;

	}

	/**
	 * Método que devuelve si un soldado puedo disparar. El soldado puede disparar
	 * si su número de balas es mayor a 0, de caso contrario no podrá disparar.
	 * 
	 * @return "True" si puede disparar, "False" si no puede disparar
	 */
	public boolean puedeDisparar() {

		if (this.numeroBalas > 0) {
			return true;
		}
		return false;
	}
	// Crea la variable disparar al soldado sol, lo que
	// hace es ir reduciendo el número de balas y saber
	// si sol esta muerto


}
