package prueba;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio28 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat formato = new DecimalFormat("#.000");
		
		float radio;
		float area;
		float longitud;
		float volumen;
		
		System.out.print("Introduce el valor del radio: ");
		radio = scan.nextFloat();
		
		longitud = (float) (2*radio*Math.PI);
		area=(float) (Math.pow(radio, 2)*Math.PI);
		volumen = (float) (Math.pow(radio,3)*Math.PI*(4/3));
		
		System.out.println("\nBienvenido al programa donde todo sale redondo!");
		System.out.println("-------------------------------------------------");
		
		System.out.println("La longitud de la circunferencia es de: " + formato.format(longitud) + " cm");
		System.out.println("El área de la circunferencia es de: " + formato.format(area) + " cm2");
		System.out.println("El volumen de la circunferencia es de: " + formato.format(volumen) + " cm3");

	}

}
