package boletin1;

public class CuentaCorriente {
	private double saldo;
	private double limiteDescubierto;
	public String nombreTitular;
	protected String dniTitular;
	private static String nombreBanco;
	private Banco banco;

	public CuentaCorriente(String nombreTitular, String dniTitular, String nombreBanco2) {
		this.saldo = 0;
		this.limiteDescubierto = -50;
		this.nombreTitular = nombreTitular;
		this.dniTitular = dniTitular;
		nombreBanco = nombreBanco2;
		this.banco = null;
	}

	public CuentaCorriente(double saldoInicial) {
		this.saldo = saldoInicial;
		this.limiteDescubierto = 0;
	}

	public CuentaCorriente(double saldoInicial, double limiteDescubierto, String dniTitular, String nombreBanco2) {
		this.saldo = saldoInicial;
		this.limiteDescubierto = limiteDescubierto;
		this.dniTitular = dniTitular;
		nombreBanco = nombreBanco2;
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
		System.out.println("Banco: " + nombreBanco);
		if (banco != null) {
			banco.MostrarBanco();
		}
	}

	public void cambiarNombreBanco(String nuevoNombre) {
		nombreBanco = nuevoNombre;
		System.out.println("Nombre del banco modificado a: " + nuevoNombre);
	}

	public void cambiarBanco(Banco nuevoBanco) {
		this.banco = nuevoBanco;
		System.out.println("Cuenta vinculada al banco: " + nuevoBanco.getnombreBanco());
	}
}
