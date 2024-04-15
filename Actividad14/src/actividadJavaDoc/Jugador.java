package actividadJavaDoc;

/**
 * Clase que representa un Jugador con tres atributos "dorsal", "numeroTarjetasAmarillas", "numeroTarjetasRojas"
 */
public class Jugador {

	private int dorsal;
	private int numeroTarjetasAmarillas;
	private int numeroTarjetasRojas;

	//Crear los métodos “get” y “set” de los atributos cuando se vayan a hacer las pruebas 
	//y la documentación. Aquí no se han creado porque no aportan nada
	
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
	 * Metodo que hace la funcion de poner Dorsal al jugador
	 * Verifica si el dorsal es mayor o igual a 1 y menor o igual a 30, se le designa el dorsal pasado por 
	 * parametro, caso contrario el dorsal sera -1
	 * @param dorsal Representa el dorsal que queremos designar
	 */

	public void ponerDorsal(int dorsal) {
		if (dorsal >= 1 && dorsal <= 30) {
			this.dorsal = dorsal;
		} else {
			this.dorsal = -1;
		}
	}
	
/**
 * Metodo que devuelve si esta expulsado
 * Primero designa que no esta expulsado, luego condiciona que
 * si el "numeroTarjetasAmarillas" es igual a 2 o si el "numeroTarjetasRojas" 
 * es igual a 1, el jugador será expulsado
 * @return true si el juegador esta expulsado, false si no esta expulsado
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