public class Ejercicio1 {

    public static long calcularSegundos(int anos, int meses, int dias) {
        final short diasPorAno = 365;
        final byte horasPorDia = 24;
        final byte minutosPorHora = 60;
        final short segundosPorMinuto = 60;

        // Calculamos los días adicionales por los meses asumiendo 30 días por mes
        int totalDias = anos * diasPorAno + meses * 30 + dias;

        long segundos = totalDias * horasPorDia * minutosPorHora * segundosPorMinuto;
        return segundos;
    }

    public static void main(String[] args) {
        int anos = 1; // Puedes cambiar esto para probar con diferentes valores
        int meses = 0;
        int dias = 0;
        long segundos = calcularSegundos(anos, meses, dias);
        System.out.println("El numero de segundos en " + anos + " año es: " + segundos);
    }
}