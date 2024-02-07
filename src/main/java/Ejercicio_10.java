import java.util.Random;
import java.util.Scanner;

public class Ejercicio_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la dimensión de la matriz cuadrada: ");
        int n = scanner.nextInt();

        generarYMostrarMatrizSimetrica(n);
    }

    private static void generarYMostrarMatrizSimetrica(int n) {
        int[][] matriz = new int[n][n];
        Random random = new Random();

        // Rellenar la matriz asegurando la simetría
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) { // Comenzar en j=i para asegurar simetría
                int valor = random.nextInt(100); // Números aleatorios entre 0 y 99
                matriz[i][j] = valor;
                matriz[j][i] = valor; // Asegurar simetría
            }
        }

        // Imprimir la matriz
        System.out.println("Matriz simétrica:");
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
