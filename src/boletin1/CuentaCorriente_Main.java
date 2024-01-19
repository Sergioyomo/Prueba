package boletin1;

public class CuentaCorriente_Main {

	public static void main(String[] args) {
        CuentaCorriente cuenta1 = new CuentaCorriente("Juan Pérez", "12345678A", "Banco XYZ");
        CuentaCorriente cuenta2 = new CuentaCorriente(1000);
        Banco banco1 = new Banco("Banco jkl");
        
        cuenta1.cambiarBanco(banco1);

        cuenta1.ingresarDinero(500);
        cuenta2.sacarDinero(200);

        cuenta1.mostrarInformacion();
        cuenta2.mostrarInformacion();
        cuenta1.cambiarNombreBanco("Nuevo Banco ABC");
        cuenta1.mostrarInformacion();
        cuenta2.mostrarInformacion();
        
    }
	
}