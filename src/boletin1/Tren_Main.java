package boletin1;

public class Tren_Main {

	public static void main(String[] args) {
		Maquinista maquinista= new Maquinista("Victor", "11111111A", 1000.07f, "peon");
		System.out.println(maquinista);
		
		Mecanico mecanico= new Mecanico("Alfed", 1234567789, "freno");
		System.out.println(mecanico);
		
		JefeEstacion jefeestacion= new JefeEstacion("Sergio", "13334353M");
		System.out.println(jefeestacion);
		
		Vagones vagon1=new Vagones (145.7f, 40f, "Personas");
		System.out.println(vagon1);
		
		Vagones vagon2=new Vagones (125.5f, 39.9f, "Animales");
		System.out.println(vagon2);
		
		Locomotoras locomotora=new Locomotoras ("183749NMU", 200.9f, 2023, mecanico);
		System.out.println(locomotora);
		
		Tren tren=new Tren (locomotora, maquinista);
		tren.addVagon(vagon1);
		tren.addVagon(vagon2);
		System.out.println(tren);
		
	}

}
