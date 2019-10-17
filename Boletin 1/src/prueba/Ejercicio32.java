package prueba;

import java.util.Scanner;

public class Ejercicio32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float m;
		float km;
		
		System.out.print("Dime la velocidad en Km/h: ");
		km=scan.nextFloat();
		
		m = km*1000/(60*60);
		
		System.out.printf("%s Km/h es equivalente a %s m/s\n",km,m);

	}

}
