import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RecursosYSuministrosTest {

    @Test
    public void testComunicar() {
        RecursosYSuministros recursosYSuministros = new RecursosYSuministros();
        // Asegúrate de que el método comunicar() exista en la clase RecursosYSuministros
        assertEquals("Hola, soy un recurso y suministro", recursosYSuministros.comunicar());
    }
}
