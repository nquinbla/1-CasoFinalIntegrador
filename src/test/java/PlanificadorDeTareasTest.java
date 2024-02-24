import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PlanificadorDeTareasTest {

    @Test
    public void testComunicar() {
        PlanificadorDeTareas planificadorDeTareas = new PlanificadorDeTareas();
        // Asegúrate de que el método planificar() exista en la clase PlanificadorDeTareas
        assertEquals("Hola, soy un planificador de tareas", planificadorDeTareas.planificar());
    }
}