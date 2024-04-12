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
	

	//El método crea una variable llamda dorsal de tipo numérica,
	//los numeros a poner serán entre el 1 y el 30

	/**
	 * Metodo que hace la funcion de poner Dorsal al jugador
	 * Verifica si el dorsal es mayor o igual a 1 y menor o igual a 30, se le designa el dorsal pasado por 
	 * parametro, caso contrario el dorsal sera -1
	 * @param dorsal Representa el dorsal que queremos designar
	 */

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
	


	//El crea una variable llamada estaExpulsado la cual te dice
	//que si tiene 2 amarrillas está expulsado o si tiene una 
	//cartulina roja. Si no, el jugador no estaría expulsado

/**
 * Metodo que devuelve si esta expulsado
 * Primero designa que no esta expulsado, luego condiciona que
 * si el "numeroTarjetasAmarillas" es igual a 2, devuelve que sera expulsado.
 * Luego si tiene numeroTarjetasRojas es igual a 1, devuelve que sera expulsado
 * @return devuelve si el juegador esta expulsado o no, dependiendo a las tarjetas que tiene
 */

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