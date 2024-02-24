import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ComunicadorInterplanetarioTest {

    @Test
    public void testComunicar() {
        ComunicadorInterplanetario comunicadorInterplanetario = new ComunicadorInterplanetario();
        // Asegúrate de que el método comunicar() exista en la clase ComunicadorInterplanetario
        assertEquals("Hola, soy un comunicador interplanetario", comunicadorInterplanetario.comunicar());
    }
}