import java.util.Random;

public class TestCronometro {

    //  Algoritmo de ordenación por selección
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // intercambio
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {

        int n = 100000;
        int[] datos = new int[n];
        Random rand = new Random();

        // números aleatorios con tope de 100000
        for (int i = 0; i < n; i++) {
            datos[i] = rand.nextInt(100000);
        }

        // crear cronómetro
        ClaseCronometro cron = new ClaseCronometro();

        cron.inicia();           //  start
        selectionSort(datos);    // ordenar
        cron.detener();          //  stop

        // mostrar tiempo
        System.out.println("Tiempo transcurrido: "
                + cron.lapsoDeTiempo() + " ms");
    }
}