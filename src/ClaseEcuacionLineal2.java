public class ClaseEcuacionLineal2 {

    private double a;
    private double b;
    private double c;

    // Constructor
    public ClaseEcuacionLineal2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Discriminante
    public double getDiscriminante() {
        return b * b - 4 * a * c;
    }

    // Raíz 1
    public double getRaiz1() {
        double d = getDiscriminante();
        return (-b + Math.sqrt(d)) / (2 * a);
    }

    // Raíz 2
    public double getRaiz2() {
        double d = getDiscriminante();
        return (-b - Math.sqrt(d)) / (2 * a);
    }
}
