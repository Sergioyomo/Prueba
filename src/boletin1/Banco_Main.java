package boletin1;

public class Banco_Main {

	 public static void main(String[] args) {
	        Banco banco1 = new Banco("Banco A");

	        banco1.ingresarDinero(1000);
	        banco1.sacarDinero(500);

	        banco1.mostrarInformacion();

	        Banco banco2 = new Banco("Banco B");
	        banco2.mostrarInformacion();
	    }
	}
