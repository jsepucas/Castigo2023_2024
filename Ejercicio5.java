public class Ejercicio5 {

    public static void main(String[] args) {
        int N = 10; // Generar tablas de multiplicar para los números del 0 al 9
        imprimirTablasDeMultiplicar(N);
    }

    private static void imprimirTablasDeMultiplicar(int N) {
        for (int i = 0; i < N; i++) {
            System.out.println("Tabla del " + i + ":");
            for (int j = 0; j < 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println(); // Línea en blanco para separar las tablas
        }
    }
}
