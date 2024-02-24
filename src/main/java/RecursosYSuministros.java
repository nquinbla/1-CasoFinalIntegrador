import java.util.Scanner;

// Como resultado, el programa deberá mostrar las estadísticas de uso de recursos, y alertar si alguno de los recursos está por debajo de un umbral seguro.

public class RecursosYSuministros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Gestor de Recursos");
        System.out.println("Ingrese el nivel inicial de agua (en litros): ");
        double nivelAgua = scanner.nextDouble();

        System.out.println("Ingrese el nivel inicial de alimentos (en kilogramos): ");
        double nivelAlimentos = scanner.nextDouble();

        System.out.println("Ingrese el nivel inicial de oxígeno (02): ");
        double nivelOxigeno = scanner.nextDouble();

        double[] proyeccionAgua = calcularProyeccionDeRecursos(nivelAgua, 5); // Proyección para los próximos 5 días
        double[] proyeccionAlimentos = calcularProyeccionDeRecursos(nivelAlimentos, 5);
        double[] proyeccionOxigeno = calcularProyeccionDeRecursos(nivelOxigeno, 5);

        verificarNivelesSeguros(proyeccionAgua, proyeccionAlimentos, proyeccionOxigeno);

        mostrarEstadisticas(proyeccionAgua, proyeccionAlimentos , proyeccionOxigeno);

        scanner.close();
    }

    private static double[] calcularProyeccionDeRecursos(double nivelInicial, int dias) {
        double[] proyeccion = new double[dias];
        for (int i = 0; i < dias; i++) {
            proyeccion[i] = nivelInicial - (i + 1) * 2; // Consumo de 2 unidades por día
        }
        return proyeccion;
    }

    private static void verificarNivelesSeguros(double[] proyeccionAgua, double[] proyeccionAlimentos, double[] proyeccionOxigeno) {

        double umbralAgua = 10;
        double umbralAlimentos = 5;
        double umbralOxigeno = 10;


        for (int i = 0; i < proyeccionAgua.length; i++) {
            if (proyeccionAgua[i] < umbralAgua) {
                System.out.println("¡Alerta! Nivel de agua bajo el umbral seguro en el día " + (i + 1));
            }

            if (proyeccionAlimentos[i] < umbralAlimentos) {
                System.out.println("¡Alerta! Nivel de alimentos bajo el umbral seguro en el día " + (i + 1));
            }
            if (proyeccionOxigeno[i] < umbralOxigeno) {
                System.out.println("¡Alerta! Nivel de oxígeno bajo el umbral seguro en el día " + (i + 1));
            }
        }
    }

    private static void mostrarEstadisticas(double[] proyeccionAgua, double[] proyeccionAlimentos, double[] proyeccionOxigeno) {
        System.out.println("\nEstadísticas de uso de recursos:");
        System.out.println("Día\tAgua (litros)\tAlimentos (kg)\tOxígeno (O2)");

        for (int i = 0; i < proyeccionAgua.length; i++) {
            System.out.println((i + 1) + "\t" + proyeccionAgua[i] + "\t\t" + proyeccionAlimentos[i] + "\t\t" + proyeccionOxigeno[i]);
        }
    }
}