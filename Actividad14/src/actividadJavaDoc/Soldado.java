package actividadJavaDoc;

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
	 * Metodo booleano que establece un condicional que determina si la referencia
	 * del numero de balas, "this.numeroBalas", es mayor que 0 o no. 
	 * 
	 * @return retornará <b>true</b> si y solo si la referencia "this.numeroBalas" 
	 * es mayor que 0, si la referencia es menor o igual que 0 retornará <b>false</b>.
	 */
	public boolean puedeDisparar() {

		if (this.numeroBalas > 0) {
			return true;
		}
		return false;
	}
	
	/**
	 * Metodo con un objeto "sol" pasado por parametro que determina que cada vez que
	 * se ejecute este metodo, el valor de la referencia "this.numeroBalas" se le 
	 * restará uno para luego establecer que el objeto pasado por parametro apuntando
	 * al atributo "estaMuerto" le establezca el valor <b>true</b>.
	 * 
	 * @param sol objeto pasado por parametro de la clase "Soldado".
	 */
	public void disparar(Soldado sol) {
		this.numeroBalas--;
		sol.estaMuerto = true;
	}

}
