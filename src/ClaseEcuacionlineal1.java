public class ClaseEcuacionlineal1 {

    private double a, b, c, d, e, f;

    // constructor
    public ClaseEcuacionlineal1(double a, double b, double c,
                                double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    //  verifica si hay solución
    public boolean tieneSolucion() {
        return (a * d - b * c) != 0;
    }

    //  calcula x
    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    //  calcula y
    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }
}
