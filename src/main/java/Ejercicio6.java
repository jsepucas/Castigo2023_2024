import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Introduce un número entero: ");
            int numero = scanner.nextInt();

            ArrayList<Integer> factoresPrimos = descomponerEnFactoresPrimos(numero);

            if (!factoresPrimos.isEmpty()) {
                System.out.print(numero + " = ");
                System.out.print(factoresPrimos.get(0));
                for (int i = 1; i < factoresPrimos.size(); i++) {
                    System.out.print(" * " + factoresPrimos.get(i));
                }
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }

    private static ArrayList<Integer> descomponerEnFactoresPrimos(int numero) {
        ArrayList<Integer> factores = new ArrayList<>();
        // Extraer factores de 2
        for (; numero % 2 == 0; numero /= 2) {
            factores.add(2);
        }
        // Extraer factores impares
        for (int i = 3; i <= Math.sqrt(numero); i += 2) {
            for (; numero % i == 0; numero /= i) {
                factores.add(i);
            }
        }
        // Si el numero es un primo mayor que 2
        if (numero > 2) {
            factores.add(numero);
        }

        return factores;
    }
}
