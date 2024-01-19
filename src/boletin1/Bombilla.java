package boletin1;

public class Bombilla {
    private boolean encendida;
    private static boolean activo = true;

    public Bombilla() {
        this.encendida = false;
    }

    public boolean estaEncendida() {
        return encendida;
    }

    public void encender() {
        if (Bombilla.estaActivo()) {
            encendida = true;
            System.out.println("Bombilla encendida");
        } else {
            System.out.println("No se puede encender la bombilla. Fusibles fundidos.");
        }
    }

    public void apagar() {
        encendida = false;
        System.out.println("Bombilla apagada");
    }


    public static boolean estaActivo() {
        return activo;
    }

    public static void fundirFusibles() {
        activo = false;
        System.out.println("Fusibles fundidos. Todas las bombillas apagadas.");
    }

    public static void repararFusibles() {
        activo = true;
        System.out.println("Fusibles reparados. Restaurando estado de las bombillas.");
    }
}
