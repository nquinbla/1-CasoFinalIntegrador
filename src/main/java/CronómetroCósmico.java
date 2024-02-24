import java.util.InputMismatchException;
import java.util.Scanner;

public class CronómetroCósmico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al Cronómetro Cósmico");

        double duracionDiaPlaneta = solicitarEntrada(scanner, "Ingrese la duración del día en el nuevo planeta (en horas): ");
        double duracionAnioPlaneta = solicitarEntrada(scanner, "Ingrese la duración del año en el nuevo planeta (en días): ");
        double tiempoTierra = solicitarEntrada(scanner, "Ingrese el tiempo en la Tierra (en días): ");

        double tiempoPlaneta = convertirTiempo(tiempoTierra, duracionDiaPlaneta, duracionAnioPlaneta);
        System.out.printf("El tiempo equivalente en el nuevo planeta es: %.2f días%n", tiempoPlaneta);

        visualizarTiempoEnFormatos(tiempoPlaneta);

        identificarLimitesDeDatos();

        scanner.close();
    }

    // Método para solicitar entrada al usuario
    private static double solicitarEntrada(Scanner scanner, String mensaje) {
        System.out.println(mensaje);
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.next(); // descarta la entrada incorrecta
            }
        }
    }

    // Método para convertir el tiempo de la Tierra al tiempo del nuevo planeta
    private static double convertirTiempo(double tiempoTierra, double duracionDiaPlaneta, double duracionAnioPlaneta) {
        double tiempoPlaneta = tiempoTierra * (duracionAnioPlaneta / 365) * duracionDiaPlaneta;
        return tiempoPlaneta;
    }

    // Método para visualizar el tiempo en diferentes formatos
    private static void visualizarTiempoEnFormatos(double tiempoPlaneta) {
        System.out.printf("Tiempo en el nuevo planeta (formato 1): %.2f días%n", tiempoPlaneta);
    }

    // Método para identificar los límites de los datos
    private static void identificarLimitesDeDatos() {
        // Implementar la lógica aquí
    }

    public String cronómetroCósmico() {
        return "Hola, soy un cronómetro cósmico";
    }

    public String alertar() {
        return "Alerta";
    }
}

