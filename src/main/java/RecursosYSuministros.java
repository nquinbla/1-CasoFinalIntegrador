import java.util.Scanner;

public class RecursosYSuministros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Gestor de Recursos");
        System.out.println("Ingrese el nivel inicial de agua (en litros): ");
        double nivelAgua = scanner.nextDouble();

        System.out.println("Ingrese el nivel inicial de alimentos (en kilogramos): ");
        double nivelAlimentos = scanner.nextDouble();

