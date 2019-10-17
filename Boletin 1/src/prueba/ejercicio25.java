package prueba;

import java.util.Scanner;

public class ejercicio25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a;
		int b;
		float h;
		
		System.out.print("Introduce el primer cateto: ");
		a = scan.nextInt();
		System.out.print("Introduce el segundo cateto: ");
		b = scan.nextInt();
		
		h = (float) Math.sqrt(a*a+b*b);
		
		System.out.print("La hipotenusa es: " + h);

	}

}

