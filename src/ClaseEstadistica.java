public class ClaseEstadistica {
    private double[] datos;

    // constructor
    public ClaseEstadistica(double[] datos) {
        this.datos = datos;
    }

    // metodo promedio
    public double promedio() {
        double suma = 0;

        for (double x : datos) {
            suma += x;
        }

        return suma / datos.length;
    }

    // metodo desviación estándar
    public double desviacion() {
        double prom = promedio();
        double suma = 0;

        for (double x : datos) {
            suma += Math.pow(x - prom, 2);
        }

        return Math.sqrt(suma / (datos.length - 1));
    }
}