import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = leerNumeros();

        if (numeros.isEmpty()) {
            System.out.println("No se introdujeron números.");
            return;
        }

        double media = calcularMedia(numeros);
        int minimo = encontrarMinimo(numeros);
        int maximo = encontrarMaximo(numeros);

        System.out.printf("Media: %.2f\n", media);
        System.out.println("Mínimo: " + minimo);
        System.out.println("Máximo: " + maximo);
    }

    private static ArrayList<Integer> leerNumeros() {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce números enteros (0 para finalizar):");
        while (true) {
            int numero = scanner.nextInt();
            if (numero == 0) {
                break;
            }
            numeros.add(numero);
        }
        return numeros;
    }

    private static double calcularMedia(ArrayList<Integer> numeros) {
        return numeros.stream().mapToInt(Integer::intValue).average().orElse(Double.NaN);
    }

    private static int encontrarMinimo(ArrayList<Integer> numeros) {
        return numeros.stream().min(Integer::compare).orElse(Integer.MAX_VALUE);
    }

    private static int encontrarMaximo(ArrayList<Integer> numeros) {
        return numeros.stream().max(Integer::compare).orElse(Integer.MIN_VALUE);
    }
}
