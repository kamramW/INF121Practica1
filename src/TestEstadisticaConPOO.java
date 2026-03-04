import java.util.Scanner;

public class TestEstadisticaConPOO {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] datos = new double[10];

        System.out.println("Ingrese 10 numeros:");

        for (int i = 0; i < 10; i++) {
            datos[i] = sc.nextDouble();
        }

        ClaseEstadistica est = new ClaseEstadistica(datos);

        System.out.println("El promedio es: " + est.promedio());
        System.out.println("La desviacion estandar es: " + est.desviacion());
    }
}