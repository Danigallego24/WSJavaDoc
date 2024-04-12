package actividadJavaDoc;

public class Soldado {

	private boolean estaMuerto;

	private int numeroBalas;

	// Crear los métodos “get” y “set” de los atributos cuando se vayan a hacer las
	// pruebas y la documentación.
	
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