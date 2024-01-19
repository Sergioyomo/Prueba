package boletin1;

import java.util.Arrays;

public class Tren {

	private Locomotoras locomotoras;
	private Vagones vagones[];
	private final int numVagones=5;
	private Maquinista maquinista;
	private int indiceVagon;
	
	public Tren(Locomotoras locomotoras, Maquinista maquinista) {
		this.locomotoras = locomotoras;
		this.vagones = new Vagones[this.numVagones];
		this.maquinista = maquinista;
		
		this.indiceVagon=0;
		
	}
	public Locomotoras getLocomotoras() {
		return locomotoras;
	}
	public void setLocomotoras(Locomotoras locomotoras) {
		this.locomotoras = locomotoras;
	}
	public Vagones[] getVagones() {
		return vagones;
	}
	public void addVagon(Vagones vagones) {
		if(this.indiceVagon +1 < this.numVagones) {
			this.vagones[this.indiceVagon] = vagones;
			this.indiceVagon++;
		}
		else {
			System.out.println("No caben mas vagones.");
		}
	}
	public Maquinista getMaquinista() {
		return maquinista;
	}
	public void setMaquinista(Maquinista maquinista) {
		this.maquinista = maquinista;
	}
	public String toString() {
		return "Tren [locomotoras=" + locomotoras + ", vagones=" + Arrays.toString(vagones) + ", maquinista="
				+ maquinista + "]";
	}
	
}
