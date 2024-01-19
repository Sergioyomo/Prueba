package boletin1;

public class JefeEstacion {
private String NombreCompleto;
private String DNI;
public JefeEstacion(String nombreCompleto, String dNI) {
	NombreCompleto = nombreCompleto;
	DNI = dNI;
}
public String getNombreCompleto() {
	return NombreCompleto;
}
public void setNombreCompleto(String nombreCompleto) {
	NombreCompleto = nombreCompleto;
}
public String getDNI() {
	return DNI;
}
public void setDNI(String dNI) {
	DNI = dNI;
}

public String toString() {
	return "JefeEstacion [NombreCompleto=" + NombreCompleto + ", DNI=" + DNI + "]";
}

	
}
