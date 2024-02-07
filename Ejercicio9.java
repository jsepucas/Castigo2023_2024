import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de elementos para los vectores: ");
        int n = scanner.nextInt();

        // Leer el primer vector
        int[] vector1 = leerVector(n, scanner, 1);
        // Leer el segundo vector
        int[] vector2 = leerVector(n, scanner, 2);

        // Calcular y mostrar el producto escalar
        int producto = calcularProductoEscalar(vector1, vector2);
        System.out.println("El producto escalar de los dos vectores es: " + producto);
    }

    private static int[] leerVector(int n, Scanner scanner, int numeroVector) {
        int[] vector = new int[n];
        System.out.println("Introduce los elementos del vector " + numeroVector + ":");
        for (int i = 0; i < n; i++) {
            vector[i] = scanner.nextInt();
        }
        return vector;
    }

    private static int calcularProductoEscalar(int[] vector1, int[] vector2) {
        int producto = 0;
        for (int i = 0; i < vector1.length; i++) {
            producto += vector1[i] * vector2[i];
        }
        return producto;
    }
}
