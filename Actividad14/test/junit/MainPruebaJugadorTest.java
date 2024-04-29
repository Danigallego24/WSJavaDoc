package junit;
import actividadJavaDoc.Jugador;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainPruebaJugadorTest {
	
//-------------------------MAURI--------------------------------------
    @Test
    public void testPonerDorsal_dorsalValido_correcto() {
        Jugador jugador = new Jugador();
        jugador.ponerDorsal(10);
        assertEquals(10, jugador.getDorsal());
    }

    @Test
    public void testPonerDorsal_dorsalInvalidoMenorQueUno_asignaMenosUno() {
        Jugador jugador = new Jugador();
        jugador.ponerDorsal(-5);
        assertEquals(-1, jugador.getDorsal());
    }

    @Test
    public void testPonerDorsal_dorsalInvalidoMayorQueTreinta_asignaMenosUno() {
        Jugador jugador = new Jugador();
        jugador.ponerDorsal(35);
        assertEquals(-1, jugador.getDorsal());
    }

    @Test
    public void testEstaExpulsado_sinTarjetasAmarillasNiRojas_false() {
        Jugador jugador = new Jugador();
        jugador.setNumeroTarjetasAmarillas(0);
        jugador.setNumeroTarjetasRojas(0);
        assertFalse(jugador.estaExpulsado());
    }

    @Test
    public void testEstaExpulsado_dosTarjetasAmarillas_true() {
        Jugador jugador = new Jugador();
        jugador.setNumeroTarjetasAmarillas(2);
        jugador.setNumeroTarjetasRojas(0);
        assertTrue(jugador.estaExpulsado());
    }

    @Test
    public void testEstaExpulsado_unaTarjetaRoja_true() {
        Jugador jugador = new Jugador();
        jugador.setNumeroTarjetasAmarillas(0);
        jugador.setNumeroTarjetasRojas(1);
        assertTrue(jugador.estaExpulsado());
    }
}
//-------------------------FIN-MAURI--------------------------------------