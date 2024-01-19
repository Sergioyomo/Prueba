package boletin1;

public class Texto {
    private static final int LONGITUD_MAXIMA = 100;
    private StringBuilder cadena;
    
    public Texto() {
        this.cadena = new StringBuilder();
    }
    
    public void agregarCaracterAlPrincipio(char caracter) {
        if (cadena.length() < LONGITUD_MAXIMA) {
            cadena.insert(0, caracter);
        } else {
            System.out.println("No hay espacio disponible para agregar más caracteres.");
        }
    }
    
    public void agregarCaracterAlFinal(char caracter) {
        if (cadena.length() < LONGITUD_MAXIMA) {
            cadena.append(caracter);
        } else {
            System.out.println("No hay espacio disponible para agregar más caracteres.");
        }
    }
    
    public void agregarCadenaAlPrincipio(String texto) {
        if (cadena.length() + texto.length() <= LONGITUD_MAXIMA) {
            cadena.insert(0, texto);
        } else {
            System.out.println("No hay espacio disponible para agregar más texto.");
        }
    }
    
    public void agregarCadenaAlFinal(String texto) {
        if (cadena.length() + texto.length() <= LONGITUD_MAXIMA) {
            cadena.append(texto);
        } else {
            System.out.println("No hay espacio disponible para agregar más texto.");
        }
    }
    
    public int contarVocales() {
        int contador = 0;
        String texto = cadena.toString().toLowerCase();
        
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contador++;
            }
        }
        
        return contador;
    }
    
    public String obtenerTexto() {
        return cadena.toString();
    }
    
}
