package actividadJavaDoc;

public class Jugador {

	private int dorsal;

	private int numeroTarjetasAmarillas;

	private int numeroTarjetasRojas;

	//Crear los métodos “get” y “set” de los atributos cuando se vayan a hacer las
	//pruebas y la documentación.

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getNumeroTarjetasAmarillas() {
		return numeroTarjetasAmarillas;
	}

	public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
	}

	public int getNumeroTarjetasRojas() {
		return numeroTarjetasRojas;
	}

	public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}

	/**
	 * Metodo que hace que el jugador se ponga un dorsal pasado por parametro. Si el número 
	 * del dorsal está entre 1 y 30, se pone el dorsal, de lo contrario el valor del dorsal será 
	 * -1
	 * 
	 * @param dorsal
	 */

	public void ponerDorsal(int dorsal) {

		if (dorsal >= 1 && dorsal <= 30) {

			this.dorsal = dorsal;

		} else {

			this.dorsal = -1;

		}

	}

	/**
	 * Metodo que devuelve si un jugador ha sido expulsado. Si el jugador tiene 2 tarjetas amarillas
	 * o una tarjeta, está expulsado, de lo contrario, no será expulsado.
	 * 
	 * @return "True" si ha sido expulsado, "False" si no ha sido expulsado
	 */
	
	public boolean estaExpulsado() {

		boolean expulsado = false;

		if (numeroTarjetasAmarillas == 2) {

			expulsado = true;

		}

		if (numeroTarjetasRojas == 1) {

			expulsado = true;

		}

		return expulsado;

	}

}