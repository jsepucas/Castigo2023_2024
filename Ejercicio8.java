import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = leerNumeros();
        // Convertir ArrayList a array para procesamiento
        int[] arrayNumeros = numeros.stream().mapToInt(i -> i).toArray();

        if (arrayNumeros.length > 0) {
            double media = calcularMedia(arrayNumeros);
            int minimo = encontrarMinimo(arrayNumeros);
            int maximo = encontrarMaximo(arrayNumeros);

            System.out.println("Media: " + media);
            System.out.println("Mínimo: " + minimo);
            System.out.println("Máximo: " + maximo);
        } else {
            System.out.println("No se introdujeron números.");
        }
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

    private static double calcularMedia(int[] array) {
        double suma = 0;
        for (int valor : array) {
            suma += valor;
        }
        return array.length > 0 ? suma / array.length : 0;
    }

    private static int encontrarMinimo(int[] array) {
        int minimo = Integer.MAX_VALUE;
        for (int valor : array) {
            if (valor < minimo) {
                minimo = valor;
            }
        }
        return minimo;
    }

    private static int encontrarMaximo(int[] array) {
        int maximo = Integer.MIN_VALUE;
        for (int valor : array) {
            if (valor > maximo) {
                maximo = valor;
            }
        }
        return maximo;
    }
}
