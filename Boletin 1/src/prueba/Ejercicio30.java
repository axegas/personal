package prueba;

import java.util.Scanner;

public class Ejercicio30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float primer;
		float trimestre;
		float segundo;
		
		System.out.print("Introduce la nota del primer examen: ");
		primer=scan.nextFloat();
		System.out.print("Que nota quieres sacar en el trimestre? ");
		trimestre=scan.nextFloat();
		
		segundo = (float) ((trimestre - (primer*0.4))/0.6);
		
		System.out.println("Para tener un " + trimestre + " en el trimestre necesitas sacar un " + segundo + " en el segundo examen");
		

	}

}
