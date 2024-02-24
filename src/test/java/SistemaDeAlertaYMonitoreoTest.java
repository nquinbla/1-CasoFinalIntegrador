import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SistemaDeAlertaYMonitoreoTest {

    @Test
    public void testAlertar() {
        SistemaDeAlertaYMonitoreo sistemaDeAlertaYMonitoreo = new SistemaDeAlertaYMonitoreo();
        // Asegúrate de que el método alertar() exista en la clase SistemaDeAlertaYMonitoreo
        assertEquals("Alerta", sistemaDeAlertaYMonitoreo.alertar());
    }
}
