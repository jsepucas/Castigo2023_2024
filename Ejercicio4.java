import java.util.Scanner;

public class Ejercicio4
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        // Inicializamos min y max con valores que serán reemplazados después de la primera entrada
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        System.out.println("Introduce números enteros positivos (un número negativo para finalizar):");

        while (true) {
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                if (numero < 0) {
                    // Romper el ciclo si el número es negativo
                    break;
                }
                if (numero < min) {
                    min = numero;
                }
                if (numero > max) {
                    max = numero;
                }
            } else {
                System.out.println("Por favor, introduce un número entero.");
                scanner.next(); // Limpiar el buffer del scanner
            }
        }
