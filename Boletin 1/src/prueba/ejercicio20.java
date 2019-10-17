package prueba;

import java.util.Scanner;
public class ejercicio20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int altura;
		int base;
		int area;
		
		
		System.out.println("Introduce la base del triángulo");
		base = scan.nextInt();
		System.out.println("Introduce la altura del triángulo");
		altura=scan.nextInt();
		
		area=(base*altura)/2;
		System.out.println("El triángulo de base " + base + "cm y altura " + altura + "cm tiene un área de " + area + "cm");

	}

}
