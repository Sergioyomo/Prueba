package boletin1;

public class Locomotoras {

	private String matricula;
	private float potenciaMotor;
	private int añoFabricacion;
	private Mecanico mecanico;
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public float getPotenciaMotor() {
		return potenciaMotor;
	}
	public void setPotenciaMotor(float potenciaMotor) {
		this.potenciaMotor = potenciaMotor;
	}
	public int getAñoFabricacion() {
		return añoFabricacion;
	}
	public void setAñoFabricacion(int añoFabricacion) {
		this.añoFabricacion = añoFabricacion;
	}
	public Mecanico getMecanico() {
		return mecanico;
	}
	public void setMecanico(Mecanico mecanico) {
		this.mecanico = mecanico;
	}
	public Locomotoras(String matricula, float potenciaMotor, int añoFabricacion, Mecanico mecanico) {
		this.matricula = matricula;
		this.potenciaMotor = potenciaMotor;
		this.añoFabricacion = añoFabricacion;
		this.mecanico = mecanico;
	}
	public String toString() {
		return "Locomotoras [matricula=" + matricula + ", potenciaMotor=" + potenciaMotor + ", añoFabricacion="
				+ añoFabricacion + ", mecanico=" + mecanico + "]";
	}
	
}
