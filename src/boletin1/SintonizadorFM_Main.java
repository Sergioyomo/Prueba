package boletin1;

public class SintonizadorFM_Main {

	public static void main(String[] args) {
        SintonizadorFM sintonizador = new SintonizadorFM();

        sintonizador.display();

        for (int i = 0; i < 5; i++) {
            sintonizador.subir();
            sintonizador.display();
        }

        for (int i = 0; i < 5; i++) {
            sintonizador.bajar();
            sintonizador.display();
        }
    }
}
