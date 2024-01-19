package boletin1;

public class SintonizadorFM {
    private static final double FRECUENCIA_MINIMA = 80.0;
    private static final double FRECUENCIA_MAXIMA = 108.0;
    private static final double PASO = 0.5;

    private double frecuenciaActual;

    public SintonizadorFM() {
        this.frecuenciaActual = 80.0; 
    }

    public void subir() {
        frecuenciaActual += PASO;
        ajustarFrecuencia();
    }

    public void bajar() {
        frecuenciaActual -= PASO;
        ajustarFrecuencia();
    }

    public void display() {
        System.out.println("Frecuencia actual: " + frecuenciaActual + " MHz");
    }

    private void ajustarFrecuencia() {
        if (frecuenciaActual < FRECUENCIA_MINIMA) {
            frecuenciaActual = FRECUENCIA_MAXIMA;
        } else if (frecuenciaActual > FRECUENCIA_MAXIMA) {
            frecuenciaActual = FRECUENCIA_MINIMA;
        }
    }
}