import java.util.ArrayList;

public class Ejercicio3 {

    public static int[] encontrarMultiplos(int begin, int end) {
        ArrayList<Integer> multiplos = new ArrayList<>();
        for (int i = begin; i <= end; i++) {
            if (i % 5 == 0) {
                multiplos.add(i);
            }
        }

        return multiplos.stream().mapToInt(i -> i).toArray();
    }

    public static int sumarValores(int[] valores) {
        int suma = 0;
        for (int valor : valores) {
            suma += valor;
        }
        return suma;
    }

    public static void main(String[] args) {
        int[] multiplos = encontrarMultiplos(1, 100);
        int suma = sumarValores(multiplos);

        System.out.println("Múltiplos de 5 entre 1 y 100:");
        for (int multiplo : multiplos) {
            System.out.println(multiplo);
        }
        System.out.println("La suma de los múltiplos es: " + suma);
    }
}