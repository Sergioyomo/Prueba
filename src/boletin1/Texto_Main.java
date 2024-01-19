package boletin1;

public class Texto_Main {

	public static void main(String[] args) {
	        Texto miTexto = new Texto();
	        
	        miTexto.agregarCaracterAlFinal('H');
	        miTexto.agregarCadenaAlFinal("ola, ");
	        miTexto.agregarCaracterAlPrincipio('!');
	        
	        System.out.println("Texto: " + miTexto.obtenerTexto());
	        System.out.println("Número de vocales: " + miTexto.contarVocales());
	    }
	}

