package boletin1;

public class Maquinista {
	private String nombreCompleto;
	private String dni;
	private float sueldoMensual;
	private String rango;
	
	public Maquinista(String nombreCompleto, String dni, float sueldoMensual, String rango) {
		this.nombreCompleto = nombreCompleto;
		this.dni = dni;
		this.sueldoMensual = sueldoMensual;
		this.rango = rango;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public float getSueldoMensual() {
		return sueldoMensual;
	}

	public void setSueldoMensual(float sueldoMensual) {
		this.sueldoMensual = sueldoMensual;
	}

	public String getRango() {
		return rango;
	}

	public void setRango(String rango) {
		this.rango = rango;
	}

	public String toString() {
		return "Maquinista [nombreCompleto=" + nombreCompleto + ", dni=" + dni + ", sueldoMensual=" + sueldoMensual
				+ ", rango=" + rango + "]";
	}

}