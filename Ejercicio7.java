
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();
        scanner.close(); // Cerrar el scanner después de su uso

        ArrayList<Integer> factoresPrimos = descomponerEnFactoresPrimos(numero);

        System.out.print("Descomposición en factores primos de " + numero + " = ");
        for (int i = 0; i < factoresPrimos.size(); i++) {
            System.out.print(factoresPrimos.get(i));
            if (i < factoresPrimos.size() - 1) {
                System.out.print(" * ");
            }
        }
    }

    private static ArrayList<Integer> descomponerEnFactoresPrimos(int numero) {
        ArrayList<Integer> factores = new ArrayList<>();
        // Factorización por 2
        for (; numero % 2 == 0; numero /= 2) {
            factores.add(2);
        }
        // Factorización por impares
        for (int i = 3; i <= Math.sqrt(numero); i += 2) {
            while (numero % i == 0) {
                factores.add(i);
                numero /= i;
            }
        }
        // Si queda un primo grande
        if (numero > 2) {
            factores.add(numero);
        }
        return factores;
    }
}
