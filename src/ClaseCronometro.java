public class ClaseCronometro {

    // Atributos privados (encapsulación)
    private long inicia;
    private long finaliza;

    //  Constructor sin argumentos
    public ClaseCronometro() {
        // Se inicializa con la hora actual en ms
        this.inicia = System.currentTimeMillis();
    }

    //  Reinicia el cronómetro
    public void inicia() {
        this.inicia = System.currentTimeMillis();
    }

    // Detiene el cronómetro
    public void detener() {
        this.finaliza = System.currentTimeMillis();
    }

    //  tiempo transcurrido
    public long lapsoDeTiempo() {
        return finaliza - inicia;
    }

    //  Getters (solo lectura)
    public long getInicia() {
        return inicia;
    }

    public long getFinaliza() {
        return finaliza;
    }
}