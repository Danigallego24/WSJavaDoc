package junit;
import actividadJavaDoc.Soldado;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainPruebaSoldadoTest {
	//-------------------------MAURI--------------------------------------
    @Test
    public void testPuedeDisparar_conBalas_true() {
        Soldado soldado = new Soldado();
        soldado.setNumeroBalas(5);
        assertTrue(soldado.puedeDisparar());
    }

    @Test
    public void testPuedeDisparar_sinBalas_false() {
        Soldado soldado = new Soldado();
        soldado.setNumeroBalas(0);
        assertFalse(soldado.puedeDisparar());
    }

    @Test
    public void testPuedeDisparar_balasNegativas_false() {
        Soldado soldado = new Soldado();
        soldado.setNumeroBalas(-3);
        assertFalse(soldado.puedeDisparar());
    }

    @Test
    public void testDisparar_soldadoConBalas_disparoCorrecto() {
        Soldado soldadoConBalas = new Soldado();
        soldadoConBalas.setNumeroBalas(3);
        Soldado soldadoSinBalas = new Soldado();
        soldadoConBalas.disparar(soldadoSinBalas);
        assertEquals(2, soldadoConBalas.getNumeroBalas());
        assertTrue(soldadoSinBalas.isEstaMuerto());
    }

    @Test
    public void testDisparar_soldadoConBalasAotroSoldadoConBalas_disparoCorrecto() {
        Soldado soldadoConBalas1 = new Soldado();
        soldadoConBalas1.setNumeroBalas(2);
        Soldado soldadoConBalas2 = new Soldado();
        soldadoConBalas2.setNumeroBalas(1);
        soldadoConBalas1.disparar(soldadoConBalas2);
        assertEquals(1, soldadoConBalas1.getNumeroBalas());
        assertTrue(soldadoConBalas2.isEstaMuerto());
    }

    @Test
    public void testDisparar_soldadoSinBalas_noDispara() {
        Soldado soldadoSinBalas = new Soldado();
        Soldado soldadoConBalas = new Soldado();
        soldadoConBalas.setNumeroBalas(0); 
        soldadoConBalas.disparar(soldadoSinBalas); 
        assertEquals(0, soldadoSinBalas.getNumeroBalas()); 
        assertTrue(soldadoSinBalas.isEstaMuerto()); 
    }
}
//-------------------------FIN-MAURI--------------------------------------
