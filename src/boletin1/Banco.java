package boletin1;

public class Banco {
    private String nombre;
    private double capital;
    private String direccionCentral;
    private double saldo;
    private double limiteDescubierto;
    private String nombreTitular;
    private String dniTitular;

    public Banco(String nombre) {
        this.nombre = nombre;
        this.capital = 5.2;
    }

    public void modificarNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
        System.out.println("Nombre del banco modificado a: " + nuevoNombre);
    }

    public void modificarCapital(double nuevoCapital) {
        this.capital = nuevoCapital;
        System.out.println("Capital del banco modificado a: " + nuevoCapital);
    }

    public void MostrarBanco() {
        System.out.println("Nombre del banco: " + nombre);
        System.out.println("Capital: " + capital + " millones de euros");
        System.out.println("Dirección central: " + direccionCentral);
    }


    public Banco(String nombreTitular, String dniTitular) {
        this.saldo = 0;
        this.limiteDescubierto = -50;
        this.nombreTitular = nombreTitular;
        this.dniTitular = dniTitular;
    }

    public Banco(double saldoInicial, double limiteDescubierto, String dniTitular) {
        this.saldo = saldoInicial;
        this.limiteDescubierto = limiteDescubierto;
        this.dniTitular = dniTitular;
    }

    public boolean sacarDinero(double cantidad) {
        if (cantidad <= (saldo + limiteDescubierto)) {
            saldo -= cantidad;
            System.out.println("Operación realizada. Nuevo saldo: " + saldo);
            return true;
        } else {
            System.out.println("No es posible realizar la operación. Fondos insuficientes.");
            return false;
        }
    }

    public void ingresarDinero(double cantidad) {
        saldo += cantidad;
        System.out.println("Operación realizada. Nuevo saldo: " + saldo);
    }

    public void mostrarInformacion() {
        System.out.println("Titular: " + nombreTitular);
        System.out.println("DNI: " + dniTitular);
        System.out.println("Saldo: " + saldo);
        System.out.println("Límite de descubierto: " + limiteDescubierto);
    }

    public String getnombreBanco () {
    	return this.nombre;
    	
    }
}

