package boletin1;

public class Bombilla_Main {

	public static void main(String[] args) {
        Bombilla bombilla1 = new Bombilla();
        Bombilla bombilla2 = new Bombilla();
        Bombilla bombilla3 = new Bombilla();

        bombilla1.encender();
        bombilla2.encender();

        Bombilla.fundirFusibles();

        bombilla1.encender();
        bombilla2.encender();

        Bombilla.repararFusibles();

        bombilla1.encender();
        bombilla2.encender();

        bombilla1.apagar();
        System.out.println("Estado de las bombillas:");
        System.out.println("Bombilla 1: " + (bombilla1.estaEncendida() ? "Encendida" : "Apagada"));
        System.out.println("Bombilla 2: " + (bombilla2.estaEncendida() ? "Encendida" : "Apagada"));
        System.out.println("Bombilla 3: " + (bombilla3.estaEncendida() ? "Encendida" : "Apagada"));
    }
}

