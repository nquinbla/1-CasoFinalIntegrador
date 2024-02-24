import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NavegadorEstelarTest {

    @Test
    public void NavegadorEstelar() {
        NavegadorEstelar navegador = new NavegadorEstelar(new int[][]{
                {0, 1, 0, 0, 0},
                {0, 1, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 1, 1},
                {0, 0, 0, 0, 0}
        });
        // Asegúrate de que el método comunicar() exista en la clase NavegadorEstelar
        assertEquals("Hola, soy un navegador estelar", navegador.comunicar());
    }
}