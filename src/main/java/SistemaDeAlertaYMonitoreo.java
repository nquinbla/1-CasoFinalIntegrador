import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaDeAlertaYMonitoreo {
    private double nivelRadiacion;
    private double temperatura;
    private double presion;
    private boolean detenerMonitoreo;

    public SistemaDeAlertaYMonitoreo() {
        this.nivelRadiacion = 0.0;
        this.temperatura = 0.0;
        this.presion = 0.0;
        this.detenerMonitoreo = false;
    }

    public void monitorear() {
        while (!detenerMonitoreo) {
            this.nivelRadiacion = Math.random() * 100;
            this.temperatura = Math.random() * 50;
            this.presion = Math.random() * 200;

            verificarAlertas();

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void detenerMonitoreo() {
        detenerMonitoreo = true;
        System.out.println("El monitoreo se ha detenido.");
    }

    public void verificarAlertas() {
        if (nivelRadiacion > 90.0) {
            System.out.println("¡Alerta! Nivel de radiación extremadamente alto: " + nivelRadiacion);
            sugerirAjustes();
        }
        if (temperatura > 40.0) {
            System.out.println("¡Alerta! Temperatura muy alta: " + temperatura);
            sugerirAjustes();
        }
        if (presion > 150.0) {
            System.out.println("¡Alerta! Presión muy alta: " + presion);
            sugerirAjustes();
        }
    }

    public void sugerirAjustes() {
        System.out.println("Se sugiere tomar medidas correctivas.");
    }

    public List<Integer> listarPrimos(int n) {
        List<Integer> primos = new ArrayList<>();
        int numero = 2;
        while (primos.size() < n) {
            if (esPrimo(numero)) {
                primos.add(numero);
            }
            numero++;
        }
        return primos;
    }

    public boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> descomponerEnPrimos(int num) {
        List<Integer> factoresPrimos = new ArrayList<>();
        int divisor = 2;
        while (num > 1) {
            if (num % divisor == 0) {
                factoresPrimos.add(divisor);
                num /= divisor;
            } else {
                divisor++;
            }
        }
        return factoresPrimos;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaDeAlertaYMonitoreo sistema = new SistemaDeAlertaYMonitoreo();

        Thread monitoreoThread = new Thread(sistema::monitorear);
        monitoreoThread.start();

        System.out.print("Ingrese la cantidad de números primos a listar: ");
        int cantidadPrimos = scanner.nextInt();
        List<Integer> primos = sistema.listarPrimos(cantidadPrimos);
        System.out.println("Los primeros " + cantidadPrimos + " números primos son: " + primos);

        System.out.print("\nIngrese un número para descomponer en factores primos: ");
        int num = scanner.nextInt();
        List<Integer> factoresPrimos = sistema.descomponerEnPrimos(num);
        System.out.println("Los factores primos de " + num + " son: " + factoresPrimos);

        System.out.print("\n¿Desea detener el monitoreo? (s/n): ");
        String respuesta = scanner.next();
        if (respuesta.equalsIgnoreCase("s")) {
            sistema.detenerMonitoreo();
        }

        scanner.close();
    }
}
