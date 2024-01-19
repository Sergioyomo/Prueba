package boletin1;

import java.util.Scanner;

public class Horas_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Dime las horas");
int horas=sc.nextInt();
System.out.println("Dime los minutos");
int minutos=sc.nextInt();
System.out.println("Dime los segundos");
int segundos=sc.nextInt();
System.out.println("Dime los segundos que le sumaran a las horas");
int sumar=sc.nextInt();

Hora h=new Hora(horas, minutos, segundos);
h.horaActual();
h.horasSumadas(sumar);
sc.close();
		
	}

}
