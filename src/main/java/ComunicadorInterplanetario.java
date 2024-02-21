import java.util.Scanner;
import java.util.Set;

public class ComunicadorInterplanetario {
    private static final Set<Character> VOCALES = Set.of('a', 'e', 'i', 'o', 'u');

    public static void main(String[] args) {
        ComunicadorInterplanetario comunicador = new ComunicadorInterplanetario();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Comunicador Interplanetario");
        System.out.println("Por favor, ingresa tu mensaje:");

        String mensaje = scanner.nextLine();

        // Funciones del comunicador
        comunicador.contarVocales(mensaje);
        comunicador.invertirMensaje(mensaje);
        comunicador.verificarPalindromo(mensaje);

        scanner.close();
    }

    public void contarVocales(String mensaje) {
        int contador = 0;
        for (char letra : mensaje.toLowerCase().toCharArray()) {
            if (VOCALES.contains(letra)) {
                contador++;
            }
        }
        System.out.println("El mensaje contiene un total de " + contador + " vocales.");
    }

    public void invertirMensaje(String mensaje) {
        StringBuilder mensajeInvertido = new StringBuilder(mensaje).reverse();
        System.out.println("Mensaje invertido: " + mensajeInvertido);
    }

    public void verificarPalindromo(String mensaje) {
        String mensajeSinEspacios = mensaje.replaceAll("\\s", "").toLowerCase();
        String mensajeInvertido = new StringBuilder(mensajeSinEspacios).reverse().toString();

        if (mensajeSinEspacios.equals(mensajeInvertido)) {
            System.out.println("El mensaje es un palíndromo.");
        } else {
            System.out.println("El mensaje no es un palíndromo.");
        }
    }
}