import java.util.Scanner;
import java.util.Arrays;

public class RecursosYSuministros {
    private int[] consumoAgua;
    private int[] consumoComida;
    private int[] consumoOxigeno;

    public RecursosYSuministros(int dias) {
        consumoAgua = new int[dias];
        consumoComida = new int[dias];
        consumoOxigeno = new int[dias];
    }

    public void registrarConsumo(int dia, int agua, int comida, int oxigeno) {
        consumoAgua[dia - 1] = agua;
        consumoComida[dia - 1] = comida;
        consumoOxigeno[dia - 1] = oxigeno;
    }

    public double calcularMedia(int[] consumo) {
        int suma = 0;
        for (int valor : consumo) {
            suma += valor;
        }
        return (double) suma / consumo.length;
    }

    public int calcularMinimo(int[] consumo) {
        int minimo = consumo[0];
        for (int valor : consumo) {
            if (valor < minimo) {
                minimo = valor;
            }
        }
        return minimo;
    }

    public int calcularMaximo(int[] consumo) {
        int maximo = consumo[0];
        for (int valor : consumo) {
            if (valor > maximo) {
                maximo = valor;
            }
        }
        return maximo;
    }

    public int[] proyeccionConsumo(int[] consumo, int periodo) {
        int[] proyeccion = new int[consumo.length / periodo];
        for (int i = 0; i < proyeccion.length; i++) {
            int suma = 0;
            for (int j = 0; j < periodo; j++) {
                suma += consumo[i * periodo + j];
            }
            proyeccion[i] = suma;
        }
        return proyeccion;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la duración del periodo (en días): ");
        int dias = scanner.nextInt();

        RecursosYSuministros rs = new RecursosYSuministros(dias);

        for (int i = 1; i <= dias; i++) {
            System.out.println("Día " + i);
            System.out.print("Consumo de agua: ");
            int agua = scanner.nextInt();
            System.out.print("Consumo de comida: ");
            int comida = scanner.nextInt();
            System.out.print("Consumo de oxígeno: ");
            int oxigeno = scanner.nextInt();

            rs.registrarConsumo(i, agua, comida, oxigeno);
        }

        System.out.println("\nEstadísticas del consumo:");
        System.out.println("Consumo de agua:");
        System.out.println("Media: " + rs.calcularMedia(rs.consumoAgua));
        System.out.println("Mínimo: " + rs.calcularMinimo(rs.consumoAgua));
        System.out.println("Máximo: " + rs.calcularMaximo(rs.consumoAgua));

        scanner.close();
    }
}
