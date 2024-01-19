package boletin1;

public class Hora {

	private int horas;
	private int minutos;
	private int segundos;

	public Hora(int horas, int minutos, int segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	public void horaActual() {
		System.out.println("Horas introducidas: " + horas + ": " + minutos + ": " + segundos);
	}

	public void horasSumadas(int segundosadd) {
		if ((segundos + segundosadd) / 60 > 0) {
			int minutosadd = (segundos + segundosadd) / 60;
			this.segundos = (segundos + segundosadd) % 60;
			if ((minutos + minutosadd) / 60 > 0) {
				int horasadd = (minutos + minutosadd) / 60;
				this.minutos = (minutos + minutosadd) % 60;
				if((horas + horasadd) / 24 > 0) {
					this.horas = (horas + horasadd) % 24;
				}
				else {
					horas+=horasadd;
				}
			}
			else {
				minutos+=minutosadd;
			}
		} else {
			segundos += segundosadd;
		}
		System.out.println("Horas sumadas: " + horas + ": " + minutos + ": " + segundos);

	}

}
