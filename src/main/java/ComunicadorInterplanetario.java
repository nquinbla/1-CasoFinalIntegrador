import java.util.Scanner;

public class ComunicadorInterplanetario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Comunicador Interplanetario");
        System.out.println("Por favor, ingresa tu mensaje:");

        String mensaje = scanner.nextLine();

        // Funciones del comunicador
        contarVocales(mensaje);
        invertirMensaje(mensaje);
        verificarPalindromo(mensaje);

        scanner.close();
    }

    public static void contarVocales(String mensaje) {
        int contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;

        for (char letra : mensaje.toLowerCase().toCharArray()) {
            switch (letra) {
                case 'a':
                    contadorA++;
                    break;
                case 'e':
                    contadorE++;
                    break;
                case 'i':
                    contadorI++;
                    break;
                case 'o':
                    contadorO++;
                    break;
                case 'u':
                    contadorU++;
                    break;
            }
        }

        int totalVocales = contadorA + contadorE + contadorI + contadorO + contadorU;
        System.out.println("El mensaje contiene un total de " + totalVocales + " vocales:");
        System.out.println(" - A: " + contadorA);
        System.out.println(" - E: " + contadorE);
        System.out.println(" - I: " + contadorI);
        System.out.println(" - O: " + contadorO);
        System.out.println(" - U: " + contadorU);
    }

    public static void invertirMensaje(String mensaje) {
        StringBuilder mensajeInvertido = new StringBuilder(mensaje).reverse();
        System.out.println("Mensaje invertido: " + mensajeInvertido);
    }

    public static void verificarPalindromo(String mensaje) {
        String mensajeSinEspacios = mensaje.replaceAll("\\s", "").toLowerCase();
        String mensajeInvertido = new StringBuilder(mensajeSinEspacios).reverse().toString();

        if (mensajeSinEspacios.equals(mensajeInvertido)) {
            System.out.println("El mensaje es un palíndromo.");
        } else {
            System.out.println("El mensaje no es un palíndromo.");
        }
    }
}
